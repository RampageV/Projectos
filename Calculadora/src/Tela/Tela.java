package Tela;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela extends JFrame {

	/*Criação dos botões*/
	Button botao0 = new Button("0");
	Button botao1 = new Button("1");
	Button botao2 = new Button("2");
	Button botao3 = new Button("3");
	Button botao4 = new Button("4");
	Button botao5 = new Button("5");
	Button botao6 = new Button("6");
	Button botao7 = new Button("7");
	Button botao8 = new Button("8");
	Button botao9 = new Button("9");
	
	public Tela() {
		
		/*Criação da Janela*/
		
		setTitle("Calculadora"); // Titulo da calculadora
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Se não tiver esse método, mesmo que você aperte x, ele vai está exercutando a calculadora.
		setSize(322, 499); // Tamanho da janela
		setLocationRelativeTo(null); // A calculadora abre no meio da tela.
		setResizable(false); // Método para 
		setVisible(true); // Método para ficar visivel, caso for false a janela não é mostrada.
		setLayout(null); // Permite setar a forma como os componentes vão se ajustar na tela ao redimensiona-la.
		
		
		/*Chamada dos botões com seus métodos*/
		
		botao0.setBounds(2,150,74,51);
		add(botao0);
		
		botao1.setBounds(77,150,74,51);
		add(botao1);
		
		botao2.setBounds(152,150,74,51);
		add(botao2);
		
	}

	
	
}
