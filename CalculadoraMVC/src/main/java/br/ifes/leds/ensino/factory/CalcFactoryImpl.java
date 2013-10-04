package br.ifes.leds.ensino.factory;

import br.ifes.leds.ensino.model.Calculadora;
import br.ifes.leds.ensino.model.CalculadoraDoubleImpl;
import br.ifes.leds.ensino.model.CalculadoraIntegerImpl;


public class CalcFactoryImpl implements CalcFactory{

	public Calculadora<Integer> getCaculadoraInt() {
		// TODO Auto-generated method stub
		return new CalculadoraIntegerImpl();
	}

	public Calculadora<Double> getCalculadoraDouble() {
		// TODO Auto-generated method stub
		return new CalculadoraDoubleImpl();
	}

	
	
}
