package br.ifes.leds.ensino.application;

import br.ifes.leds.ensino.controller.view.MainController;

public class Application {

	/**
	 * @param args
	 */
	public static void start(){

		MainController mainController = new MainController();
		
		mainController.start();

		
	}

}
