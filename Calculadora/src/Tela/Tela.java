package Tela;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;

	/* Criação dos botões */
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
	Button B_Virgula = new Button(".");
	Button B_Ac = new Button("AC");
	Button B_Back = new Button("BackSpace");
	Button B_dividir = new Button("/");
	Button B_multiplica = new Button("X");
	Button B_mais = new Button("+");
	Button B_menos = new Button("-");
	JTextField janela = new JTextField();
	Double valor1, valor2; // Variaveis para números inteiros
	String Operacao;

	
	public Tela() {

		/* Criação da Janela */
		setTitle("Calculadora"); // Titulo da calculadora
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Se não tiver esse método, mesmo que você aperte x, ele vai //
														// // está exercutando a calculadora.
		setSize(323, 385); // Tamanho da janela
		setLocationRelativeTo(null); // A calculadora abre no meio da tela.
		setResizable(false); // Método para
		setVisible(true); // Método para ficar visivel, caso for false a janela não é mostrada.
		setLayout(null); /*
							 * Permite setar a forma como os componentes vão se ajustar na tela ao
							 * redimensiona-la.
							 */

		/* Janela para fazer os calculos */
		janela.setBounds(2, 10, 303, 80);
		janela.setText("0.00");
		janela.setFont(new Font("Serif", ABORT, 50));
		janela.setEnabled(false);/* Serve para o bloquear a tela e não possa ser clicada */
		add(janela);

		/* Chamada dos botões com seus métodos */
		B_Ac.setBounds(2, 100, 64, 41);
		add(B_Ac);
		B_Ac.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				LimparTela();
			}
		});

		B_Back.setBounds(80, 100, 66, 41);
		add(B_Back);
		B_Back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String str = janela.getText(); // Pega o que tem no getText é colocar na variavel str
				StringBuilder w = new StringBuilder(str); // StringBuilder é uma classe para manipular string
				str = String.valueOf(w.deleteCharAt(str.length() - 1)); // Apaga ultima string na posição -1 ou em
																		// outras palavras a ultima.

				if (str.length() == 0) { // Se caso
					janela.setText("0.00");
				} else {
					janela.setText(str);
				}
			}
		});

		B_mais.setBounds(240, 200, 64, 41);
		add(B_mais);
		B_mais.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(janela.getText());
				LimparTela();
				Operacao = "Mais";
			}
		});

		B_menos.setBounds(240, 150, 64, 41);
		add(B_menos);
		B_menos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(janela.getText());
				LimparTela();
				Operacao = "Menos";
			}
		});

		B_dividir.setBounds(160, 100, 64, 41);
		add(B_dividir);
		B_dividir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(janela.getText());
				LimparTela();
				Operacao = "Dividir";

			}
		});

		B_multiplica.setBounds(240, 100, 64, 41);
		add(B_multiplica);
		B_multiplica.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(janela.getText());
				LimparTela();
				Operacao = "Multiplicacao";

			}
		});

		B_igual.setBounds(240, 250, 64, 90);
		add(B_igual);
		B_igual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				valor2 = Double.parseDouble(janela.getText());

				if (Operacao == "Mais") {

					janela.setText(TirandoZero(valor1 + valor2));

				} else if (Operacao == "Menos") {

					janela.setText(TirandoZero(valor1 - valor2));

				} else if (Operacao == "Multiplicacao") {

					janela.setText(TirandoZero(valor1 * valor2));

				} else if (Operacao == "Dividir") {
					janela.setText(TirandoZero(valor1 / valor2));

				}

			}
		});

		B_Virgula.setBounds(160, 300, 64, 41);
		add(B_Virgula);
		B_Virgula.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				digitaNumero(".");
			}
		});

		botao9.setBounds(160, 150, 64, 41);
		add(botao9);
		botao9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				digitaNumero("9");

			}
		});

		botao8.setBounds(80, 150, 64, 41);
		add(botao8);
		botao8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				digitaNumero("8");

			}
		});

		botao7.setBounds(2, 150, 64, 41);
		add(botao7);
		botao7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				digitaNumero("7");
			}
		});

		botao6.setBounds(160, 200, 64, 41);
		add(botao6);
		botao6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				digitaNumero("6");

			}
		});

		botao5.setBounds(80, 200, 64, 41);
		add(botao5);
		botao5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				digitaNumero("5");
			}
		});

		botao4.setBounds(2, 200, 64, 41);
		add(botao4);
		botao4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				digitaNumero("4");
			}
		});

		botao3.setBounds(160, 250, 64, 41);
		add(botao3);
		botao3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				digitaNumero("3");

			}
		});

		botao2.setBounds(80, 250, 64, 41);
		add(botao2);
		botao2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				digitaNumero("2");

			}
		});

		botao1.setBounds(2, 250, 64, 41);
		add(botao1);
		botao1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				digitaNumero("1");
			}
		});

		botao0.setBounds(2, 300, 142, 41);
		add(botao0);
		botao0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				digitaNumero("0");

			}
		});
	}

	private String TirandoZero(Double calculo) { // Método criado para tira os 0 dos calculos

		String retorno = "";

		retorno = Double.toString(calculo); // Convertendo double para String

		if (calculo % 1 == 0) {// Verifica se numero tem o resto igual a 0
			retorno = retorno.substring(0, retorno.length() - 2); // Retorne a sequência da string a partir de um
																	// determinado ponto, nesse caso vai do 0 até -2 que
																	// esse menos dois seria o 0 e a ","
		}

		return retorno;

	}

	private void digitaNumero(String numero) {

		if (janela.getText().equals("0.00")) { // Caso seja primeira digitação, ele já vai amazenar o numero digitado na
												// variavel "numero"
			janela.setText(numero);

		} else {
			if (numero.equals(".") && janela.getText().contains(".")) { // Verificar se já tem uma virgula ou se está
																		// digitando uma virgula, caso tenha ele não
																		// digita outra virgula

			} else {
				janela.setText(janela.getText().concat(numero));
			}
		}
	}

	private void LimparTela() {// Método criado para limpar a tela da calculadora.
		janela.setText("");
	}

}
