package br.ifes.leds.ensino.model;

public interface Calculadora<T> {
	
	public T sum (T first, T second);
	
	public T substration (T first, T second);
	
	public T multiplication (T value, T times);
	
	public T division (T numerator, T divisor) throws ArithmeticException;
	

}
