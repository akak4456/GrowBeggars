package org.adele.growbeggars.model;

import java.util.ArrayList;

import org.adele.growbeggars.Constants;

/*
 * 유저 정보를 담는 거지 POJO
 */
public class Beggar {
	private String name;
	private int age;

	private long money;
	private ArrayList<AutoMoneyMachine> machines;

	private Inventory inventory;

	private int begMinMoney; // 구걸을 통해 벌 수 있는 최소한의 돈
	private int begMaxMoney; // 구걸을 통해 벌 수 있는 최대한의 돈
	private int begUpgradePrice; // 구걸 업그레이드 비용

	private int gakseolitaryeongMinMoney; // 각설이타령을 통해 벌 수 있는 최소한의 돈
	private int gakseolitaryeongMaxMoney; // 각설이타령을 통해 벌 수 있는 최대한의 돈
	private int gakseolitaryeongUpgradePrice; // 각설이타령 업그레이드 비용
	
	private int level;
	private int maxHp;
	private int curHp;
	private double evasionRate;
	private int minHitPoint;
	private int maxHitPoint;
	private int curExp;
	private int requireExp;
	
	public void init() {
		this.name = null;
		this.age = 0;
		this.money = 0;
		this.begMinMoney = Constants.INIT_BEG_MIN_MONEY;
		this.begMaxMoney = Constants.INIT_BEG_MAX_MONEY;
		this.begUpgradePrice = Constants.INIT_BEG_UPGRADE_PRICE;
		this.gakseolitaryeongMinMoney = Constants.INIT_GAKSEOLITARYEONG_MIN_MONEY;
		this.gakseolitaryeongMaxMoney = Constants.INIT_GAKSEOLITARYEONG_MAX_MONEY;
		this.gakseolitaryeongUpgradePrice = Constants.INIT_GAKSEOLITARYEONG_UPGRADE_PRICE;
		machines = new ArrayList<>();
		inventory = new Inventory();
		
		level = 1;
		maxHp = 100;
		curHp = 100;
		evasionRate = 0.2;
		minHitPoint = 20;
		maxHitPoint = 40;
		curExp = 0;
		requireExp = 50;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public ArrayList<AutoMoneyMachine> getMachines() {
		return machines;
	}

	public void setMachines(ArrayList<AutoMoneyMachine> machines) {
		this.machines = machines;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public int getBegMinMoney() {
		return begMinMoney;
	}

	public void setBegMinMoney(int begMinMoney) {
		this.begMinMoney = begMinMoney;
	}

	public int getBegMaxMoney() {
		return begMaxMoney;
	}

	public void setBegMaxMoney(int begMaxMoney) {
		this.begMaxMoney = begMaxMoney;
	}

	public int getBegUpgradePrice() {
		return begUpgradePrice;
	}

	public void setBegUpgradePrice(int begUpgradePrice) {
		this.begUpgradePrice = begUpgradePrice;
	}

	public int getGakseolitaryeongMinMoney() {
		return gakseolitaryeongMinMoney;
	}

	public void setGakseolitaryeongMinMoney(int gakseolitaryeongMinMoney) {
		this.gakseolitaryeongMinMoney = gakseolitaryeongMinMoney;
	}

	public int getGakseolitaryeongMaxMoney() {
		return gakseolitaryeongMaxMoney;
	}

	public void setGakseolitaryeongMaxMoney(int gakseolitaryeongMaxMoney) {
		this.gakseolitaryeongMaxMoney = gakseolitaryeongMaxMoney;
	}

	public int getGakseolitaryeongUpgradePrice() {
		return gakseolitaryeongUpgradePrice;
	}

	public void setGakseolitaryeongUpgradePrice(int gakseolitaryeongUpgradePrice) {
		this.gakseolitaryeongUpgradePrice = gakseolitaryeongUpgradePrice;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getCurHp() {
		return curHp;
	}

	public void setCurHp(int curHp) {
		this.curHp = curHp;
	}

	public double getEvasionRate() {
		return evasionRate;
	}

	public void setEvasionRate(double evasionRate) {
		this.evasionRate = evasionRate;
	}

	public int getMinHitPoint() {
		return minHitPoint;
	}

	public void setMinHitPoint(int minHitPoint) {
		this.minHitPoint = minHitPoint;
	}

	public int getMaxHitPoint() {
		return maxHitPoint;
	}

	public void setMaxHitPoint(int maxHitPoint) {
		this.maxHitPoint = maxHitPoint;
	}

	public int getCurExp() {
		return curExp;
	}

	public void setCurExp(int curExp) {
		this.curExp = curExp;
	}

	public int getRequireExp() {
		return requireExp;
	}

	public void setRequireExp(int requireExp) {
		this.requireExp = requireExp;
	}

}
