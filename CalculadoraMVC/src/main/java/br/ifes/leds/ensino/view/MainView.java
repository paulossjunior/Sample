package br.ifes.leds.ensino.view;

import br.ifes.leds.ensino.util.LeitorUtil;

public class MainView {

	
	public void show() {

		// Mostrando o menu
		mostrarMenu();
	}

	

	// Mostrando o menu
	private void mostrarMenu() {

		System.out.println("Bem vindo a Calculadora");
		System.out.println("1 - Calculadora de Inteiros");
		System.out.println("2 - Calculadora de Doubles");
		System.out.println("3 - Sair");

	}
	
	public void mensagemOpcaoInvalida (){
		System.out.println("Opcao invalida");
	}
	
	public void mensagemFim (){
		System.out.println("Fim do programa!");
	}

}
