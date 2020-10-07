package iA;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Months extends JPanel{
	
	int num;
	
	Months(){
		JButton[] months = new JButton[12];
		int[] help = new int[]{1,3,1,2,1,2,1,1,2,1,2,1};
		
		setLayout(new GridLayout(1,12));
		
		for(int i = 0; i <12; i++) {
			
			months[i] = new JButton("" + (i+1));
			/*months[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
				}
				
			});*/
			
			add(months[i]);
		}
		
		months[0].addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {num = 0;}});
		months[1].addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {num = 1;}});
		months[2].addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {num = 2;}});
		months[3].addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {num = 3;}});
		months[4].addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {num = 4;}});
		months[5].addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {num = 5;}});
		months[6].addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {num = 6;}});
		months[7].addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {num = 7;}});
		months[8].addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {num = 8;}});
		months[9].addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {num = 9;}});
		months[10].addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {num = 10;}});
		months[11].addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {num = 11;}});

	}

}
