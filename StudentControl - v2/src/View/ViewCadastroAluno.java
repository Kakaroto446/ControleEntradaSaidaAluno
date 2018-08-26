package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import Controller.Conexao;


public class ViewCadastroAluno extends JFrame {

	private JPanel contentPane;
	private FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo de imagem","jpg");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadastroAluno frame = new ViewCadastroAluno();
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
	public ViewCadastroAluno() {
		setTitle("Cadastro do Aluno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblCadastroDeAluno = new JLabel("Cadastro de aluno:");
		lblCadastroDeAluno.setFont(new Font("DejaVu Sans", Font.PLAIN, 24));
		lblCadastroDeAluno.setBounds(22, 12, 239, 36);
		contentPane.add(lblCadastroDeAluno);
		
		JLabel lblNomeAluno = new JLabel("Nome:");
		lblNomeAluno.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblNomeAluno.setBounds(31, 75, 52, 15);
		contentPane.add(lblNomeAluno);
		
		JLabel lblRm = new JLabel("RM:");
		lblRm.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblRm.setBounds(32, 102, 66, 15);
		contentPane.add(lblRm);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblSenha.setBounds(195, 102, 66, 15);
		contentPane.add(lblSenha);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblEmail.setBounds(32, 129, 66, 15);
		contentPane.add(lblEmail);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblCurso.setBounds(32, 156, 66, 15);
		contentPane.add(lblCurso);
		
		JTextField txtNome = new JTextField();
		txtNome.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		txtNome.setBounds(79, 73, 114, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JTextField txtRM = new JTextField();
		txtRM.setBounds(63, 100, 114, 19);
		contentPane.add(txtRM);
		txtRM.setColumns(10);
		
		JTextField txtEmailAluno = new JTextField();
		txtEmailAluno.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		txtEmailAluno.setBounds(79, 129, 114, 19);
		contentPane.add(txtEmailAluno);
		txtEmailAluno.setColumns(10);
		
		JPasswordField psswdAluno = new JPasswordField();
		psswdAluno.setBounds(247, 100, 114, 19);
		psswdAluno.setColumns(10);
		contentPane.add(psswdAluno);		
		
		JComboBox cmbx = new JComboBox();
		cmbx.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		cmbx.setModel(new DefaultComboBoxModel(new String[] {"Administração", "Informática", "Logística", "Serviços Jurídicos"}));
		cmbx.setBounds(79, 156, 147, 24);
		contentPane.add(cmbx);
		
		JLabel lblResp = new JLabel("Dados do responsável:");
		lblResp.setFont(new Font("DejaVu Sans", Font.PLAIN, 20));
		lblResp.setBounds(22, 210, 239, 36);
		contentPane.add(lblResp);
		
		JLabel lblNomeResp = new JLabel("Nome:");
		lblNomeResp.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblNomeResp.setBounds(31, 258, 52, 15);
		contentPane.add(lblNomeResp);
		
		JTextField txtNomeResp = new JTextField();
		txtNomeResp.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		txtNomeResp.setBounds(79, 256, 114, 19);
		contentPane.add(txtNomeResp);
		txtNomeResp.setColumns(10);
		
		JLabel lblEmailResp = new JLabel("E-mail:");
		lblEmailResp.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblEmailResp.setBounds(31, 285, 46, 15);
		contentPane.add(lblEmailResp);
		
		JTextField txtEmailResp = new JTextField();
		txtEmailResp.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		txtEmailResp.setBounds(79, 283, 114, 19);
		contentPane.add(txtEmailResp);
		txtEmailResp.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblTelefone.setBounds(31, 312, 66, 15);
		contentPane.add(lblTelefone);
		
		JTextField txtFoneResp = new JTextField();
		txtFoneResp.setBounds(100, 310, 114, 19);
		contentPane.add(txtFoneResp);
		txtFoneResp.setColumns(10);
		
		Model.ModelAluno modelaluno = new Model.ModelAluno();

		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		btnCadastrar.setBounds(63, 358, 110, 25);
		contentPane.add(btnCadastrar);

		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCadastro cad = new ViewCadastro();
				cad.setVisible(true);
			}
		});
		btnVoltar.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		btnVoltar.setBounds(445, 358, 110, 25);
		contentPane.add(btnVoltar);
		btnCadastrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
				modelaluno.setNome(txtNome.getText());
				modelaluno.setSenha(psswdAluno.getText());
				modelaluno.setEmail(txtEmailAluno.getText());
				modelaluno.setCurso(cmbx.getSelectedItem().toString());
				modelaluno.setResp(txtNomeResp.getText());
				modelaluno.setEmailResp(txtEmailResp.getText());
				modelaluno.setFoneResp(txtFoneResp.getText());
				
				Connection connection = Conexao.getConnection();
				String sql = "insert into alunos(senha, email, nome, curso, NomeResp, EmailResp, Telefone) values ('"+modelaluno.getSenha()+"','"+modelaluno.getEmail()+"','"+modelaluno.getNome()+"','"+modelaluno.getCurso()+"','"+modelaluno.getResp()+"','"+modelaluno.getEmailResp()+"','"+modelaluno.getFoneResp()+"');";
				PreparedStatement prepareStatement = connection.prepareStatement(sql);		//cria o objeto prepareStatement e dá a ele a string com o comando
				prepareStatement.executeUpdate();		//executa
				prepareStatement.close();
				}
				catch (Exception f) {
					f.printStackTrace();		
				}
			}
		});
		JButton btnImportarFoto = new JButton("Importar foto");
		
		btnImportarFoto.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		btnImportarFoto.setBounds(397, 151, 122, 25);
		contentPane.add(btnImportarFoto);
		
		JLabel lblFoto = new JLabel("");
		lblFoto.setIcon(null);
		lblFoto.setBackground(Color.WHITE);
		lblFoto.setBounds(416, 35, 83, 96);
		contentPane.add(lblFoto);
		
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

