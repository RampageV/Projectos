package Tela;

import javax.swing.JFrame;

public class Tela extends JFrame {

	public Tela() {

		JFrame janela = new JFrame("Nova janela");// Criando o objeto.
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Quando voc� fecha a janela, � para encerra a aplica��o.
		janela.setSize(400, 600); // Tamanho da janela
		janela.setVisible(true); // M�todo para ficar visivel, caso for false a janela n�o � mostrada.

	}

}
