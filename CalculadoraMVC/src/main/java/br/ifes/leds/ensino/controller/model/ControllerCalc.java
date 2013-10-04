package br.ifes.leds.ensino.controller.model;

public interface ControllerCalc <T>{
	
	public T sum (T first, T second);
	
	public T substration (T first, T second);
	
	public T multiplication (T value, T times);
	
	public T division (T numerator, T divisor) throws ArithmeticException;

}
