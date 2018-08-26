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


public class ViewTelaCoordenacao extends JFrame {
     JMenuBar barra;
        JMenu Ajuda;

	

	public ViewTelaCoordenacao() {
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
                    	JOptionPane.showMessageDialog (null, "Esta é a página do(a) coordenador(a). Aqui temos uma foto do mesmo, junto de algumas informações como por exemplo o ID, o nome e o cargo. "); 
                    }  
              });
                barra.add(Ajuda);
		
		JLabel lblIconCoord = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/exemplo.png")).getImage(); 
		lblIconCoord.setIcon(new ImageIcon(img));
		lblIconCoord.setBounds(44, 172, 80, 100);
		getContentPane().add(lblIconCoord);
		
		JLabel lblEmailCoord = new JLabel("Email:");
		lblEmailCoord.setBounds(149, 172, 46, 14);
		getContentPane().add(lblEmailCoord);
		
		JLabel lblEmailCoordShow = new JLabel("");
		lblEmailCoordShow.setBounds(185, 172, 220, 14);
		getContentPane().add(lblEmailCoordShow);
		
		JLabel lblNomeCoord = new JLabel("Nome:");
		lblNomeCoord.setBounds(149, 216, 46, 14);
		getContentPane().add(lblNomeCoord);
		
		JLabel lblNomeCoordShow = new JLabel("");
		lblNomeCoordShow.setBounds(185, 216, 142, 14);
		getContentPane().add(lblNomeCoordShow);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(149, 259, 46, 14);
		getContentPane().add(lblCargo);
		
		JLabel lblCargoShow = new JLabel("");
		lblCargoShow.setBounds(185, 259, 142, 14);
		getContentPane().add(lblCargoShow);
		
		JLabel lblID = new JLabel("ID:");
		lblID.setBounds(337, 215, 23, 14);
		getContentPane().add(lblID);
		
		JLabel lblIDShow = new JLabel("");
		lblIDShow.setBounds(363, 215, 100, 14);
		getContentPane().add(lblIDShow);
		
		JLabel lblContato = new JLabel("Contato:");
		lblContato.setBounds(337, 258, 50, 14);
		getContentPane().add(lblContato);
		
		JLabel lblContatoShow = new JLabel("");
		lblContatoShow.setBounds(363, 258, 100, 14);
		getContentPane().add(lblContatoShow);
		
		JPanel pnlPerfilCoord = new JPanel();
		pnlPerfilCoord.setBorder(new TitledBorder(null, "Bem-vindo!", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlPerfilCoord.setBounds(27, 133, 430, 163);
		getContentPane().add(pnlPerfilCoord);
		
		JButton btnHist = new JButton("Acessar hist\u00F3rico");
		btnHist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewHistoricoC hist = new ViewHistoricoC ();
				hist.setVisible(true);
				dispose();
			}
		});
		btnHist.setBounds(89, 309, 150, 23);
		getContentPane().add(btnHist);
		
		JButton btnReg = new JButton("Novo registro");
		btnReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewRegistro reg = new ViewRegistro (); 
				reg.setVisible(true);
				dispose();
			}
		});
		btnReg.setBounds(245, 309, 150, 23);
		getContentPane().add(btnReg);
		
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
		btnSair.setBounds(167, 343, 150, 23);
		getContentPane().add(btnSair);
                setVisible(true);
	}
}
