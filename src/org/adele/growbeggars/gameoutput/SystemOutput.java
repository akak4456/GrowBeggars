package org.adele.growbeggars.gameoutput;

public class SystemOutput implements GameOutput {

	@Override
	public void printf(String format, Object... args) {
		System.out.printf(format, args);
	}

	@Override
	public void printerr(String x) {
		System.err.println(x);
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
