package Tela;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaIMC extends JFrame {

	private static final long serialVersionUID = 4991268610808430327L;

	JButton resultado = new JButton("Resultado");
	
	public TelaIMC() {

		this.setTitle("IMC");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setResizable(false);
		this.setLayout(null);
		
	
		resultado.setBounds(100,100,100,100);
		add(resultado);

	}

}
