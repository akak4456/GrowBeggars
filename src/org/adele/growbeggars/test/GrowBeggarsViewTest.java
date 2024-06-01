package org.adele.growbeggars.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;

import org.adele.growbeggars.model.Beggar;
import org.adele.growbeggars.view.GrowBeggarsView;

/*
 * 리플랙션을 이용해서
 * GrowBeggarsView 의 public 메서드를 최대한 테스트 한다.
 * 한국어, 영어가 정상적으로 뜨는지 확인하는 것이 목표이며
 * 메시지 자체는 중요시 하지 않는다.
 */
public class GrowBeggarsViewTest {
	private static GrowBeggarsView view;
	private static MockInput input;
	private static MockOutput output;
	
	private static ArrayList<String> stringList;
	private static ArrayList<Integer> integerList;
	private static ArrayList<Double> doubleList;
	
	private static ArrayList<String> emptyStringList;
	private static ArrayList<Integer> emptyIntegerList;
	private static ArrayList<Double> emptyDoubleList;
	
	private static ArrayList<String> skipMethodName;
	
	private static Beggar tempBeggar;

	public static void main(String[] args) {
		input = new MockInput();
		output = new MockOutput();
		view = new GrowBeggarsView(input, output);
		
		tempBeggar = new Beggar();
		tempBeggar.init();
		tempBeggar.setName("조승효");
		tempBeggar.setAge(20);
		
		stringList = new ArrayList<String>();
		stringList.add("물건1");
		stringList.add("물건2");
		
		integerList = new ArrayList<Integer>();
		integerList.add(10);
		integerList.add(20);
		
		doubleList = new ArrayList<Double>();
		doubleList.add(10.0);
		doubleList.add(20.0);
		
		emptyStringList = new ArrayList<String>();
		emptyIntegerList = new ArrayList<Integer>();
		emptyDoubleList = new ArrayList<Double>();
		
		skipMethodName = new ArrayList<>();
		skipMethodName.add("changeLang");
		skipMethodName.add("initLang");
		skipMethodName.add("getLangData");
		test(GrowBeggarsView.LANG_KO);
	}
	
	private static void test(String langCd) {
		output.changeLang(view.getLangData(langCd));
		view.changeLang(langCd);
		testInner();
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("현재까지 남은 포맷 갯수: " + output.formatStrs.size());
		for(String str : output.formatStrs) {
			System.out.println(str);
		}
	}
	
	private static void testInner() {
		Method[] methods = view.getClass().getDeclaredMethods();
		for(Method method : methods) {
			Parameter[] parameters = method.getParameters();
			if(Modifier.isPrivate(method.getModifiers())) {
				continue;
			}
			if(skipMethodName.contains(method.getName())) {
				continue;
			}
			System.out.print(method.getName() + "(");
			for(int i=0; i < parameters.length; i++) {
				System.out.print(parameters[i].getParameterizedType().getTypeName());
				if(i < parameters.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println(")");
			ArrayList<ArrayList<Object>> values = new ArrayList<>();
			for(Parameter parameter: parameters) {
				values.add(generateParameterValue(method.getName(), parameter));
			}
			callMethodUsingValues(method, new ArrayList<>(), values);
			System.out.println("\n--------------------------------------------------");
		}
	}
	
	private static ArrayList<Object> generateParameterValue(String methodName, Parameter parameter) {
		ArrayList<Object> ret = new ArrayList<>();
		switch(parameter.getParameterizedType().getTypeName()) {
			case "boolean" :
				ret.add(true);
				ret.add(false);
				break;
			case "int" :
				ret.add(1);
				break;
			case "java.lang.String":
				ret.add("adele");
				break;
			case "double":
				ret.add(1.0);
				break;
			case "java.util.ArrayList<java.lang.String>":
				ret.add(stringList);
				break;
			case "java.util.ArrayList<java.lang.Double>":
				ret.add(doubleList);
				break;
			case "java.util.ArrayList<java.lang.Integer>":
				ret.add(integerList);
				break;
			case "long":
				ret.add(10000);
				break;
			case "org.adele.growbeggars.model.Beggar":
				ret.add(tempBeggar);
				break;
			default:
				throw new IllegalArgumentException();
		}
		return ret;
	}
	
	private static void callMethodUsingValues(Method method, ArrayList<Object> curParameters, ArrayList<ArrayList<Object>> values) {
		if(curParameters.size() == values.size()) {
			try {
				method.invoke(view, curParameters.toArray());
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			return;
		}
		
		for(Object value: values.get(curParameters.size())) {
			curParameters.add(value);
			callMethodUsingValues(method, curParameters, values);
			curParameters.remove(curParameters.size() - 1);
		}
	}
}
