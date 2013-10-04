package br.ifes.leds.ensino.controller.model;

import br.ifes.leds.ensino.factory.CalcFactory;
import br.ifes.leds.ensino.factory.CalcFactoryImpl;

public class ControllerDoubleCalc extends AbstractControllerCal<Double> {
	
	public ControllerDoubleCalc()
	{
		CalcFactory factory = new CalcFactoryImpl();
		calculadora = factory.getCalculadoraDouble();
	}
	

}
