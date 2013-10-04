package br.ifes.leds.ensino.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ifes.leds.ensino.Calculadora;
import br.ifes.leds.ensino.CalculadoraImpl;

public class CalculadoraTest {

	private Calculadora calculadora;
	
	private final int VALUE1 = 10;
	private final int VALUE2 = 20;
	
	private final int TIMES = 10;
	
	private final int RESULTOFSUM = 30;
	private final int RESULTOFMUL = 100;
	private final int RESULTOFDIV = 2;
	
	private final int ZERO = 0;
	
	
	@Before
	public void before()
	{
		calculadora = new CalculadoraImpl();
	}
	
	@Test
	public void soma()
	{
		int result = calculadora.sum(VALUE1, VALUE2);
		//Verificando se o objeto nao eh nulo
		Assert.assertNotNull(result);
		//Verificando se a soma esta correta
		Assert.assertEquals(RESULTOFSUM, result);
		//Verificando se o resultado e maior que 0
		Assert.assertFalse(result < 0);
	}
	@Test
	public void subtraction()
	{
		int result = calculadora.substration(VALUE2, VALUE1);
		//Verificando se o objeto nao eh nulo
		Assert.assertNotNull(result);
		//Verificando se a soma esta correta
		Assert.assertEquals(VALUE1, result);
		//Verificando se o resultado e maior que 0
		Assert.assertFalse(result < 0);
	}
	
	@Test
	public void multiplication()
	{
		int result = calculadora.multiplication(VALUE1, TIMES);
		//Verificando se o objeto nao eh nulo
		Assert.assertNotNull(result);
		//Verificando se a soma esta correta
		Assert.assertEquals(RESULTOFMUL, result);
		//Verificando se o resultado e maior que 0
		Assert.assertFalse(result < 0);
	}
	
	@Test
	public void multiplicationbyzero()
	{
		int result = calculadora.multiplication(VALUE1, ZERO);
		//Verificando se o objeto nao eh nulo
		Assert.assertNotNull(result);
		//Verificando se a soma esta correta
		Assert.assertEquals(ZERO, result);
		//Verificando se o resultado e maior que 0
		Assert.assertTrue(result == 0);
	}
	@Test
	public void division()
	{
		int result = calculadora.division(VALUE2, VALUE1);
		//Verificando se o objeto nao eh nulo
		Assert.assertNotNull(result);
		//Verificando se a soma esta correta
		Assert.assertEquals(RESULTOFDIV, result);
		//Verificando se o resultado e maior que 0
		Assert.assertFalse(result < 0);
	}
	
	@Test (expected = ArithmeticException.class)
	public void divisionbyzero()
	{
		
		calculadora.division(VALUE1, ZERO);
		
	}
	
	
}
