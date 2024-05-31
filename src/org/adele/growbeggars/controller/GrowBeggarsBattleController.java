package org.adele.growbeggars.controller;

import java.util.Random;

import org.adele.growbeggars.Constants;
import org.adele.growbeggars.GrowBeggarsView;
import org.adele.growbeggars.ManageBeggar;
import org.adele.growbeggars.model.Mob;

public class GrowBeggarsBattleController extends GrowBeggarsController {

	public GrowBeggarsBattleController(ManageBeggar beggar, GrowBeggarsView view) {
		super(beggar, view);
	}

	@Override
	public void run() {
		Random random = new Random();
		int mobIdx = random.nextInt(Constants.MOB_CONSTANTS.length);
		boolean result = view.choiceBattleMenu(Constants.MOB_CONSTANTS[mobIdx].getName(),
				Constants.MOB_CONSTANTS[mobIdx].getArtData());
		if (result) {
			beggar.initHp();
			Mob targetMob = new Mob(Constants.MOB_CONSTANTS[mobIdx].getId(), Constants.MOB_CONSTANTS[mobIdx].getName(),
					Constants.MOB_CONSTANTS[mobIdx].getHp(), Constants.MOB_CONSTANTS[mobIdx].getEvasionRate(),
					Constants.MOB_CONSTANTS[mobIdx].getHitMinPoint(), Constants.MOB_CONSTANTS[mobIdx].getHitMaxPoint(),
					Constants.MOB_CONSTANTS[mobIdx].getEarnMinMoney(),
					Constants.MOB_CONSTANTS[mobIdx].getEarnMaxMoney(), Constants.MOB_CONSTANTS[mobIdx].getEarnExp(),
					Constants.MOB_CONSTANTS[mobIdx].getLoseExp());
			boolean isMyTurn = true;
			boolean isUsedEvasion = false;
			boolean isUsedEvasionItem = false;
			while (true) {
				if (isMyTurn) {
					isUsedEvasion = false;
					isUsedEvasionItem = false;
					int myChoice = view.showWarMyTurn(beggar.getCurHp(), targetMob.getHp(), targetMob.getName());
					if (myChoice == 1) {
						// 공격하기
						double r = random.nextDouble();
						int hitPoint = random.nextInt(beggar.getMaxHitPoint() - beggar.getMinHitPoint() + 1)
								+ beggar.getMinHitPoint();
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
								beggar.addMoney(earnMoney);
								if (beggar.addExp(targetMob.getEarnExp())) {
									view.showLevelUp(beggar.getLevel());
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
						if (beggar.useItem(Constants.ITEM_CONSTANTS[2])) {
							beggar.addHpFromPosion();
							view.showUseHpPosion(beggar.getCurHp());
							isMyTurn = false;
						} else {
							view.showNotUseHpPosion();
						}
					} else if (myChoice == 4) {
						// 공격 무시 사용하기
						if (beggar.useItem(Constants.ITEM_CONSTANTS[3])) {
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
					double applyRatio = beggar.getEvasionRate();
					if (isUsedEvasion) {
						applyRatio *= 2.0;
					}
					boolean hitResult = r >= applyRatio;
					if (isUsedEvasionItem) {
						hitResult = false;
					}
					view.showMobAttackResult(hitResult, targetMob.getName(), hitPoint);
					if (hitResult) {
						if (beggar.loseHp(hitPoint)) {
							// 당신이 죽었다면
							beggar.loseExp(targetMob.getLoseExp());
							view.showWarLose(targetMob.getName(), targetMob.getLoseExp(), beggar.getCurExp());
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
