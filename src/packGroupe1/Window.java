package packGroupe1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	private JPanel jpwindow, jpclue1, jpclue2,jpclue3, jpnameauthor, jpnametheme,jpscore;
	private JLabel jltheme,jlnametheme,jlauthor,jlanswer, jlclue1, jlclue2, jlclue3, jlnameauthor;
	private JTextField jtanswer;
	private JButton jbdelete,jbok;
	// Font Style
	private final String FONT_NAME = "Calibri";

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
		if(jpclue1==null) {
			jpclue1=new JPanel(new GridLayout(1,1));
			jpclue1.add(getJlclue1());
			jpclue1.setBorder(BorderFactory.createTitledBorder(""));
		}
		return jpclue1;
	}

	public JPanel getJclue2() {
		if(jpclue2==null) {
			jpclue2=new JPanel(new GridLayout(1,1));
			jpclue2.add(getJlclue2());
			jpclue2.setBorder(BorderFactory.createTitledBorder(""));
		}
		return jpclue2;
	}

	public JPanel getJclue3() {
		if(jpclue3==null) {
			jpclue3=new JPanel(new GridLayout(1,1));
			jpclue3.add(getJlclue3());
			jpclue3.setBorder(BorderFactory.createTitledBorder(""));
		}
		return jpclue3;
	}
	
	public JPanel getJpnameauthor() {
		if(jpnameauthor==null) {
			jpnameauthor=new JPanel(new GridLayout(1,1));
			jpnameauthor.add(getJlnameauthor());
			jpnameauthor.setBorder(BorderFactory.createTitledBorder(""));
		}
		return jpnameauthor;
	}
	
	public JPanel getJpnametheme() {
		if(jpnametheme==null) {
			jpnametheme=new JPanel(new GridLayout(1,1));
			jpnametheme.add(getJlnametheme());
			jpnametheme.setBorder(BorderFactory.createTitledBorder(""));
			jpnametheme.setBackground(Color.WHITE);
		}
		return jpnametheme;
	}
	
	//Button
	public JButton getJbdelete() {
		if(jbdelete==null){
			jbdelete=new JButton("Effacer");
			jbdelete.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					getJtanswer().setText("");
					
				}
			});
		}
		return jbdelete;
	}

	public JButton getJbok() {
		if(jbok==null)
			jbok=new JButton("OK");
		return jbok;
	}
	
	//Label
	public JLabel getJltheme() {
		if(jltheme==null){
			jltheme=new JLabel("Thème:");
			jltheme.setFont(new Font(FONT_NAME, Font.BOLD, 15));
		}
		return jltheme;
	}

	public JLabel getJlnametheme() {
		if(jlnametheme==null) {
			jlnametheme=new JLabel("Femmes célèbres");
			jlnametheme.setFont(new Font(FONT_NAME, Font.BOLD, 25));

		}
		return jlnametheme;
	}

	public JLabel getJlauthor() {
		if(jlauthor==null)
			jlauthor=new JLabel("Auteur:");
			jlauthor.setFont(new Font(FONT_NAME, Font.BOLD, 15));

		return jlauthor;
	}

	public JLabel getJlanswer() {
		if(jlanswer==null)
			jlanswer=new JLabel(" Réponse ");
			jlanswer.setFont(new Font(FONT_NAME, Font.BOLD, 15));

		return jlanswer;
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