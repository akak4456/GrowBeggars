package org.adele.growbeggars.test;

import org.adele.growbeggars.ManageBeggar;
import org.adele.growbeggars.model.Beggar;

public class ManageBeggarTest {
	private static Beggar beggar;
	private static ManageBeggar manageBeggar;
	
	public static void main(String[] args) {
		addExpTest();
		addExpAndLevelUpTest();
		addManyExpAndLevelUpTest();
	}
	private static void beforeSetup() {
		beggar = new Beggar();
		manageBeggar = new ManageBeggar(beggar);
	}
	private static void addExpTest() {
		beforeSetup();
		boolean result = manageBeggar.addExp(30);
		if(!result && beggar.getCurExp() == 30) {
			System.out.println("addExpTest() is correct.");
		} else {
			System.out.println("addExpTest() is wrong. beggar.getCurHp()="+beggar.getCurExp());
		}
	}
	
	private static void addExpAndLevelUpTest() {
		beforeSetup();
		boolean result = manageBeggar.addExp(80);
		if(result && beggar.getLevel() == 2 && beggar.getCurExp() == 30) {
			System.out.println("addExpAndLevelUpTest() is correct.");
		}
	}
	
	private static void addManyExpAndLevelUpTest() {
		beforeSetup();
		boolean result = manageBeggar.addExp(300);
		if(result && beggar.getCurExp() < beggar.getRequireExp()) {
			System.out.println("addManyExpAndLevelUpTest() is correct.");
		}
	}
}
