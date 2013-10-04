package br.ifes.leds.ensino.util;

import java.util.Scanner;

public class LeitorUtil {
	
	private static Scanner leitorOpcao = new Scanner(System.in);
	
	public static Integer lervalorInteiro() {
		 
		return  leitorOpcao.nextInt();
	}

	public static Double lervalorDouble() {
		 
		return leitorOpcao.nextDouble();
	}

}
