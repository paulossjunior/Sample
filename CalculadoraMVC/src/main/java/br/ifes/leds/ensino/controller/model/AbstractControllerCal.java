package br.ifes.leds.ensino.controller.model;

import br.ifes.leds.ensino.model.Calculadora;

public abstract class AbstractControllerCal<T> implements ControllerCalc<T>{

	protected Calculadora calculadora;
	
	public T sum(T first, T second) {
		// TODO Auto-generated method stub
		return (T) calculadora.sum(first, second);
	}

	public T substration(T first, T second) {
		// TODO Auto-generated method stub
		return (T) calculadora.substration(first, second);
	}

	public T multiplication(T value, T times) {
		// TODO Auto-generated method stub
		return (T) calculadora.multiplication(value, times);
	}

	public T division(T numerator, T divisor)
			throws ArithmeticException {
		// TODO Auto-generated method stub
		return (T) calculadora.division(numerator, divisor);
	}
	
}
