package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ViewStudentControl extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewStudentControl frame = new ViewStudentControl();
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
	public ViewStudentControl() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblimagem = new JLabel("");
		lblimagem.setIcon(new ImageIcon("/home/main/eclipse-workspace/StudentControl/logo.png"));
		lblimagem.setBounds(12, 12, 180, 401);
		contentPane.add(lblimagem);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("DejaVu Sans", Font.PLAIN, 24));
		lblLogin.setBounds(293, 12, 71, 29);
		contentPane.add(lblLogin);
		
		JLabel lblEntrarComo = new JLabel("Entrar como: ");
		lblEntrarComo.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblEntrarComo.setBounds(229, 53, 121, 29);
		contentPane.add(lblEntrarComo);
		
		JRadioButton rdbtnAluno = new JRadioButton("aluno");
		rdbtnAluno.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		rdbtnAluno.setBounds(209, 87, 71, 23);
		contentPane.add(rdbtnAluno);
		
		JRadioButton rdbtnCoordenador = new JRadioButton("coordenador");
		rdbtnCoordenador.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		rdbtnCoordenador.setBounds(293, 87, 141, 23);
		contentPane.add(rdbtnCoordenador);
		
		JLabel lblRmOuId = new JLabel("RM ou ID:");
		lblRmOuId.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblRmOuId.setBounds(229, 118, 121, 15);
		contentPane.add(lblRmOuId);
		
		JTextField txtRmId = new JTextField();
		txtRmId.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		txtRmId.setBounds(210, 145, 140, 23);
		contentPane.add(txtRmId);
		txtRmId.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblSenha.setBounds(229, 180, 66, 15);
		contentPane.add(lblSenha);
		
		passwd = new JPasswordField();
		passwd.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		passwd.setBounds(210, 204, 140, 23);
		contentPane.add(passwd);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("DejaVu Sans", Font.PLAIN, 18));
		btnEntrar.setBounds(210, 239, 140, 45);
		contentPane.add(btnEntrar);
		
		JButton btnCad = new JButton("Cadastrar-se");
		btnCad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCadastro cad = new ViewCadastro();
				cad.setVisible(true);
			}
		});
		btnCad.setBounds(379, 283, 130, 25);
		contentPane.add(btnCad);
		
		JButton btnEsqueceuASenha = new JButton("esqueceu a senha?");
		btnEsqueceuASenha.setBounds(329, 320, 180, 25);
		contentPane.add(btnEsqueceuASenha);
	}
}