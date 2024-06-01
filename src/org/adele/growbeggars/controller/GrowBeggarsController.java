package org.adele.growbeggars.controller;

import org.adele.growbeggars.manage.ManageBeggar;
import org.adele.growbeggars.view.GrowBeggarsView;

public abstract class GrowBeggarsController {
	protected ManageBeggar manageBeggar;
	protected GrowBeggarsView view;
	public GrowBeggarsController(ManageBeggar beggar, GrowBeggarsView view) {
		this.manageBeggar = beggar;
		this.view = view;
	}
	
	abstract public void run();

}
