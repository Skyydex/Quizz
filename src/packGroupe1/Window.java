package packGroupe1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Window extends JFrame{
	
	private JPanel jpfenetre, jpind1, jpind2,jpind3, jpnomauteur, jpnomtheme;
	private JLabel jltheme,jlnomtheme,jlauteur,jlreponse, jlclue1, jlclue2, jlclue3, jlnameauthor;
	private JTextField jtanswer;
	private JButton jbdelete,jbok;

	public static void main(String[] args){
		new Window().setVisible(true);
	}
	
	public Window(){
		Dimension tailleEcran = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize((int)tailleEcran.getWidth()/2,(int)tailleEcran.getHeight()/2);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Question");
		
		this.setLayout(getGameLayout());
	}

	/**
	 * Create the main game layout
	 * @return the main game layout
	 */
	public GroupLayout getGameLayout() {
		GroupLayout gl= new GroupLayout(this.getContentPane());
			
		gl.setHorizontalGroup(gl.createParallelGroup()
				.addGroup(gl.createSequentialGroup()
						.addComponent(getJltheme())
						.addComponent(getJpnametheme())
						.addComponent(getJlauthor())
						.addComponent(getJpnameauthor())
				)
				.addGroup(gl.createParallelGroup()
						.addComponent(getJclue1())
						.addComponent(getJclue2())
						.addComponent(getJclue3())
				)
				.addGroup(gl.createSequentialGroup()	
						.addComponent(getJlanswer())
						.addComponent(getJtanswer())
						.addComponent(getJbdelete())
						.addComponent(getJbok())
				)
		);
		
		gl.setVerticalGroup(gl.createSequentialGroup()
				.addGroup(gl.createParallelGroup(Alignment.BASELINE)
						.addComponent(getJltheme())
						.addComponent(getJpnametheme())
						.addComponent(getJlauthor())
						.addComponent(getJpnameauthor())
					)
				.addGroup(gl.createSequentialGroup()
						.addComponent(getJclue1())
						.addComponent(getJclue2())
						.addComponent(getJclue3())
				)
				.addGroup(gl.createParallelGroup(Alignment.BASELINE)
						.addComponent(getJlanswer())
						.addComponent(getJtanswer())
						.addComponent(getJbdelete())
						.addComponent(getJbok())
				)
		);
		
		gl.linkSize(SwingConstants.VERTICAL, getJltheme(), getJpnametheme(), getJlauthor(), getJpnameauthor());
		gl.setAutoCreateContainerGaps(true);
		gl.setAutoCreateGaps(true);
		return gl;
	}
	
	//Panel
	public JPanel getJclue1() {
		if(jpind1==null) {
			jpind1=new JPanel(new GridLayout(1,1));
			jpind1.add(getJlclue1());
			jpind1.setBorder(BorderFactory.createTitledBorder(""));
		}
		return jpind1;
	}

	public JPanel getJclue2() {
		if(jpind2==null) {
			jpind2=new JPanel(new GridLayout(1,1));
			jpind2.add(getJlclue2());
			jpind2.setBorder(BorderFactory.createTitledBorder(""));
		}
		return jpind2;
	}

	public JPanel getJclue3() {
		if(jpind3==null) {
			jpind3=new JPanel(new GridLayout(1,1));
			jpind3.add(getJlclue3());
			jpind3.setBorder(BorderFactory.createTitledBorder(""));
		}
		return jpind3;
	}
	
	public JPanel getJpnameauthor() {
		if(jpnomauteur==null) {
			jpnomauteur=new JPanel(new GridLayout(1,1));
			jpnomauteur.add(getJlnameauthor());
			jpnomauteur.setBorder(BorderFactory.createTitledBorder(""));
		}
		return jpnomauteur;
	}
	
	public JPanel getJpnametheme() {
		if(jpnomtheme==null) {
			jpnomtheme=new JPanel(new GridLayout(1,1));
			jpnomtheme.add(getJlnametheme());
			jpnomtheme.setBorder(BorderFactory.createTitledBorder(""));
			jpnomtheme.setBackground(Color.WHITE);
		}
		return jpnomtheme;
	}
	
	//Button
	public JButton getJbdelete() {
		if(jbdelete==null)
			jbdelete=new JButton("Effacer");
		return jbdelete;
	}

	public JButton getJbok() {
		if(jbok==null)
			jbok=new JButton("OK");
		return jbok;
	}
	
	//Label
	public JLabel getJltheme() {
		if(jltheme==null)
			jltheme=new JLabel("Thème:");
		return jltheme;
	}

	public JLabel getJlnametheme() {
		if(jlnomtheme==null) {
			jlnomtheme=new JLabel("Femmes célèbres");
		}
		return jlnomtheme;
	}

	public JLabel getJlauthor() {
		if(jlauteur==null)
			jlauteur=new JLabel("Auteur:");
		return jlauteur;
	}

	public JLabel getJlanswer() {
		if(jlreponse==null)
			jlreponse=new JLabel(" Réponse ");
		return jlreponse;
	}
	
	public JLabel getJlclue1() {
		if(jlclue1==null) {
			jlclue1 = new JLabel("Je suis une femme de lettres née en Grande Bretagne en 1965");
		}
		return jlclue1;
	}
	
	public JLabel getJlclue2() {
		if(jlclue2==null) {
			jlclue2 = new JLabel("Je suis l'une des femmes les plus riches du monde");
		}
		return jlclue2;
	}
	
	public JLabel getJlclue3() {
		if(jlclue3==null) {
			jlclue3 = new JLabel("J'ai imaginé Harry Potter");
		}
		return jlclue3;
	}
	
	public JLabel getJlnameauthor() {
		if(jlnameauthor==null) {
			jlnameauthor = new JLabel("Alexandre");
		}
		return jlnameauthor;
	}
	
	//TextField
	public JTextField getJtanswer() {
		if(jtanswer==null) {
			jtanswer = new JTextField();
		}
		return jtanswer;
	}
}