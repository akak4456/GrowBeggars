package org.adele.growbeggars.controller;

import java.util.ArrayList;

import org.adele.growbeggars.Constants;
import org.adele.growbeggars.GrowBeggarsView;
import org.adele.growbeggars.ManageBeggar;
import org.adele.growbeggars.model.AutoMoneyMachine;
import org.adele.growbeggars.model.Building;
import org.adele.growbeggars.model.EmployBeggar;
import org.adele.growbeggars.model.Nation;

public class GrowBeggarsMainController extends GrowBeggarsController {

	private GrowBeggarsBattleController battleController;

	public GrowBeggarsMainController(ManageBeggar beggar, GrowBeggarsView view,
			GrowBeggarsBattleController battleController) {
		super(beggar, view);
		this.battleController = battleController;
	}

	@Override
	public void run() {
		while (true) {
			int choice = view.choiceGameMenu();
			if (choice == 1) {
				int earnMoney = beggar.getEarnBegMoney();
				boolean useFever = beggar.useItem(Constants.ITEM_CONSTANTS[0]); // 구걸 피버는 자동으로 사용한다.
				if (useFever) {
					earnMoney = (int) ((earnMoney + Constants.BEG_FEVER_ADD) * Constants.BEG_FEVER_MUL);
				}
				view.showBegResult(useFever, earnMoney);
				beggar.addMoney(earnMoney);
				view.showCurrentMoney(beggar.getMoney());
			} else if (choice == 2) {
				if (beggar.useItem(Constants.ITEM_CONSTANTS[1])) {
					int earnMoney = beggar.getEarnGakseolitaryeongMoney();
					beggar.addMoney(earnMoney);
					view.showGakseolitaryeongResult(earnMoney);
				} else {
					view.showNotUseGakseolitaryeong();
				}
			} else if (choice == 3) {
				while (true) {
					long curMoney = beggar.getMoney();
					view.showCurrentMoney(curMoney);
					int hireChoice = view.hireBeggar();
					if (hireChoice == Constants.EMPLOY_BEGGAR_CONSTANTS.length + 1) {
						break;
					} else {
						int idx = hireChoice - 1;
						EmployBeggar employ = new EmployBeggar(Constants.EMPLOY_BEGGAR_CONSTANTS[idx].getId(),
								Constants.EMPLOY_BEGGAR_CONSTANTS[idx].getName(),
								Constants.EMPLOY_BEGGAR_CONSTANTS[idx].getMul(),
								Constants.EMPLOY_BEGGAR_CONSTANTS[idx].getBuyPrice(),
								Constants.EMPLOY_BEGGAR_CONSTANTS[idx].getInitUpgradePrice());
						view.showHireBeggarResult(beggar.hireBeggar(employ));
					}
				}
			} else if (choice == 4) {
				while (true) {
					long curMoney = beggar.getMoney();
					view.showCurrentMoney(curMoney);
					ArrayList<AutoMoneyMachine> machines = beggar.getMachines();
					ArrayList<String> lines = new ArrayList<>();
					for (int i = 0; i < machines.size(); i++) {
						lines.add(machines.get(i).getName());
					}
					int buyChoice = view.upgradeBeggar(lines);
					if (buyChoice == 1) {
						if (view.begUpgradeYN(beggar.getBegMinMoney(), beggar.getBegMaxMoney(),
								beggar.getBegUpgradePrice())) {
							view.showBegUpgradeResult(beggar.upgradeBegMoney());
						} else {
							view.showNotContinueBegUpgrade();
						}
					} else if (buyChoice == 2) {
						if (view.gakseolitaryeongUpgradeYN(beggar.getGakseolitaryeongMinMoney(),
								beggar.getGakseolitaryeongMaxMoney(), beggar.getGakseolitaryeongUpgradePrice())) {
							view.showGakseolitaryeongUpgradeResult(beggar.upgradeGakseolitaryeong());
						} else {
							view.showNotContinueGakseolitaryeongUpgrade();
						}
					} else if (buyChoice == machines.size() + 3) {
						break;
					} else {
						AutoMoneyMachine machine = machines.get(buyChoice - 3);
						if (view.machineUpgradeYN(machine.getName(), machine.getMul(), machine.getUpgradePrice())) {
							view.showMachineUpgradeResult(beggar.upgradeMachine(machine), machine.getName());
						} else {
							view.showNotContinueMachineUpgrade(machine.getName());
						}
					}
				}
			} else if (choice == 5) {
				while (true) {
					long curMoney = beggar.getMoney();
					view.showCurrentMoney(curMoney);
					int buyItemChoice = view.buyItem(beggar.getBeggar());
					if (buyItemChoice == 5) {
						break;
					} else {
						view.showBuyItemResult(beggar.buyItem(Constants.ITEM_CONSTANTS[buyItemChoice - 1]), Constants.ITEM_CONSTANTS[buyItemChoice - 1].getName(), Constants.ITEM_CONSTANTS[buyItemChoice - 1].getItemBundleSize());
					}
				}
			} else if (choice == 6) {
				while (true) {
					long curMoney = beggar.getMoney();
					view.showCurrentMoney(curMoney);
					ArrayList<AutoMoneyMachine> validMachines = new ArrayList<>();
					ArrayList<String> names = new ArrayList<>();
					ArrayList<Integer> prices = new ArrayList<>();
					for (int i = 0; i < Constants.BUILDING_CONSTANTS.length; i++) {
						if (beggar.containMachine(Constants.BUILDING_CONSTANTS[i].getId())) {
							continue;
						}
						Building building = new Building(Constants.BUILDING_CONSTANTS[i].getId(),
								Constants.BUILDING_CONSTANTS[i].getName(), Constants.BUILDING_CONSTANTS[i].getMul(),
								Constants.BUILDING_CONSTANTS[i].getBuyPrice(),
								Constants.BUILDING_CONSTANTS[i].getInitUpgradePrice());
						validMachines.add(building);
						names.add(Constants.BUILDING_CONSTANTS[i].getName());
						prices.add(Constants.BUILDING_CONSTANTS[i].getBuyPrice());
					}
					int buyBuildingChoice = view.buyBuilding(names, prices);
					if (buyBuildingChoice == validMachines.size() + 1) {
						break;
					} else {
						AutoMoneyMachine machine = validMachines.get(buyBuildingChoice - 1);
						view.showBuyMachineResult(beggar.buyMachine(machine), machine.getName());
					}
				}
			} else if (choice == 7) {
				while (true) {
					long curMoney = beggar.getMoney();
					view.showCurrentMoney(curMoney);
					ArrayList<AutoMoneyMachine> validMachines = new ArrayList<>();
					ArrayList<String> names = new ArrayList<>();
					ArrayList<Integer> prices = new ArrayList<>();
					for (int i = 0; i < Constants.NATION_CONSTANTS.length; i++) {
						if (beggar.containMachine(Constants.NATION_CONSTANTS[i].getId())) {
							continue;
						}
						Nation nation = new Nation(Constants.NATION_CONSTANTS[i].getId(),
								Constants.NATION_CONSTANTS[i].getName(), Constants.NATION_CONSTANTS[i].getMul(),
								Constants.NATION_CONSTANTS[i].getBuyPrice(),
								Constants.NATION_CONSTANTS[i].getInitUpgradePrice());
						validMachines.add(nation);
						names.add(Constants.NATION_CONSTANTS[i].getName());
						prices.add(Constants.NATION_CONSTANTS[i].getBuyPrice());
					}
					int buyNationChoice = view.buyNation(names, prices);
					if (buyNationChoice == validMachines.size() + 1) {
						break;
					} else {
						AutoMoneyMachine machine = validMachines.get(buyNationChoice - 1);
						view.showBuyMachineResult(beggar.buyMachine(machine), machine.getName());
					}
				}
			} else if (choice == 8) {
				battleController.run();
			} else if (choice == 9) {
				long curMoney = beggar.getMoney();
				view.showCurrentMoney(curMoney);
				view.showBegInfo(beggar.getBeggar());
			} else if (choice == 10) {
				break;
			}
		}
	}

}