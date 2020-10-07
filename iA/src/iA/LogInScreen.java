package iA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInScreen extends JPanel{
		
	LogInScreen(){
		setLayout(null);
		
		JLabel textfield_1 = new JLabel("Username: ");
		textfield_1.setLocation(10,10);
		textfield_1.setSize(100,20);
		add(textfield_1);
		
		JLabel textfield_2 = new JLabel("Password: ");
		textfield_2.setLocation(10,50);
		textfield_2.setSize(100,20);
		add(textfield_2);
		
		JTextField username = new JTextField();
		username.setLocation(110,10);
		username.setSize(100,20);
		add(username);
		
		JPasswordField password = new JPasswordField();
		password.setLocation(110, 50);
		password.setSize(100,20);
		add(password);
		
		JButton loginButton = new JButton("Log In");
		loginButton.setLocation(60, 90);
		loginButton.setSize(100, 20);
		add(loginButton);
		
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(username.getText() == "username") {
					
				}
				
			}
			
		});
		
	}

}


