package org.adele.growbeggars.test;

import org.adele.growbeggars.gameinput.GameInput;

public class MockInput implements GameInput {
	
	private int nextIntVal;
	private String nextVal;
	private String nextLineVal;
	
	public MockInput() {
		nextIntVal = 1;
		nextVal = "Y";
		nextLineVal = "Y";
	}

	@Override
	public int nextInt() {
		return nextIntVal;
	}

	@Override
	public String nextLine() {
		return nextLineVal;
	}

}
