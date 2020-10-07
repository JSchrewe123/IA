package iA;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Main {

	public static void main(String[] args) {
		new Main();
	}
	Main(){
		JFrame jFrame = new JFrame("Household Organizer");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//LogInScreen logInScreen =  new LogInScreen();
		//logInScreen.setPreferredSize(new Dimension(220,120));
		//jFrame.getContentPane().add(logInScreen);
		
		JTabbedPane tp = new JTabbedPane();
		
		Home home = new Home();
		Screen screen = new Screen();
		Tasks tasks = new Tasks();
		Calendar calendar = new Calendar();
		
		//tp.addTab("Home", home);
		tp.addTab("Tasks", tasks);
		//tp.addTab("hello" , screen);
		//tp.addTab("calendar", calendar);
		
		
		jFrame.add(tp);
		jFrame.setSize(640, 480);
		jFrame.setVisible(true);
		
		Database db = new Database();
		db.displayAll();
		}

}
