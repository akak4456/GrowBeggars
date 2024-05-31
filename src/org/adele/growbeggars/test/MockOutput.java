package org.adele.growbeggars.test;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.adele.growbeggars.gameoutput.GameOutput;

public class MockOutput implements GameOutput{
	public static Set<String> formatStrs;
	
	public void changeLang(Map<String, String> langData) {
		formatStrs = new HashSet<>(langData.values());
	}
	@Override
	public void printf(String format, Object... args) {
		formatStrs.remove(format);
		System.out.printf(format, args);
	}

	@Override
	public void printerr(String x) {
		System.out.println(x);
	}

	@Override
	public void println(String x) {
		System.out.println(x);
	}

	@Override
	public void println() {
		System.out.println();
	}

}
