package br.ifes.leds.ensino.factory;

import br.ifes.leds.ensino.model.Calculadora;



public interface CalcFactory {
	
	Calculadora<Integer> getCaculadoraInt();
	
	Calculadora<Double> getCalculadoraDouble();
	

}
