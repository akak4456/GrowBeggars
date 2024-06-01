package org.adele.growbeggars.controller;

import org.adele.growbeggars.manage.ManageBeggar;
import org.adele.growbeggars.view.GrowBeggarsView;

public class GrowBeggarsIntroController extends GrowBeggarsController {
	private GrowBeggarsMainController mainController;
	public GrowBeggarsIntroController(ManageBeggar beggar, GrowBeggarsView view, GrowBeggarsMainController mainController) {
		super(beggar, view);
		this.mainController = mainController;
	}

	@Override
	public void run() {
		view.hello();
		while (true) {
			int choice = view.choiceMenu();
			if(choice == 1) {
				if(manageBeggar.isFirst()) {
					String name = view.inputName();
					int age = view.inputAge();
					manageBeggar.setNameAndAge(name, age);
				}
				mainController.run();
			} else if(choice == 2) {
				manageBeggar.reset();
				view.showReset();
			} else if(choice == 3) {
				int langChoice = view.showChangeLang();
				if(langChoice == 1) {
					view.changeLang(GrowBeggarsView.LANG_KO);
				} else if(langChoice == 2) {
					view.changeLang(GrowBeggarsView.LANG_EN);
				}
			} else if(choice == 4) {
				view.sayGoodbye();
				break;
			}
		}
	}
}