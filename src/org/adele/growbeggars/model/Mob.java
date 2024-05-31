package org.adele.growbeggars.model;


public class Mob {
	private Id id;
	private String name;
	private int hp;
	private double evasionRate; // 회피율
	private int hitMinPoint;// 최소공격력
	private int hitMaxPoint;// 최대공격력
	private int earnMinMoney; // 벌 수 있는 최소 돈
	private int earnMaxMoney; // 벌 수 있는 최대 돈
	private int earnExp;// 벌 수 있는 경험치
	private int loseExp; // 질 때 잃을 수 있는 경험치
	
	public Mob(Mob.Id id, String name, int hp, double evasionRate, int hitMinPoint, int hitMaxPoint, int earnMinMoney, int earnMaxMoney, int earnExp, int loseExp) {
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.evasionRate = evasionRate;
		this.hitMinPoint = hitMinPoint;
		this.hitMaxPoint = hitMaxPoint;
		this.earnMinMoney = earnMinMoney;
		this.earnMaxMoney = earnMaxMoney;
		this.earnExp = earnExp;
		this.loseExp = loseExp;
	}
	
	
	public Id getId() {
		return id;
	}


	public void setId(Id id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public double getEvasionRate() {
		return evasionRate;
	}


	public void setEvasionRate(double evasionRate) {
		this.evasionRate = evasionRate;
	}


	public int getHitMinPoint() {
		return hitMinPoint;
	}


	public void setHitMinPoint(int hitMinPoint) {
		this.hitMinPoint = hitMinPoint;
	}


	public int getHitMaxPoint() {
		return hitMaxPoint;
	}


	public void setHitMaxPoint(int hitMaxPoint) {
		this.hitMaxPoint = hitMaxPoint;
	}


	public int getEarnMinMoney() {
		return earnMinMoney;
	}


	public void setEarnMinMoney(int earnMinMoney) {
		this.earnMinMoney = earnMinMoney;
	}


	public int getEarnMaxMoney() {
		return earnMaxMoney;
	}


	public void setEarnMaxMoney(int earnMaxMoney) {
		this.earnMaxMoney = earnMaxMoney;
	}


	public int getEarnExp() {
		return earnExp;
	}


	public void setEarnExp(int earnExp) {
		this.earnExp = earnExp;
	}


	public int getLoseExp() {
		return loseExp;
	}


	public void setLoseExp(int loseExp) {
		this.loseExp = loseExp;
	}


	public static final class Id {
		private long idValue;
		
		public Id(long idValue) {
			this.idValue = idValue;
		}
		
		@Override
		public boolean equals(Object o) {
			if(o instanceof Id) {
				Id other = (Id) o;
				if(other.idValue == this.idValue) {
					return true;
				}
			}
			return false;
		}
	}
}
