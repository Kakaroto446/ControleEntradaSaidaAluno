package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import Controller.Conexao;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ViewCadastroCoordenacao extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeCoor;
	private JTextField txtID;
	private JPasswordField passwdCoor;
	private JTextField txtEmailCoor;
	private JTextField txtFoneCoor;
	private FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo de imagem","jpg");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadastroCoordenacao frame = new ViewCadastroCoordenacao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewCadastroCoordenacao() {
		setTitle("Cadastro Coordenador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeCoor = new JLabel("Cadastro do coordenador:");
		lblCadastroDeCoor.setFont(new Font("DejaVu Sans", Font.PLAIN, 24));
		lblCadastroDeCoor.setBounds(22, 12, 331, 36);
		contentPane.add(lblCadastroDeCoor);
		
		JLabel lblNomeCoor = new JLabel("Nome:");
		lblNomeCoor.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblNomeCoor.setBounds(31, 75, 52, 15);
		contentPane.add(lblNomeCoor);
		
		txtNomeCoor = new JTextField();
		txtNomeCoor.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		txtNomeCoor.setBounds(85, 73, 114, 19);
		contentPane.add(txtNomeCoor);
		txtNomeCoor.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblId.setBounds(31, 102, 19, 15);
		contentPane.add(lblId);
		
		txtID = new JTextField();
		txtID.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		txtID.setBounds(57, 102, 114, 19);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		JLabel lblSenhaCoor = new JLabel("Senha:");
		lblSenhaCoor.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblSenhaCoor.setBounds(183, 102, 52, 15);
		contentPane.add(lblSenhaCoor);
		
		passwdCoor = new JPasswordField();
		passwdCoor.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		passwdCoor.setBounds(239, 102, 114, 19);
		contentPane.add(passwdCoor);
		
		JLabel lblEmailCoor = new JLabel("E-mail:");
		lblEmailCoor.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblEmailCoor.setBounds(31, 129, 66, 15);
		contentPane.add(lblEmailCoor);
		
		txtEmailCoor = new JTextField();
		txtEmailCoor.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		txtEmailCoor.setBounds(85, 127, 210, 19);
		contentPane.add(txtEmailCoor);
		txtEmailCoor.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblCargo.setBounds(31, 156, 52, 15);
		contentPane.add(lblCargo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Diretor(a)", "Coordenador(a)", "Professor(a)", "Secretário(a)"}));
		comboBox.setBounds(85, 151, 114, 24);
		contentPane.add(comboBox);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblTelefone.setBounds(217, 156, 66, 15);
		contentPane.add(lblTelefone);
		
		txtFoneCoor = new JTextField();
		txtFoneCoor.setBounds(287, 154, 114, 19);
		contentPane.add(txtFoneCoor);
		txtFoneCoor.setColumns(10);
		
		Model.Coordenacao modelcoordenacao = new Model.Coordenacao();
		
		JButton btnImportarFoto = new JButton("Importar foto");		
		btnImportarFoto.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		btnImportarFoto.setBounds(399, 124, 122, 25);
		contentPane.add(btnImportarFoto);
		
		JLabel lblFoto = new JLabel("");
		lblFoto.setIcon(null);
		lblFoto.setBackground(Color.WHITE);
		lblFoto.setBounds(416, 12, 83, 96);
		contentPane.add(lblFoto);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		btnCadastrar.setBounds(22, 198, 122, 36);
		contentPane.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					modelcoordenacao.setNomeCoor(txtNomeCoor.getText());
					modelcoordenacao.setSenhaCoor(passwdCoor.getText());
					modelcoordenacao.setEmailCoor(txtEmailCoor.getText());
					modelcoordenacao.setCargoCoor(comboBox.getSelectedItem().toString());
					modelcoordenacao.setFoneCoor(txtFoneCoor.getText());
					
					Connection connection = Conexao.getConnection();
					/*String sql = "insert into alunos(senha, email, nome, curso, NomeResp, EmailResp, Telefone) values ('"+modelcoordenacao.getSenha()+"','"+modelcoordenacao.getEmail()+"','"+modelcoordenacao.getNome()+"','"+modelcoordenacao.getCurso()+"','"+modelcoordenacao.getResp()+"','"+modelcoordenacao.getEmailResp()+"','"+modelcoordenacao.getFoneResp()+"');";
					PreparedStatement prepareStatement = connection.prepareStatement(sql);		//cria o objeto prepareStatement e dá a ele a string com o comando
					prepareStatement.executeUpdate();		//executa
					prepareStatement.close();*/
					}
					catch (Exception f) {
						f.printStackTrace();		
					}
				}
			});
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCadastro cad = new ViewCadastro();
				cad.setVisible(true);
			}
		});
		btnVoltar.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		btnVoltar.setBounds(399, 204, 110, 25);
		contentPane.add(btnVoltar);
		
		btnImportarFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//criar objeto Jchooser
				JFileChooser foto = new JFileChooser();
				foto.setFileFilter(filter);
				int option = foto.showOpenDialog(null);
				ImageIcon fotoesc = null;
				String caminho = null;				
				if(option==JFileChooser.APPROVE_OPTION) {
					caminho = foto.getCurrentDirectory().getPath() + "\" + jFileChooser.getSelectedFile().getName()"; // caminho do arquivo
			        fotoesc = new ImageIcon(caminho);
			        lblFoto.setIcon(fotoesc);
				}
			}
		});
	}
}
