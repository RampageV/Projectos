package Tela;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;

	/* Cria��o dos bot�es */
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
	int valor1, valor2; // Variaveis para n�meros inteiros
	Double valor3, valor4; // Variaveis para n�meros com casas decimais
	String Operacao;

	public Tela() {

		/* Cria��o da Janela */
		setTitle("Calculadora"); // Titulo da calculadora
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Se n�o tiver esse m�todo, mesmo que voc� aperte x, ele vai //
														// est� exercutando a calculadora.
		setSize(323, 385); // Tamanho da janela
		setLocationRelativeTo(null); // A calculadora abre no meio da tela.
		setResizable(false); // M�todo para
		setVisible(true); // M�todo para ficar visivel, caso for false a janela n�o � mostrada.
		setLayout(null); /*
							 * Permite setar a forma como os componentes v�o se ajustar na tela ao
							 * redimensiona-la.
							 */

		/* Janela para fazer os calculos */
		janela.setBounds(2, 10, 303, 80);
		janela.setFont(new Font("Serif", ABORT, 50));
		janela.setEnabled(false);/* Serve para o bloquear a tela e n�o possa ser clicada */
		add(janela);

		/* Chamada dos bot�es com seus m�todos */
		B_Ac.setBounds(2, 100, 64, 41);
		add(B_Ac);
		B_Ac.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				LimparTela();

			}
		});

		B_mais.setBounds(240, 200, 64, 41);
		add(B_mais);
		B_mais.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Integer.parseInt(janela.getText());
				LimparTela();
				Operacao = "Mais";
			}
		});

		B_menos.setBounds(240, 150, 64, 41);
		add(B_menos);
		B_menos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Integer.parseInt(janela.getText());
				LimparTela();
				Operacao = "Menos";
			}
		});
		B_porcentagem.setBounds(80, 100, 64, 41);
		add(B_porcentagem);

		B_dividir.setBounds(160, 100, 64, 41);
		add(B_dividir);
		B_dividir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor3 = Double.parseDouble(janela.getText());
				Operacao = "Dividir";

			}
		});

		B_multiplica.setBounds(240, 100, 64, 41);
		add(B_multiplica);
		B_multiplica.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor3 = Double.parseDouble(janela.getText());
				LimparTela();
				Operacao = "Multiplicacao";

			}
		});

		B_igual.setBounds(240, 250, 64, 90);
		add(B_igual);
		B_igual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				valor2 = Integer.parseInt(janela.getText());
				valor4 = Double.parseDouble(janela.getText());

				if (Operacao == "Mais") {

					janela.setText(String.valueOf(valor1 + valor2));

				} else if (Operacao == "Menos") {

					janela.setText(String.valueOf(valor1 - valor2));

				} else if (Operacao == "Multiplicacao") {

					janela.setText(String.valueOf(valor3 * valor4));

				} else if (Operacao == "Dividir") {
					janela.setText(String.valueOf(valor3 / valor4));
				}

			}
		});

		B_Ponto.setBounds(160, 300, 64, 41);
		add(B_Ponto);
		B_Ponto.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

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

	private void digitaNumero(String numero) { // M�todo criado para a calculadora digitar um n�mero.
		janela.setText(janela.getText().concat(numero));
	}

	private void LimparTela() { // M�todo criado para limpar a tela da calculadora.
		janela.setText("");
	}

}
