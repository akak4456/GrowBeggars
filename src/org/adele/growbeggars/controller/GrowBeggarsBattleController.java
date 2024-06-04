package org.adele.growbeggars.controller;

import java.util.Random;

import org.adele.growbeggars.constants.Constants;
import org.adele.growbeggars.manage.ManageBeggar;
import org.adele.growbeggars.model.Mob;
import org.adele.growbeggars.view.GrowBeggarsView;

public class GrowBeggarsBattleController extends GrowBeggarsController {

	public GrowBeggarsBattleController(ManageBeggar beggar, GrowBeggarsView view) {
		super(beggar, view);
	}

	@Override
	public void run() {
		Random random = new Random();
		int mobIdx = random.nextInt(Constants.MOB_CONSTANTS.size());
		boolean result = view.choiceBattleMenu(Constants.MOB_CONSTANTS.get(mobIdx).getNameKey(),
				Constants.MOB_CONSTANTS.get(mobIdx).getArtData());
		if (result) {
			manageBeggar.initHp();
			Mob targetMob = new Mob(Constants.MOB_CONSTANTS.get(mobIdx).getId(), Constants.MOB_CONSTANTS.get(mobIdx).getNameKey(),
					Constants.MOB_CONSTANTS.get(mobIdx).getHp(), Constants.MOB_CONSTANTS.get(mobIdx).getEvasionRate(),
					Constants.MOB_CONSTANTS.get(mobIdx).getHitMinPoint(), Constants.MOB_CONSTANTS.get(mobIdx).getHitMaxPoint(),
					Constants.MOB_CONSTANTS.get(mobIdx).getEarnMinMoney(),
					Constants.MOB_CONSTANTS.get(mobIdx).getEarnMaxMoney(), Constants.MOB_CONSTANTS.get(mobIdx).getEarnExp(),
					Constants.MOB_CONSTANTS.get(mobIdx).getLoseExp());
			boolean isMyTurn = true;
			boolean isUsedEvasion = false;
			boolean isUsedEvasionItem = false;
			while (true) {
				if (isMyTurn) {
					isUsedEvasion = false;
					isUsedEvasionItem = false;
					int myChoice = view.showWarMyTurn(manageBeggar.getCurHp(), targetMob.getHp(), targetMob.getName());
					if (myChoice == 1) {
						// 공격하기
						double r = random.nextDouble();
						int hitPoint = random.nextInt(manageBeggar.getMaxHitPoint() - manageBeggar.getMinHitPoint() + 1)
								+ manageBeggar.getMinHitPoint();
						boolean hitResult = r >= targetMob.getEvasionRate();
						view.showMyAttack(hitResult, targetMob.getName(), hitPoint);
						if (hitResult) {
							// 몬스터에게 공격이 들어감
							targetMob.setHp(targetMob.getHp() - hitPoint);
							if (targetMob.getHp() <= 0) {
								// 당신의 승리
								int earnMoney = random
										.nextInt(targetMob.getEarnMaxMoney() - targetMob.getEarnMinMoney() + 1)
										+ targetMob.getEarnMinMoney();
								view.showWarWin(targetMob.getName(), earnMoney, targetMob.getEarnExp());
								manageBeggar.addMoney(earnMoney);
								if (manageBeggar.addExp(targetMob.getEarnExp())) {
									view.showLevelUp(manageBeggar.getLevel());
								}
								break;
							}
						}
						isMyTurn = false;
					} else if (myChoice == 2) {
						// 회피하기
						view.showUseEvasion();
						isUsedEvasion = true;
						isMyTurn = false;
					} else if (myChoice == 3) {
						// 포션 사용하기
						if (manageBeggar.useItem(Constants.ITEM_CONSTANTS.get(2))) {
							manageBeggar.addHpFromPosion();
							view.showUseHpPosion(manageBeggar.getCurHp());
							isMyTurn = false;
						} else {
							view.showNotUseHpPosion();
						}
					} else if (myChoice == 4) {
						// 공격 무시 사용하기
						if (manageBeggar.useItem(Constants.ITEM_CONSTANTS.get(3))) {
							view.showUseIgnoreAttack();
							isMyTurn = false;
						} else {
							view.showNotUseIgnoreAttack();
						}
					} else if (myChoice == 5) {
						// 도망가기
						view.showRun();
						break;
					}
				} else {
					double r = random.nextDouble();
					int hitPoint = random.nextInt(targetMob.getHitMaxPoint() - targetMob.getHitMinPoint() + 1)
							+ targetMob.getHitMinPoint();
					double applyRatio = manageBeggar.getEvasionRate();
					if (isUsedEvasion) {
						applyRatio *= 2.0;
					}
					boolean hitResult = r >= applyRatio;
					if (isUsedEvasionItem) {
						hitResult = false;
					}
					view.showMobAttackResult(hitResult, targetMob.getName(), hitPoint);
					if (hitResult) {
						if (manageBeggar.loseHp(hitPoint)) {
							// 당신이 죽었다면
							manageBeggar.loseExp(targetMob.getLoseExp());
							view.showWarLose(targetMob.getName(), targetMob.getLoseExp(), manageBeggar.getCurExp());
							break;
						}
					}
					isMyTurn = true;
				}
			}
		} else {
			view.showRun();
		}
	}

}
