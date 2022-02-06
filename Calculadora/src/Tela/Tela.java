package Tela;

import java.awt.Button;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	
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
	Button B_igual = new Button("=");
	Button B_Ponto = new Button(".");
	Button B_Ac = new Button("AC");
	Button B_porcentagem = new Button("%");
	Button B_dividir = new Button("/");
	Button B_multiplica = new Button("X");
	Button B_mais = new Button("+");
	Button B_menos = new Button("-");
	JTextField janela = new JTextField();
	
	public Tela() {
		
		/*Criação da Janela*/
		
		setTitle("Calculadora"); // Titulo da calculadora
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Se não tiver esse método, mesmo que você aperte x, ele vai está exercutando a calculadora.
		setSize(322, 499); // Tamanho da janela
		setLocationRelativeTo(null); // A calculadora abre no meio da tela.
		setResizable(false); // Método para 
		setVisible(true); // Método para ficar visivel, caso for false a janela não é mostrada.
		setLayout(null); // Permite setar a forma como os componentes vão se ajustar na tela ao redimensiona-la.
		
		/*Janela para fazer os calculos*/
		
		janela.setBounds(100, 50, 300, 50);
		janela.setEnabled(false);/*Serve para o bloquear a tela e não possa ser clicada*/
		add(janela);
		
		
		/*Chamada dos botões com seus métodos*/
		
		B_Ac.setBounds(2,100,64,41);
		add(B_Ac);
		
		B_porcentagem.setBounds(80,100,64,41);
		add(B_porcentagem);
		
		B_dividir.setBounds(160,100,64,41);
		add(B_dividir);
		
		B_multiplica.setBounds(240,100,64,41);
		add(B_multiplica);
		
		botao7.setBounds(2,150,64,41);
		add(botao7);
		
		botao8.setBounds(80,150,64,41);
		add(botao8);
		
		botao9.setBounds(160,150,64,41);
		add(botao9);
		
		B_menos.setBounds(240,150,64,41);
		add(B_menos);
		
		botao4.setBounds(2,200,64,41);
		add(botao4);
		
		botao5.setBounds(80,200,64,41);
		add(botao5);
		
		botao6.setBounds(160,200,64,41);
		add(botao6);
		
		B_mais.setBounds(240,200,64,41);
		add(B_mais);
		
		botao1.setBounds(2,250,64,41);
		add(botao1);
		
		botao2.setBounds(80,250,64,41);
		add(botao2);
		
		botao3.setBounds(160,250,64,41);
		add(botao3);
		
		botao0.setBounds(2,300,142,41);
		add(botao0);
		
		B_Ponto.setBounds(160,300,64,41);
		add(B_Ponto);
		
		B_igual.setBounds(240,250,64,90);
		add(B_igual);
		
		
	}

	
	
}
