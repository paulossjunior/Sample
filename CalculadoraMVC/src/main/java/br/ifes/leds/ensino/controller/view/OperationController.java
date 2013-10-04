package br.ifes.leds.ensino.controller.view;

import br.ifes.leds.ensino.controller.model.ControllerDoubleCalc;
import br.ifes.leds.ensino.controller.model.ControllerIntegerCalc;
import br.ifes.leds.ensino.model.util.ECalc;
import br.ifes.leds.ensino.model.util.EOperacao;
import br.ifes.leds.ensino.util.LeitorUtil;
import br.ifes.leds.ensino.view.OperationView;

public class OperationController {

	private EOperacao  opcaoOperacao;
	
	private ECalc opcaoCalculadora;
	
	private OperationView operationView = new OperationView();
	
	public void setOpcaoCalculadora(ECalc opcaoCalculadora) {
		this.opcaoCalculadora = opcaoCalculadora;
	}
	
	public void showOpcoes(){
		
		if (opcaoCalculadora.equals(ECalc.INTEGER))
		{
			operationView.titleInt();
		}
		else{
			operationView.titleDouble();
		}
		
		operationView.mostrarOperacoes();
		
		int opcao = LeitorUtil.lervalorInteiro();
		
		verificandoOpcaoEscolhidaOperacao(opcao);
		
		if (opcaoOperacao == null) return;
		
		
		if (opcaoCalculadora.equals(ECalc.INTEGER))
		{
			lerCalcularValorInteger();
		}
		else{
			lerCalcularValorDouble();
		}
		
	}
	
	private void lerCalcularValorDouble(){
		
		operationView.mensagem("Digite o primeiro valor");
		Double first = LeitorUtil.lervalorDouble();
		operationView.mensagem("Digite o segundo valor");
		Double second =  LeitorUtil.lervalorDouble(); 
		Double result;
		ControllerDoubleCalc controllerDoubleCalc = new ControllerDoubleCalc();
		
		if (opcaoOperacao.equals(EOperacao.SOMA))
		{
			result = controllerDoubleCalc.sum(first, second);
		}
		else if (opcaoOperacao.equals(EOperacao.SUBTRACAO))
		{
			result = controllerDoubleCalc.substration(first, second);
		}
		else if (opcaoOperacao.equals(EOperacao.MULTIPLICACAO))
		{
			result = controllerDoubleCalc.multiplication(first, second);
		}
		else{
			result = controllerDoubleCalc.division(first, second);
		}
		
		operationView.mensagem("Resultado: "+result);
		
	}
	
	private void lerCalcularValorInteger(){
		operationView.mensagem("Digite o primeiro valor");
		Integer first = LeitorUtil.lervalorInteiro();
		
		operationView.mensagem("Digite o segundo valor");
		Integer second =  LeitorUtil.lervalorInteiro(); 
		
		Integer result;
		ControllerIntegerCalc controller = new ControllerIntegerCalc();
		
		if (opcaoOperacao.equals(EOperacao.SOMA))
		{
			result = controller.sum(first, second);
		}
		else if (opcaoOperacao.equals(EOperacao.SUBTRACAO))
		{
			result = controller.substration(first, second);
		}
		else if (opcaoOperacao.equals(EOperacao.MULTIPLICACAO))
		{
			result = controller.multiplication(first, second);
		}
		else{
			result = controller.division(first, second);
		}
		
		operationView.mensagem("Resultado: "+result);
		
	}
	
	private void verificandoOpcaoEscolhidaOperacao(int opcao) {
		switch (opcao) {
		case 1: {
			opcaoOperacao = EOperacao.SOMA;
			break;
		}

		case 2: {
			opcaoOperacao = EOperacao.SUBTRACAO;
			break;

		}
		case 3:{
			opcaoOperacao = EOperacao.DIVISAO;
			break;
		}
		case 4:{
			opcaoOperacao = EOperacao.MULTIPLICACAO;
			break;
		}
		default: {
			System.out.println("Opcao nao existe! Programa desligando");
		}

		}
	}
	
}
