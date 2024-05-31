package org.adele.growbeggars.model;

public abstract class AutoMoneyMachine {
	/*
	 * id 는 모든 AutoMoneyMachine 에 대해서 유일해야 함에 주의하기
	 */
	protected Id id;
	protected String name;
	protected double mul;
	protected int buyPrice;
	protected int upgradePrice;

	AutoMoneyMachine(Id id, String name, double mul, int buyPrice, int upgradePrice) {
		this.id = id;
		this.name = name;
		this.mul = mul;
		this.buyPrice = buyPrice;
		this.upgradePrice = upgradePrice;
	}
	
	public Id getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getMul() {
		return mul;
	}
	
	public int getBuyPrice() {
		return buyPrice;
	}
	
	public int getUpgradePrice() {
		return upgradePrice;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMul(double mul) {
		this.mul = mul;
	}

	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}

	public void setUpgradePrice(int upgradePrice) {
		this.upgradePrice = upgradePrice;
	}
	
	public static final class Id {
		private String idValue;
		
		public Id(String idValue) {
			this.idValue = idValue;
		}
		
		@Override
		public boolean equals(Object o) {
			if(o instanceof Id) {
				Id otherId = (Id)o;
				if(otherId.idValue != null && otherId.idValue.equals(this.idValue)) {
					return true;
				}
			}
			return false;
		}
	}

}
