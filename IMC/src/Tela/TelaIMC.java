package Tela;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaIMC extends JFrame {

	private static final long serialVersionUID = 4991268610808430327L;

	JButton resultado = new JButton("Calcular");
	JLabel altura = new JLabel("Altura:");
	JTextField C_altura = new JTextField();
	JLabel Peso = new JLabel("Peso:");
	JTextField C_Peso = new JTextField();
	JTextField janela = new JTextField();
	Double result;
	
	public TelaIMC() {

		this.setTitle("Calcular IMC");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 400);
		this.setResizable(false);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		
		altura.setBounds(10,10,50,50);
		altura.setFont(new Font("Serif",Font.BOLD,15));
		add(altura);
		
		C_altura.setBounds(60,20,150,30);
		add(C_altura);
		
		Peso.setBounds(15,60,50,50);
		Peso.setFont(new Font("Serif",Font.BOLD,15));
		add(Peso);
		
		C_Peso.setBounds(60,70,150,30);
		add(C_Peso);

		resultado.setBounds(85,198,110,40);
		add(resultado);
		resultado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				Double altura = Double.parseDouble(C_altura.getText());
				Double peso = Double.parseDouble(C_Peso.getText());
				
				Double result = peso / (altura*altura);
				
				janela.setFont(new Font("Serif",Font.BOLD,15));
				janela.setDisabledTextColor(Color.white);
				
				StatusImc(result);
			
				
			}
		});
		
		janela.setBounds(10,250,265,100);
	    janela.setBackground(Color.BLACK);
		janela.setEnabled(false);
		add(janela);
		
	}
	
	private void StatusImc(Double resultado) {
		
		if(resultado <= 18.5) {
			janela.setText("Seu IMC: " + new DecimalFormat("#.##").format(resultado) + " | Status: Magreza");
			
		}else if(resultado > 18.5 && resultado <= 24.9) {
			janela.setText("Seu IMC: " + new DecimalFormat("#.##").format(resultado) + " | Status: Normal");
			
		}else if(resultado > 25.0 && resultado <= 29.9) {
			janela.setText("Seu IMC: " + new DecimalFormat("#.##").format(resultado) + " | Status: SOBREPESO");
			
		}else if(resultado > 30.0 && resultado <= 39.9) {
			janela.setText("Seu IMC: " + new DecimalFormat("#.##").format(resultado) + " | Status: OBESIDADE");
		}else if(resultado >= 40.0) {
			janela.setText("Seu IMC: " + new DecimalFormat("#.##").format(resultado) + " | Status: OBESIDADE GRAVE");
		}
	}

}
