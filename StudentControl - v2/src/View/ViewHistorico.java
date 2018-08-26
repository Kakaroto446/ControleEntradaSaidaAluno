package View;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewHistorico extends JFrame {

        JMenuBar barra;
        JMenu Ajuda;
	private JPanel contentPane;
	private JTextField txtRm;
	private JTextField txtNome;
	private JTable tbHist;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ViewHistorico() {
		super ("Histórico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
                barra = new JMenuBar();
                setJMenuBar(barra);
                Ajuda = new JMenu("Ajuda");
                barra.add(Ajuda);
                 Ajuda.addActionListener(new ActionListener() {
                     
                    public void actionPerformed(ActionEvent evt) {  
                    	JOptionPane.showMessageDialog (null, "Está é a página de consulta de históricos. Primeiro selecione se deseja pesquisar através do RM ou do Nome, logo após digite o mesmo. Em seguida clique em Enviar. Os resultados serão exibidos na tabela abaixo. "); 
                    }  
              });
                getContentPane().setBackground(java.awt.Color.white);
		
		JLabel lblProcurar = new JLabel("Procurar por:");
		lblProcurar.setBounds(185, 11, 80, 14);
		contentPane.add(lblProcurar);
		
		JRadioButton rdbtnRM = new JRadioButton("RM", false);	
		rdbtnRM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnRM.isSelected())
				txtRm.setEnabled(true);
				else txtRm.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnRM);
		rdbtnRM.setBounds(180, 32, 109, 23);
		contentPane.add(rdbtnRM);
		
		txtRm = new JTextField();
		txtRm.setEnabled(false);
		txtRm.setBounds(185, 55, 100, 20);
		contentPane.add(txtRm);
		txtRm.setColumns(10);
		
		JRadioButton rdbtnNome = new JRadioButton("Nome", false);
		rdbtnNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNome.isSelected())
				txtNome.setEnabled(true);
				else
				txtNome.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnNome);
		rdbtnNome.setBounds(180, 88, 109, 23);
		contentPane.add(rdbtnNome);
		
		txtNome = new JTextField();
		txtNome.setEnabled(false);
		txtNome.setBounds(185, 111, 100, 20);
		txtNome.setColumns(10);
		contentPane.add(txtNome);
		
		JScrollPane scpHist = new JScrollPane();
		scpHist.setBounds(15, 189, 450, 227);
		contentPane.add(scpHist);
		
		tbHist = new JTable();
		tbHist.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Curso", "Dia", "Horário", "Aula", "Autorização"
			}
		));
		scpHist.setViewportView(tbHist);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(185, 142, 100, 23);
		contentPane.add(btnEnviar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewTelaAluno tela = new ViewTelaAluno ();
				tela.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(185, 427, 100, 23);
		contentPane.add(btnVoltar);
	}
}