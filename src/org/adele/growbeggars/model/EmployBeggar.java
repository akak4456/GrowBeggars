package org.adele.growbeggars.model;

/*
 * 고용된 거지
 */
public class EmployBeggar extends AutoMoneyMachine {

	public EmployBeggar(Id id, String name, double mul, int buyPrice, int upgradePrice) {
		super(id, name, mul, buyPrice, upgradePrice);
	}
}