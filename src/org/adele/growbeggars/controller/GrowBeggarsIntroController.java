package org.adele.growbeggars.controller;

import org.adele.growbeggars.GrowBeggarsView;
import org.adele.growbeggars.ManageBeggar;

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
				if(beggar.isFirst()) {
					String name = view.inputName();
					int age = view.inputAge();
					beggar.setNameAndAge(name, age);
				}
				mainController.run();
			} else if(choice == 2) {
				beggar.reset();
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