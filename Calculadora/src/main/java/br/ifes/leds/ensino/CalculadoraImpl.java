package br.ifes.leds.ensino;

public class CalculadoraImpl implements Calculadora{

	public int sum(int first, int second) {
		// TODO Auto-generated method stub
		return first + second;
	}

	public int substration(int first, int second) {
		// TODO Auto-generated method stub
		return first - second;
	}

	public int multiplication(int value, int times) {
		// TODO Auto-generated method stub
		return  value * times;
	}

	public int division(int numerator, int divisor)
			throws ArithmeticException {
		// TODO Auto-generated method stub
		
		if (divisor == 0) {
			throw new ArithmeticException("Division by zero");
		}
		
		return numerator / divisor;
	}

}
