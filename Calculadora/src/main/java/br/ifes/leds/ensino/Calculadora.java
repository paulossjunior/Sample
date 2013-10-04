package br.ifes.leds.ensino;

public interface Calculadora {
	
	public int sum (int first, int second);
	
	public int substration (int first, int second);
	
	public int multiplication (int value, int times);
	
	public int division (int numerator, int divisor) throws ArithmeticException;
	

}
