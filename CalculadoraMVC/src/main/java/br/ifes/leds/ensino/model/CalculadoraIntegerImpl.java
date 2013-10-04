package br.ifes.leds.ensino.model;

public class CalculadoraIntegerImpl implements Calculadora<Integer> {

	public Integer sum(Integer first, Integer second) {
		// TODO Auto-generated method stub
		return first + second;
	}

	public Integer substration(Integer first, Integer second) {
		// TODO Auto-generated method stub
		return first - second;
	}

	public Integer multiplication(Integer value, Integer times) {
		// TODO Auto-generated method stub
		return value * times;
	}

	public Integer division(Integer numerator, Integer divisor)
			throws ArithmeticException {
		// TODO Auto-generated method stub
		if (divisor == 0) {
			throw new ArithmeticException("Division by zero");
		}
		
		return numerator / divisor;
	}

}
