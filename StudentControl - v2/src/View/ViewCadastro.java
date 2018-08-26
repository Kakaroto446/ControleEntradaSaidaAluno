package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCadastro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadastro frame = new ViewCadastro();
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
	public ViewCadastro() {
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setFont(new Font("DejaVu Sans", Font.PLAIN, 24));
		lblCadastro.setBounds(204, 12, 113, 44);
		contentPane.add(lblCadastro);
		
		JRadioButton rdbtnAluno = new JRadioButton("Aluno");
		rdbtnAluno.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		rdbtnAluno.setBounds(169, 94, 71, 23);
		contentPane.add(rdbtnAluno);
		
		JRadioButton rdbtnCoordenador = new JRadioButton("Coordenador");
		rdbtnCoordenador.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		rdbtnCoordenador.setBounds(275, 94, 141, 23);
		contentPane.add(rdbtnCoordenador);
		
		JLabel lblVoc = new JLabel("Você é:");
		lblVoc.setFont(new Font("DejaVu Sans", Font.PLAIN, 16));
		lblVoc.setBounds(224, 60, 66, 15);
		contentPane.add(lblVoc);
		
		JButton btnPoximo = new JButton("Próximo");
		btnPoximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnAluno.isSelected())
			    {ViewCadastroAluno cadaluno = new ViewCadastroAluno();
			    cadaluno.setVisible(true);}
			    else
			        if(rdbtnCoordenador.isSelected())
			    {ViewCadastroCoordenacao cadcoor = new ViewCadastroCoordenacao();
			    cadcoor.setVisible(true);}			    
			    dispose();
			}
		});
		btnPoximo.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		btnPoximo.setBounds(204, 141, 110, 25);
		contentPane.add(btnPoximo);
	}
}
