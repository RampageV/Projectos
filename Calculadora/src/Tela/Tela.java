package Tela;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;

	public Tela() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Se não tiver esse método, mesmo que você aperte x, ele vai
														// está exercutando // está em exercução
		setSize(400, 600); // Tamanho da janela
		setLocationRelativeTo(null); // A calculadora abre no meio da tela.
		setVisible(true); // Método para ficar visivel, caso for false a janela não é mostrada.

		Container container = getContentPane();
		container.setLayout(new FlowLayout());

		JButton botao1 = new JButton("1");
		container.add(botao1, BorderLayout.CENTER);

		JButton botao2 = new JButton("2");
		container.add(botao2, BorderLayout.WEST);

		JButton botao3 = new JButton("3");
		container.add(botao3, BorderLayout.EAST);

		JButton botao4 = new JButton("4");
		container.add(botao4);

		JButton botao5 = new JButton("5");
		container.add(botao5);

		JButton botao6 = new JButton("6");
		container.add(botao6);

		setVisible(true);
	}

}
