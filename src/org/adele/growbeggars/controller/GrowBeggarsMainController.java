package org.adele.growbeggars.controller;

import java.util.ArrayList;

import org.adele.growbeggars.constants.Constants;
import org.adele.growbeggars.manage.ManageBeggar;
import org.adele.growbeggars.model.AutoMoneyMachine;
import org.adele.growbeggars.model.Building;
import org.adele.growbeggars.model.EmployBeggar;
import org.adele.growbeggars.model.Nation;
import org.adele.growbeggars.view.GrowBeggarsView;

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
				int earnMoney = manageBeggar.getEarnBegMoney();
				boolean useFever = manageBeggar.useItem(Constants.ITEM_CONSTANTS[0]); // 구걸 피버는 자동으로 사용한다.
				if (useFever) {
					earnMoney = (int) ((earnMoney + Constants.BEG_FEVER_ADD) * Constants.BEG_FEVER_MUL);
				}
				view.showBegResult(useFever, earnMoney);
				manageBeggar.addMoney(earnMoney);
				view.showCurrentMoney(manageBeggar.getMoney());
			} else if (choice == 2) {
				if (manageBeggar.useItem(Constants.ITEM_CONSTANTS[1])) {
					int earnMoney = manageBeggar.getEarnGakseolitaryeongMoney();
					manageBeggar.addMoney(earnMoney);
					view.showGakseolitaryeongResult(earnMoney);
				} else {
					view.showNotUseGakseolitaryeong();
				}
			} else if (choice == 3) {
				while (true) {
					long curMoney = manageBeggar.getMoney();
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
						view.showHireBeggarResult(manageBeggar.hireBeggar(employ));
					}
				}
			} else if (choice == 4) {
				while (true) {
					long curMoney = manageBeggar.getMoney();
					view.showCurrentMoney(curMoney);
					ArrayList<AutoMoneyMachine> machines = manageBeggar.getMachines();
					ArrayList<String> lines = new ArrayList<>();
					for (int i = 0; i < machines.size(); i++) {
						lines.add(machines.get(i).getName());
					}
					int buyChoice = view.upgradeBeggar(lines);
					if (buyChoice == 1) {
						if (view.begUpgradeYN(manageBeggar.getBegMinMoney(), manageBeggar.getBegMaxMoney(),
								manageBeggar.getBegUpgradePrice())) {
							view.showBegUpgradeResult(manageBeggar.upgradeBegMoney());
						} else {
							view.showNotContinueBegUpgrade();
						}
					} else if (buyChoice == 2) {
						if (view.gakseolitaryeongUpgradeYN(manageBeggar.getGakseolitaryeongMinMoney(),
								manageBeggar.getGakseolitaryeongMaxMoney(), manageBeggar.getGakseolitaryeongUpgradePrice())) {
							view.showGakseolitaryeongUpgradeResult(manageBeggar.upgradeGakseolitaryeong());
						} else {
							view.showNotContinueGakseolitaryeongUpgrade();
						}
					} else if (buyChoice == machines.size() + 3) {
						break;
					} else {
						AutoMoneyMachine machine = machines.get(buyChoice - 3);
						if (view.machineUpgradeYN(machine.getName(), machine.getMul(), machine.getUpgradePrice())) {
							view.showMachineUpgradeResult(manageBeggar.upgradeMachine(machine), machine.getName());
						} else {
							view.showNotContinueMachineUpgrade(machine.getName());
						}
					}
				}
			} else if (choice == 5) {
				while (true) {
					long curMoney = manageBeggar.getMoney();
					view.showCurrentMoney(curMoney);
					int buyItemChoice = view.buyItem(manageBeggar.getBeggar());
					if (buyItemChoice == 5) {
						break;
					} else {
						view.showBuyItemResult(manageBeggar.buyItem(Constants.ITEM_CONSTANTS[buyItemChoice - 1]), Constants.ITEM_CONSTANTS[buyItemChoice - 1].getName(), Constants.ITEM_CONSTANTS[buyItemChoice - 1].getItemBundleSize());
					}
				}
			} else if (choice == 6) {
				while (true) {
					long curMoney = manageBeggar.getMoney();
					view.showCurrentMoney(curMoney);
					ArrayList<AutoMoneyMachine> validMachines = new ArrayList<>();
					ArrayList<String> names = new ArrayList<>();
					ArrayList<Integer> prices = new ArrayList<>();
					for (int i = 0; i < Constants.BUILDING_CONSTANTS.length; i++) {
						if (manageBeggar.containMachine(Constants.BUILDING_CONSTANTS[i].getId())) {
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
						view.showBuyMachineResult(manageBeggar.buyMachine(machine), machine.getName());
					}
				}
			} else if (choice == 7) {
				while (true) {
					long curMoney = manageBeggar.getMoney();
					view.showCurrentMoney(curMoney);
					ArrayList<AutoMoneyMachine> validMachines = new ArrayList<>();
					ArrayList<String> names = new ArrayList<>();
					ArrayList<Integer> prices = new ArrayList<>();
					for (int i = 0; i < Constants.NATION_CONSTANTS.length; i++) {
						if (manageBeggar.containMachine(Constants.NATION_CONSTANTS[i].getId())) {
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
						view.showBuyMachineResult(manageBeggar.buyMachine(machine), machine.getName());
					}
				}
			} else if (choice == 8) {
				battleController.run();
			} else if (choice == 9) {
				long curMoney = manageBeggar.getMoney();
				view.showCurrentMoney(curMoney);
				view.showBegInfo(manageBeggar.getBeggar());
			} else if (choice == 10) {
				break;
			}
		}
	}

}