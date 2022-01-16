package Tela;

import javax.swing.JFrame;

public class Tela extends JFrame {

	public Tela() {

		JFrame janela = new JFrame("Nova janela");// Criando o objeto.
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Quando você fecha a janela, é para encerra a aplicação.
		janela.setSize(400, 600); // Tamanho da janela
		janela.setVisible(true); // Método para ficar visivel, caso for false a janela não é mostrada.

	}

}
