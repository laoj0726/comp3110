import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {
	
	
	JFrame menu;
	Container c;
	JPanel titleNameP, startButtonP, versionP;
	JLabel titleNameL, versionName;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);			//Font setting for title
	Font textFont = new Font("Times New Roman", Font.PLAIN, 30);			
	Font vf = new Font("Times New Roman", Font.PLAIN, 10);
	JButton startButton;
	
	
	public static void main(String[] args) {
		
		new Game();
	
	}
	
	public Game() {
		
		menu = new JFrame();
		menu.setSize(800, 600);												//size of the screen
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
		menu.getContentPane().setBackground(Color.black);					//color of the background
		menu.setLayout(null);
		menu.setVisible(true);			
		c = menu.getContentPane();											//word text setup
	
		titleNameP = new JPanel();
		titleNameP.setBounds(100, 100, 600, 150);							//text bubble set range
		titleNameP.setBackground(Color.gray);								//text bubble background color
		titleNameL = new JLabel("Gamize");
		titleNameL.setForeground(Color.black);
		titleNameL.setFont(titleFont);
		
		versionP = new JPanel();
		versionP.setBounds(50, 50, 50, 100);
		versionP.setBackground(Color.black);
		versionName = new JLabel("Alpha v1.0.0");
		versionName.setForeground(Color.white);
		versionName.setFont(vf);
		
		startButtonP = new JPanel();
		startButtonP.setBounds(300, 400, 200, 100);
		startButtonP.setBackground(Color.black);
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(textFont);
		
		titleNameP.add(titleNameL);
		versionP.add(versionName);
		startButtonP.add(startButton);
		c.add(versionP);
		c.add(titleNameP);
		c.add(startButtonP);
		
	}
	

}
