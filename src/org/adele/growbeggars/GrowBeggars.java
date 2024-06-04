package org.adele.growbeggars;

import org.adele.growbeggars.constants.Constants;
import org.adele.growbeggars.controller.GrowBeggarsBattleController;
import org.adele.growbeggars.controller.GrowBeggarsIntroController;
import org.adele.growbeggars.controller.GrowBeggarsMainController;
import org.adele.growbeggars.controller.input.ScannerInput;
import org.adele.growbeggars.controller.output.SystemOutput;
import org.adele.growbeggars.manage.ManageBeggar;
import org.adele.growbeggars.model.Beggar;
import org.adele.growbeggars.view.GrowBeggarsView;

/*
 * MVC 아키텍처를 적용함
 * public class GrowBeggars: 게임을 실행하는 메인 클래스
 * class GrowBeggars...Controller: 게임의 입력과 출력을 중재하는 Controller
 * class Beggar: 게임 핵심 Model
 * class GrowBeggarsView: 게임의 입출력을 담당하는 View, 일단 System.out.println으로 구현함
 */


public class GrowBeggars {
	private static GrowBeggarsBattleController battleController;
	private static GrowBeggarsMainController mainController;
	private static GrowBeggarsIntroController introController;
	public static void main(String[] args) {
		GrowBeggarsView view = new GrowBeggarsView(new ScannerInput(), new SystemOutput());
		ManageBeggar manageBeggar = new ManageBeggar(new Beggar());
		battleController = new GrowBeggarsBattleController(manageBeggar, view);
		mainController = new GrowBeggarsMainController(manageBeggar, view, battleController);
		introController = new GrowBeggarsIntroController(manageBeggar, view, mainController);
		introController.run();
	}

}
