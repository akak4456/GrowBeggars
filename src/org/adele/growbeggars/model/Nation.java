package org.adele.growbeggars.model;

/*
 * 나라
 */
public class Nation extends AutoMoneyMachine {

	public Nation(Id id, String name, double mul, int buyPrice, int upgradePrice) {
		super(id, name, mul, buyPrice, upgradePrice);
	}
}