package org.adele.growbeggars.gameinput;

import java.util.Scanner;

public class ScannerInput implements GameInput {
	
	private Scanner sc;
	
	public ScannerInput() {
		sc = new Scanner(System.in);
	}

	@Override
	public int nextInt() {
		return Integer.parseInt(sc.nextLine());
	}

	@Override
	public String nextLine() {
		return sc.nextLine();
	}

}
