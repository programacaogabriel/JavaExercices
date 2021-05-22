package br.com.jcavitreinamentos.exercicio1505;

import java.awt.Font;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CadastroCliente extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel codigoCliente;
	private JLabel nomeCliente;
	private JLabel cpfCliente;
	private JLabel dataNascimentoCliente;
	private JLabel sexoCliente;
	private JLabel telefoneCliente;
	private JLabel celularCliente;
	private JLabel enderecoCliente;
	private JLabel estadoCliente;
	private JLabel emailCliente;
	
	
	private JTextField txtNomeCliente;
	private JTextField txtEmailCliente;


	
	

	public CadastroCliente() throws ParseException {
		super("Cadastro Cliente");
		String [] sexo = {"Masculno","Feminino","Prefiro não dizer","Preferencial"};
		String [] estado = {"SC","AC","AL","AP","AM","BA","CE","DF","ES","GO","MA","MT",
				 "MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"};
		
		// Define os nomes
		codigoCliente = new JLabel("Código");
		codigoCliente.setFont(new Font("Serif", Font.BOLD, 15));
		codigoCliente.setToolTipText("Apenas Números");
		codigoCliente.setBounds(20,10,50,30);
		add(codigoCliente);
		
		nomeCliente = new JLabel("Nome ");
		nomeCliente.setFont(new Font("Serif", Font.BOLD, 15));
		nomeCliente.setToolTipText("Insira o nome completo");
		nomeCliente.setBounds(20, 65, 100, 30);
		add(nomeCliente);

		cpfCliente = new JLabel("CPF ");
		cpfCliente.setFont(new Font("Serif", Font.BOLD, 15));
		cpfCliente.setToolTipText("Insira apenas números");
		cpfCliente.setBounds(20, 210, 100, 30);
		add(cpfCliente);

		dataNascimentoCliente = new JLabel("Data de Nasc.");
		dataNascimentoCliente.setFont(new Font("Serif", Font.BOLD, 15));
		dataNascimentoCliente.setToolTipText("Insira Apenas números");
		dataNascimentoCliente.setBounds(20, 96, 100, 60);
		add(dataNascimentoCliente);
		
		sexoCliente = new JLabel("Gênero ");
		sexoCliente.setFont(new Font("Serif", Font.BOLD, 15));
		sexoCliente.setBounds(380, 117, 100 , 30);
		add(sexoCliente);
		
		telefoneCliente = new JLabel("Telefone ");
		telefoneCliente.setFont(new Font("Serif", Font.BOLD, 15));
		telefoneCliente.setBounds(20,143,100,60);
		add(telefoneCliente);
		
		celularCliente = new JLabel("Celular ");
		celularCliente.setFont(new Font("Serif", Font.BOLD, 15));
		celularCliente.setBounds(380,143,100,60);
		add(celularCliente);
		
		enderecoCliente = new JLabel("Endereco ");
		enderecoCliente.setFont(new Font("Serif", Font.BOLD, 15));
		enderecoCliente.setBounds(20,230,100,60);
		add(enderecoCliente);
		
		estadoCliente = new JLabel("Estado ");
		estadoCliente.setFont(new Font("Serif", Font.BOLD, 15));
		estadoCliente.setBounds(380,230,100,60);
		add(estadoCliente);
		
		emailCliente = new JLabel("E-mail ");
		emailCliente.setFont(new Font("Serif", Font.BOLD, 15));
		emailCliente.setBounds(20,402,100,60);
		add(emailCliente);
		
		
		// Preencher os requisitos
		txtNomeCliente = new JTextField();
		txtNomeCliente.setBounds(75, 70, 466, 25);
		add(txtNomeCliente);

		JComboBox combo = new JComboBox(sexo);
		combo.setToolTipText("Escolha seu sexo");
		combo.setBounds(440, 120, 100 , 25);
		add(combo);

		JTextArea enderecoCliente = new JTextArea();
		enderecoCliente.setToolTipText("Digite seu endereço");
		enderecoCliente.setBounds(80,280,280,100);
		add(enderecoCliente);
				
		JComboBox combo1 = new JComboBox(estado);
		combo1.setToolTipText("Escolha seu estado");
		combo1.setBounds(440, 280, 100 , 25);
		add(combo1);
		
		txtEmailCliente = new JTextField();
		txtEmailCliente.setBounds(75,420, 466, 25);
		add(txtEmailCliente);
		
		
		// Define as máscaras
		MaskFormatter dataNascimento = null;
		MaskFormatter codigo =null;
		MaskFormatter telefone = null;
		MaskFormatter celular = null;
		MaskFormatter cpf = null;
		

		try {
			codigo = new MaskFormatter("####");
			dataNascimento = new MaskFormatter("##/##/####");
			dataNascimento.setPlaceholderCharacter('_');
			telefone = new MaskFormatter("(##)####-####");
			telefone.setPlaceholder("_");
			celular = new MaskFormatter("(##)#####-####");
			celular.setPlaceholder("_");
			cpf = new MaskFormatter("###.###.###-##");
			cpf.setPlaceholder("_");
		} catch (ParseException excp) {
			System.err.println("Erro na formatação: " + excp.getMessage());
			System.exit(-1);
		}
		
		
		JFormattedTextField jFormattedTextData = new JFormattedTextField(dataNascimento);
		jFormattedTextData.setBounds(120, 116, 70,25);
		add(jFormattedTextData);
		
		JFormattedTextField jFormattedTextCodigo = new JFormattedTextField(codigo);
		jFormattedTextCodigo.setBounds(20, 35, 50, 20);
		add(jFormattedTextCodigo);
		
		JFormattedTextField jFormattedTextTelefone = new JFormattedTextField(telefone);
		jFormattedTextTelefone.setBounds(120,158,100,30);
		add(jFormattedTextTelefone);
		
		JFormattedTextField jFormattedTextCelular = new JFormattedTextField(celular);
		jFormattedTextCelular.setBounds(440,158,100,30);
		add(jFormattedTextCelular);
		
		JFormattedTextField jFormattedTextCpf = new JFormattedTextField(cpf);
		jFormattedTextCpf.setBounds(120,208,100,30);
		add(jFormattedTextCpf);

		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		setVisible(true);

	}

	public static void main(String[] args) throws ParseException {
		new CadastroCliente();
	}
}

/*
 * Nome: Data Nascimento: CPF: Telefone: Celular: e-mail:
 * 
 * 
 * Endereço  Estado/Choose
 */
