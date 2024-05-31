package org.adele.growbeggars.gameoutput;

public interface GameOutput {
	void printf(String format, Object... args);
	
	void printerr(String x);
	
	void println(String x);
	
	void println();
}
