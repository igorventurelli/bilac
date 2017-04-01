package br.com.bilac.usabilidade;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaEx1 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel jlAgencia;
	private JTextField jtfAgencia;
	private JLabel jlConta;
	private JTextField jtfConta;
	private JSeparator jSeparator1;
	private JLabel jlNome;
	private JTextField jtfNome;
	private JLabel jlEndereco;
	private JTextField jtfEndereco;
	private JLabel jlTelefone;
	private JTextField jtfTelefone;
	private JLabel jlCpf;
	private JTextField jtfCpf;
	private JRadioButton jrbCorrente;
	private JRadioButton jrbPoupanca;
	private ButtonGroup bgContas;
	private JSeparator jSeparator2;
	private JButton jbConsultar;
	private JButton jbAtualizar;
	private JButton jbFechar;


	public TelaEx1() {

		setSize(400, 255);
		setTitle("Usabilidade de sistemas e aplicativos");
		setResizable(false);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jlAgencia = new JLabel("Código da Agência:");
		jlAgencia.setBounds(10, 10, 110, 18);
		add(jlAgencia);

		jtfAgencia = new JTextField();
		jtfAgencia.setBounds(125, 10, 50, 20);
		add(jtfAgencia);

		jlConta = new JLabel("Número da Conta:");
		jlConta.setBounds(205, 10, 105, 18);
		add(jlConta);

		jtfConta = new JTextField();
		jtfConta.setBounds(315, 10, 60, 20);
		add(jtfConta);

		jSeparator1 = new JSeparator();
		jSeparator1.setBounds(10, 40, 365, 10);
		add(jSeparator1);

		jlNome = new JLabel("Nome:");
		jlNome.setBounds(10, 50, 60, 18);
		jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
		add(jlNome);

		jtfNome = new JTextField();
		jtfNome.setBounds(75, 50, 300, 20);
		add(jtfNome);

		jlEndereco = new JLabel("Endereço:");
		jlEndereco.setBounds(10, 75, 60, 18);
		jlEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
		add(jlEndereco);

		jtfEndereco = new JTextField();
		jtfEndereco.setBounds(75, 75, 300, 20);
		add(jtfEndereco);

		jlTelefone = new JLabel("Telefone:");
		jlTelefone.setBounds(10, 100, 60, 18);
		jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		add(jlTelefone);

		jtfTelefone = new JTextField();
		jtfTelefone.setBounds(75, 100, 300, 20);
		add(jtfTelefone);

		jlCpf = new JLabel("CPF:");
		jlCpf.setBounds(10, 125, 60, 18);
		add(jlCpf);

		jtfCpf = new JTextField();
		jtfCpf.setBounds(75, 125, 300, 20);
		add(jtfCpf);

		jrbCorrente = new JRadioButton("Conta Corrente");
		jrbCorrente.setBounds(100, 150, 111, 20);
		add(jrbCorrente);

		jrbPoupanca = new JRadioButton("Conta Poupança");
		jrbPoupanca.setBounds(255, 150, 118, 20);
		add(jrbPoupanca);

		bgContas = new ButtonGroup();
		bgContas.add(jrbCorrente);
		bgContas.add(jrbPoupanca);

		jSeparator2 = new JSeparator();
		jSeparator2.setBounds(10, 180, 365, 10);
		add(jSeparator2);

		jbConsultar = new JButton("Consultar");
		jbConsultar.setBounds(35, 190, 100, 23);
		add(jbConsultar);

		jbAtualizar = new JButton("Atualizar");
		jbAtualizar.setBounds(145, 190, 100, 23);
		jbAtualizar.setEnabled(false);
		add(jbAtualizar);

		jbFechar = new JButton("Fechar");
		jbFechar.setBounds(255, 190, 100, 23);
		add(jbFechar);

		setVisible(true);
	}
}
