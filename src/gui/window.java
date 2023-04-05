//i am branch 1 

package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class window implements ActionListener  {
	
	private JFrame frame;
	private JLabel label1;
	private JLabel label2;
	private JTextField textf1;
	private JTextField textf2;
	private JButton btn ;
	


	public void make_window () {
		
		
		
		frame = new JFrame();
		frame.setTitle("Square ");
		frame.setSize(500, 500);
		frame.setLayout(null);
		
		
		label1 = new JLabel() ;
		label1.setText("enter a number : ");
		label1.setBounds(20,20, 200, 20);
		
		
		textf1 = new JTextField();
		textf1.setBounds(200, 20, 50, 20);
		
		
		label2 = new JLabel() ;
		label2.setText("the square is : ");
		label2.setBounds(20,40, 200, 20);
		
		textf2 = new JTextField();
		textf2.setBounds(200, 40, 50, 20);
		textf2.setEditable(false);
		
		btn = new JButton();
		btn.setText("Square !");
		btn.setBounds(20, 80, 200, 50);
		
	
		
		frame.add(textf2);
		frame.add(textf1);
		frame.add(label1);
		frame.add(label2);
		frame.add(btn);
		
		frame.setVisible(true);
		
		btn.addActionListener(this);
		
		
	}



	public void actionPerformed(ActionEvent e) {
		
		int num = Integer.parseInt( textf1.getText() );
		
		num=num*num;
		System.out.print(num);
		textf2.setText(Integer.toString(num));
		
	}
	
	public static void main (String[] args ) {
		
		
		window mywindow = new window ();
		mywindow.make_window();
		
	}
	
	
}