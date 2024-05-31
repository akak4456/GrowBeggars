package org.adele.growbeggars.controller;

import org.adele.growbeggars.GrowBeggarsView;
import org.adele.growbeggars.ManageBeggar;

public abstract class GrowBeggarsController {
	protected ManageBeggar beggar;
	protected GrowBeggarsView view;
	public GrowBeggarsController(ManageBeggar beggar, GrowBeggarsView view) {
		this.beggar = beggar;
		this.view = view;
	}
	
	abstract public void run();

}
