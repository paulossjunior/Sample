package br.ifes.leds.ensino.controller.view;

import br.ifes.leds.ensino.model.util.ECalc;
import br.ifes.leds.ensino.util.LeitorUtil;
import br.ifes.leds.ensino.view.MainView;

public class MainController {

	private ECalc opcaoCalculadora;

	private MainView mainView = new MainView();
	private OperationController operationController = new OperationController();

	public void start() {
		mainView.show();
		int opcao = LeitorUtil.lervalorInteiro();

		verificandoOpcaoEscolhidaMenuPrincipal(opcao);

		if (opcaoCalculadora != null) {
			
			operationController.setOpcaoCalculadora(opcaoCalculadora);
			
			operationController.showOpcoes();
		}

	}

	private void verificandoOpcaoEscolhidaMenuPrincipal(int opcao) {
		switch (opcao) {
		case 1: {
			opcaoCalculadora = ECalc.INTEGER;
			break;
		}

		case 2: {
			opcaoCalculadora = ECalc.DOUBLE;
			break;

		}
		case 3:
			mainView.mensagemFim();
			break;

		default: {
			mainView.mensagemOpcaoInvalida();
			mainView.mensagemFim();
			break;
		}

		}

	}

}
