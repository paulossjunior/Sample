package br.ifes.leds.ensino.controller.model;

import br.ifes.leds.ensino.factory.CalcFactory;
import br.ifes.leds.ensino.factory.CalcFactoryImpl;

public class ControllerIntegerCalc extends AbstractControllerCal<Integer> {

	public ControllerIntegerCalc()
	{
		CalcFactory factory = new CalcFactoryImpl();
		calculadora = factory.getCaculadoraInt();
	}
	
	
}
