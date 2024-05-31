package org.adele.growbeggars;

import java.util.ArrayList;
import java.util.Random;

import org.adele.growbeggars.Constants.Item;
import org.adele.growbeggars.model.AutoMoneyMachine;
import org.adele.growbeggars.model.Beggar;
import org.adele.growbeggars.model.EmployBeggar;

/*
 * 유저가 키우게 되는 거지 모델을 관리하는 것
 */
public class ManageBeggar {

	/*
	 * 고용된 거지, 건물, 나라 등에서 자동으로 벌어들이는 돈에 의해서 money 가 자동으로 늘어나야 할 때 기준이 되는 시간. 원래는
	 * 1초마다 자동으로 늘어나는 것이 제일 좋은 방법 이겠으나 복잡하고 실시간 동시성이 중요하지 않으니 (현재 시간) -
	 * lastCalcMillis 를 사용해 돈을 늘려가는 방법을 채택
	 */
	private long lastCalcMillis;
	
	private Beggar beggar;
	
	public ManageBeggar() {
		beggar = new Beggar();
		lastCalcMillis = 0;
		beggar.init();
	}

	public boolean isFirst() {
		return beggar.getName() == null && beggar.getAge() == 0;
	}

	public void setNameAndAge(String name, int age) {
		beggar.setName(name);
		beggar.setAge(age);
	}
	
	public void reset() {
		beggar.init();
	}
	
	public String getName() {
		return beggar.getName();
	}
	
	public int getAge() {
		return beggar.getAge();
	}
	
	public int getEarnBegMoney() {
		return (new Random()).nextInt(beggar.getBegMaxMoney() - beggar.getBegMinMoney() + 1) + beggar.getBegMinMoney();
	}
	
	public boolean useItem(Item item) {
		return beggar.getInventory().useItem(item);
	}
	
	public long getMoney() {
		calcAutoMoney();
		return beggar.getMoney();
	}
	
	public void addMoney(int earnMoney) {
		calcAutoMoney();
		beggar.setMoney(beggar.getMoney() + earnMoney);
	}
	
	public Beggar getBeggar() {
		return beggar;
	}
	
	/*
	 * 레벨업시 true 리턴
	 */
	public boolean addExp(int earnExp) {
		beggar.setCurExp(beggar.getCurExp() + earnExp);
		if(beggar.getCurExp() >= beggar.getRequireExp()) {
			beggar.setLevel(beggar.getLevel() + 1);
			beggar.setCurExp(beggar.getCurExp() - beggar.getRequireExp());
			beggar.setRequireExp((int)(beggar.getRequireExp() * 1.2));
			return true;
		}
		return false;
	}
	
	public void loseExp(int loseExp) {
		beggar.setCurExp(beggar.getCurExp() - loseExp);
		if(beggar.getCurExp() < 0) {
			beggar.setCurExp(0);
		}
	}
	
	public int getEarnGakseolitaryeongMoney() {
		return (new Random()).nextInt(beggar.getGakseolitaryeongMaxMoney() - beggar.getGakseolitaryeongMinMoney() + 1)
				+ beggar.getGakseolitaryeongMinMoney();
	}
	
	public int getItemCount(Item item) {
		return beggar.getInventory().getCount(item);
	}
	
	private void calcAutoMoney() {
		if (!isFirst()) {
			if (lastCalcMillis == 0) {
				lastCalcMillis = System.currentTimeMillis();
			}
			long curTime = System.currentTimeMillis();
			long durationSeconds = (curTime - lastCalcMillis) / 1000;
			lastCalcMillis = System.currentTimeMillis();
			double sum = 0.0;
			for (int i = 0; i < beggar.getMachines().size(); i++) {
				AutoMoneyMachine machine = beggar.getMachines().get(i);
				if (machine != null) {
					sum += durationSeconds * machine.getMul();
				}
			}
			beggar.setMoney((long) (beggar.getMoney() + sum));
		}
	}
	
	public boolean hireBeggar(EmployBeggar employ) {
		if (beggar.getMoney() >= employ.getBuyPrice()) {
			beggar.getMachines().add(employ);
			beggar.setMoney(beggar.getMoney() - employ.getBuyPrice());
			return true;
		} else {
			return false;
		}
	}
	
	public ArrayList<AutoMoneyMachine> getMachines() {
		return beggar.getMachines();
	}
	
	public int getBegMinMoney() {
		return beggar.getBegMinMoney();
	}
	
	public int getBegMaxMoney() {
		return beggar.getBegMaxMoney();
	}
	
	public int getBegUpgradePrice() {
		return beggar.getBegUpgradePrice();
	}
	
	public boolean upgradeBegMoney() {
		if (beggar.getMoney() >= beggar.getBegUpgradePrice()) {
			beggar.setMoney(beggar.getMoney() - beggar.getBegUpgradePrice());
			beggar.setBegMinMoney((int) ((beggar.getBegMinMoney() + Constants.UPGRADE_BEG_ADD_MIN_NUMBER) * Constants.UPGRADE_BEG_MIN_MUL));
			beggar.setBegMaxMoney((int) ((beggar.getBegMaxMoney() + Constants.UPGRADE_BEG_ADD_MAX_NUMBER) * Constants.UPGRADE_BEG_MAX_MUL));
			beggar.setBegUpgradePrice((int) (beggar.getBegUpgradePrice() * Constants.UPGRADE_BEG_PRICE_MUL));
			return true;
		} else {
			return false;
		}
	}
	
	public int getGakseolitaryeongMinMoney() {
		return beggar.getGakseolitaryeongMinMoney();
	}
	
	public int getGakseolitaryeongMaxMoney() {
		return beggar.getGakseolitaryeongMaxMoney();
	}
	
	public int getGakseolitaryeongUpgradePrice() {
		return beggar.getGakseolitaryeongUpgradePrice();
	}
	
	public boolean upgradeGakseolitaryeong() {
		if (beggar.getMoney() >= beggar.getGakseolitaryeongUpgradePrice()) {
			beggar.setMoney(beggar.getMoney() - beggar.getGakseolitaryeongUpgradePrice());
			beggar.setGakseolitaryeongMinMoney((int) ((beggar.getGakseolitaryeongMinMoney() + Constants.UPGRADE_GAKSEOLITARYEONG_ADD_MIN_NUMBER) * Constants.UPGRADE_GAKSEOLITARYEONG_MIN_MUL));
			beggar.setGakseolitaryeongMaxMoney((int) ((beggar.getGakseolitaryeongMaxMoney() + Constants.UPGRADE_GAKSEOLITARYEONG_ADD_MAX_NUMBER) * Constants.UPGRADE_GAKSEOLITARYEONG_MAX_MUL));
			beggar.setGakseolitaryeongUpgradePrice((int) (beggar.getGakseolitaryeongUpgradePrice() * Constants.UPGRADE_GAKSEOLITARYEONG_PRICE_MUL));
			return true;
		} else {
			return false;
		}
	}
	
	public boolean upgradeMachine(AutoMoneyMachine machine) {
		if (beggar.getMoney() >= machine.getUpgradePrice()) {
			beggar.setMoney(beggar.getMoney() - machine.getUpgradePrice());
			machine.setMul((machine.getMul() + Constants.UPGRADE_MACHINE_MUL_ADD_NUMBER) * Constants.UPGRADE_MACHINE_MUL_MUL);
			machine.setUpgradePrice((int) (machine.getUpgradePrice() * Constants.UPGRADE_MACHINE_PRICE_MUL));
			return true;
		} else {
			return false;
		}
	}
	
	public boolean buyItem(Item item) {
		if(beggar.getMoney() >= item.getItemPrice()) {
			beggar.setMoney(beggar.getMoney() - item.getItemPrice());
			beggar.getInventory().addItem(item, item.getItemBundleSize());
			return true;
		} else {
			return false;
		}
	}
	
	public boolean containMachine(AutoMoneyMachine.Id machineId) {
		for (AutoMoneyMachine m : beggar.getMachines()) {
			if (m.getId().equals(machineId)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean buyMachine(AutoMoneyMachine machine) {
		if (beggar.getMoney() >= machine.getBuyPrice()) {
			beggar.setMoney(beggar.getMoney() - machine.getBuyPrice());
			beggar.getMachines().add(machine);
			return true;
		} else {
			return false;
		}
	}
	
	public int getCurHp() {
		return beggar.getCurHp();
	}
	
	/*
	 * 전쟁을 처음 시작할 때에는 항상 풀피여야 한다.
	 */
	public void initHp() {
		beggar.setCurHp(beggar.getMaxHp());
	}
	
	public int getMinHitPoint() {
		return beggar.getMinHitPoint();
	}
	
	public int getMaxHitPoint() {
		return beggar.getMaxHitPoint();
	}

	public int getLevel() {
		return beggar.getLevel();
	}
	
	public int getRemainExp() {
		return beggar.getRequireExp() - beggar.getCurExp();
	}

	public double getEvasionRate() {
		return beggar.getEvasionRate();
	}
	
	public void addHpFromPosion() {
		int addedHp = beggar.getCurHp() + Constants.ADDED_HP_FROM_HP_POSION;
		if(addedHp > beggar.getMaxHp()) {
			addedHp = beggar.getMaxHp();
		}
		beggar.setCurHp(addedHp);
	}
	
	/*
	 * hp 가 0이하이면 true 를 반환해 죽었음을 나타낸다.
	 */
	public boolean loseHp(int hitPoint) {
		beggar.setCurHp(beggar.getCurHp() - hitPoint);
		return beggar.getCurHp() <= 0;
	}

	public int getCurExp() {
		return beggar.getCurExp();
	}

	public int getMaxHp() {
		return beggar.getMaxHp();
	}
	
}
