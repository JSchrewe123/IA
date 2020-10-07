package iA;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home extends JPanel{
		
	Home(){
		setLayout(null);
		JLabel textfield_1 = new JLabel("Welcome to the App!!!");
		textfield_1.setLocation(10,10);
		textfield_1.setSize(200,20);
		add(textfield_1);
	}
}
