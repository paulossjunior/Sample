package br.ifes.leds.ensino.model;

public class CalculadoraDoubleImpl implements Calculadora<Double> {

	public Double sum(Double first, Double second) {
		// TODO Auto-generated method stub
		return first + second;
	}

	public Double substration(Double first, Double second) {
		// TODO Auto-generated method stub
		return first - second;
	}

	public Double multiplication(Double value, Double times) {
		// TODO Auto-generated method stub
		return value * times;
	}

	public Double division(Double numerator, Double divisor)
			throws ArithmeticException {
		// TODO Auto-generated method stub
		
		if (divisor == 0) {
			throw new ArithmeticException("Division by zero");
		}
		
		return numerator / divisor;
	}

}
