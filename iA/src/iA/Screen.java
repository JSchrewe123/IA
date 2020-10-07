package iA;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Screen extends JPanel{
	
	
	Screen(){
		setLayout(null);
		JLabel textfield_1 = new JLabel("Screen");
		textfield_1.setLocation(10,10);
		textfield_1.setSize(100,20);
		add(textfield_1);
		
		
	}

}
