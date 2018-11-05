package Game;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {
	
	JFrame frame;
	private JLabel Player4;
	private JLabel Player2;
	private JLabel Player3;
	private JLabel Player1;
	private JLabel lblDice;
	int loc = 0;
	int futloc = 0;
	int loc2 = 0;
	int futloc2 = 0;
	int loc3 = 0;
	int futloc3 = 0;
	int futloc4 = 0;
	int loc4 = 0;
	private JButton btnNewButton;
	private JLabel Player2Dice;
	private JLabel Player3Dice;
	private JLabel Player4Dice;
	
	
	public GUI(){
		
		frame = new JFrame("Roll the Die!");
		
		
		frame.setBounds(200,675, 299, 728);
		
		frame.setAlwaysOnTop(false);
		
		JLabel contentPane_1 = new JLabel();
		contentPane_1.setBounds(0, 0, 158, 689);
		
		contentPane_1.setIcon(new ImageIcon(GUI.class.getResource("/Game/Board.png")));
    	frame.getContentPane().setLayout(null);
    	
    	Player1 = new JLabel("");
    	Player1.setIcon(new ImageIcon(GUI.class.getResource("/Game/Player1.png")));
    	Player1.setBounds(10, 664, 17, 14);
    	frame.getContentPane().add(Player1);
    	
    	Player2 = new JLabel("");
    	Player2.setIcon(new ImageIcon(GUI.class.getResource("/Game/Player2.png")));
    	Player2.setBounds(37, 664, 17, 14);
    	frame.getContentPane().add(Player2);
    	
    	Player3 = new JLabel("");
    	Player3.setIcon(new ImageIcon(GUI.class.getResource("/Game/Player3.png")));
    	Player3.setBounds(63, 664, 17, 14);
    	frame.getContentPane().add(Player3);
    	
    	Player4 = new JLabel("");
    	Player4.setIcon(new ImageIcon(GUI.class.getResource("/Game/Player4.png")));
    	Player4.setBounds(90, 664, 46, 14);
    	frame.getContentPane().add(Player4);
    	
    	Player2Dice = new JLabel("Player 2 Dice:");
    	Player2Dice.setBounds(125, 143, 148, 14);
    	frame.getContentPane().add(Player2Dice);
    	
    	Player3Dice = new JLabel("Player 3 Dice:");
    	Player3Dice.setBounds(125, 168, 148, 14);
    	frame.getContentPane().add(Player3Dice);
    	
    	Player4Dice = new JLabel("Player 4 Dice:");
    	Player4Dice.setBounds(125, 205, 148, 14);
    	frame.getContentPane().add(Player4Dice);
    	lblDice = new JLabel("Dice:");
    	lblDice.setBounds(125, 106, 148, 14);
    	frame.getContentPane().add(lblDice);
    	
    	
    	btnNewButton = new JButton("Next ");
    	btnNewButton.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			
    			int m = (int) (6*Math.random()+1);
    			
    			futloc += m;
    			
    			
    			lblDice.setText("Dice: " + m);
    			
    			
    			while(loc < futloc){
    				Player1.setLocation(Player1.getLocation().x, Player1.getLocation().y-10);
    				loc++;
    			}
    			if(loc == 23){
    				Player1.setLocation(Player1.getLocation().x, Player1.getLocation().y-100);
    				loc+=10;
    				futloc+=10;
    			}
    			if(loc ==56){
    				Player1.setLocation(Player1.getLocation().x, Player1.getLocation().y+100);
    				loc-=10;
    				futloc-=10;
    			}
    			if(loc >63)
    			{
    				JOptionPane.showMessageDialog(null, "WINNER!!!!!!!! IS YOU!!!");
    				frame.dispose();
    			}
    			
    			
    			btnNewButton.setEnabled(false);
    			
    			int q = (int) (6*Math.random()+1);
    			
    			futloc2 += q;
    			
    			
    			Player2Dice.setText("Player 2 Dice: " + q);
    			
    			
    			while(loc2 < futloc2){
    				Player2.setLocation(Player2.getLocation().x, Player2.getLocation().y-10);
    				loc2++;
    			}
    			if(loc2 == 23){
    				Player2.setLocation(Player2.getLocation().x, Player2.getLocation().y-100);
    				loc2+=10;
    				futloc2+=10;
    			}
    			if(loc2 ==56){
    				Player2.setLocation(Player2.getLocation().x, Player2.getLocation().y+100);
    				loc2-=10;
    				futloc2-=10;
    			}
    			if(loc2 >63)
    			{
    				JOptionPane.showMessageDialog(null, "WINNER!!!!!!!! IS PLAYER 2!!!");
    				frame.dispose();
    			}
    			

    			int e = (int) (6*Math.random()+1);
    			
    			futloc3 += e;
    			
    			
    			Player3Dice.setText("Player 3 Dice: " + e);
    			
    			
    			while(loc3 < futloc3){
    				Player3.setLocation(Player3.getLocation().x, Player3.getLocation().y-10);
    				loc3++;
    			}
    			if(loc3 == 23){
    				Player2.setLocation(Player3.getLocation().x, Player3.getLocation().y-100);
    				loc3+=10;
    				futloc3+=10;
    			}
    			if(loc3 ==56){
    				Player2.setLocation(Player3.getLocation().x, Player3.getLocation().y+100);
    				loc3-=10;
    				futloc3-=10;
    			}
    			if(loc3 >63)
    			{
    				JOptionPane.showMessageDialog(null, "WINNER!!!!!!!! IS PLAYER 3!!!");
    				frame.dispose();
    			}
    			
    			

    			int t = (int) (6*Math.random()+1);
    			
    			futloc4 += t;
    			
    			
    			Player4Dice.setText("Player 4 Dice: " + t);
    			
    			
    			while(loc4 < futloc4){
    				Player4.setLocation(Player4.getLocation().x, Player4.getLocation().y-10);
    				loc4++;
    			}
    			if(loc4 == 23){
    				Player4.setLocation(Player4.getLocation().x, Player4.getLocation().y-100);
    				loc4+=10;
    				futloc4+=10;
    			}
    			if(loc4 ==56){
    				Player4.setLocation(Player4.getLocation().x, Player4.getLocation().y+100);
    				loc4-=10;
    				futloc4-=10;
    			}
    			if(loc4 >63)
    			{
    				JOptionPane.showMessageDialog(null, "WINNER!!!!!!!! IS PLAYER 4!!!");
    				frame.dispose();
    			}
    			
    			
    			btnNewButton.setEnabled(true);
    			
    			
    			
    		}
    	});
    	btnNewButton.setBounds(127, 305, 70, 54);
    	frame.getContentPane().add(btnNewButton);
    	
    	
    	
		
    	frame.getContentPane().add(contentPane_1);
		
		
		
		
		
		frame.setVisible(true);
	}
}
