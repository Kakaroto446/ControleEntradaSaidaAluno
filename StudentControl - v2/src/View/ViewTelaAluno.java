package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;


public class ViewTelaAluno extends JFrame {

     JMenuBar barra;
        JMenu Ajuda;
	

	public ViewTelaAluno() {
		super ("Tela Inicial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
                barra = new JMenuBar();
                setJMenuBar(barra);
                Ajuda = new JMenu("Ajuda");
                Ajuda.addActionListener(new ActionListener() {
                     
                    public void actionPerformed(ActionEvent evt) {  
                    	JOptionPane.showMessageDialog (null, "Está é a página do Aluno. Onde temos sua foto e algumas informações sobre o mesmo. Como RM, Nome, Ano e Curso. "); 
                    }  
              });
                barra.add(Ajuda);
                getContentPane().setBackground(java.awt.Color.white);
		
		JLabel lblIconAluno = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/exemplo.png")).getImage(); 
		lblIconAluno.setIcon(new ImageIcon(img));
		lblIconAluno.setBounds(44, 172, 80, 100);
		getContentPane().add(lblIconAluno);
		
		JLabel lblEmailAluno = new JLabel("Email:");
		lblEmailAluno.setBounds(149, 172, 46, 14);
		getContentPane().add(lblEmailAluno);
		
		JLabel lblEmailAlunoShow = new JLabel("");
		lblEmailAlunoShow.setBounds(185, 172, 220, 14);
		getContentPane().add(lblEmailAlunoShow);
		
		JLabel lblNomeAluno = new JLabel("Nome:");
		lblNomeAluno.setBounds(149, 216, 46, 14);
		getContentPane().add(lblNomeAluno);
		
		JLabel lblNomeAlunoShow = new JLabel("");
		lblNomeAlunoShow.setBounds(185, 216, 142, 14);
		getContentPane().add(lblNomeAlunoShow);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(149, 259, 46, 14);
		getContentPane().add(lblCurso);
		
		JLabel lblCursoShow = new JLabel("");
		lblCursoShow.setBounds(185, 259, 142, 14);
		getContentPane().add(lblCursoShow);
		
		JLabel lblRM = new JLabel("RM:");
		lblRM.setBounds(337, 215, 23, 14);
		getContentPane().add(lblRM);
		
		JLabel lblRMShow = new JLabel("");
		lblRMShow.setBounds(363, 215, 100, 14);
		getContentPane().add(lblRMShow);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setBounds(337, 258, 46, 14);
		getContentPane().add(lblAno);
		
		JLabel lblAnoShow = new JLabel("");
		lblAnoShow.setBounds(363, 258, 100, 14);
		getContentPane().add(lblAnoShow);
		
		JPanel pnlPerfil = new JPanel();
		pnlPerfil.setBorder(new TitledBorder(null, "Bem-vindo!", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlPerfil.setBounds(27, 133, 430, 163);
		getContentPane().add(pnlPerfil);
		
		JButton btnHist = new JButton("Acessar hist\u00F3rico");
		btnHist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewHistorico hist = new ViewHistorico();
				hist.setVisible(true);
				dispose();
			}
		});
		btnHist.setBounds(95, 307, 150, 23);
		getContentPane().add(btnHist);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcao;
				opcao = JOptionPane.showConfirmDialog(null,
						"Deseja mesmo sair?",
						"Fechar",JOptionPane.YES_NO_OPTION);
				if (opcao == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnSair.setBounds(255, 307, 150, 23);
		getContentPane().add(btnSair);
                
                setVisible(true);
	}
}


    

