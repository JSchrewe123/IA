package iA;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calendar extends JPanel{

	
	Calendar(){
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel selectMonths = new JLabel("Select a month -->");
		//selectMonths.setSize(200,20);
		//selectMonths.setLocation(0,0);
		add(selectMonths);
		
		JTextField enterMonth = new JTextField();
		
		Months months = new Months();
		//months.setSize(500,50);
		//months.setLocation(0,30);
		add(months);

	}
}
