package org.adele.growbeggars.controller.output;

public interface GameOutput {
	void printf(String format, Object... args);
	
	void printerr(String x);
	
	void println(String x);
	
	void println();
}
