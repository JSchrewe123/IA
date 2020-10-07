package iA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.google.gson.Gson;

public class Tasks extends JPanel{
	
	private String[] headers = new String[] {"Id","Task", "Points"};

	
	Tasks(){
		
		setLayout(null);
		
		Object[][] data = new Object[][] {
			{1, "John", 40},
			{2, "Rambo", 70}
		};
		
		JTable table = new JTable();
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(20, 20, 400, 300);
		add(scrollPane);
		
		DefaultTableModel model = new DefaultTableModel(headers,0);
		table.setModel(model);
		
		JTextField newId = new JTextField();
		JTextField newTask = new JTextField();
		JTextField newPoints = new JTextField();
		
		newId.setBounds(430,20,100,20);
		newTask.setBounds(430,50,100,20);
		newPoints.setBounds(430,80,100,20);
		
		add(newId);
		add(newTask);
		add(newPoints);
		
		
		JButton addBtn = new JButton("Add");
		addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				model.addRow(new Object[] {
						newId, newTask, newPoints
				});	
			}
		});
		addBtn.setBounds(430,110,100,20);
		add(addBtn);
		
		JButton deleteBtn = new JButton("Delete");
		addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				model.addRow(new Object[] {
						newId, newTask, newPoints
				});	
			}
		});
		deleteBtn.setBounds(430,140,100,20);
		add(deleteBtn);
		
		JButton saveBtn = new JButton("Update");
		addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saveData("\"C:\\Users\\jansc\\Desktop\\CS\\text.json\"",model);	
			}
		});
		saveBtn.setBounds(430,170,100,20);
		add(saveBtn);
		
		loadData("C:\\Users\\jansc\\Desktop\\CS\\text.json", model);

	}
	
	void saveData(String filename, DefaultTableModel model) {
		Gson gson = new Gson();
		Vector dataVector = model.getDataVector();
		String textData = gson.toJson(dataVector);
		System.out.println(textData);
		
		Path path = Paths.get(filename);
		try {
			Files.writeString(path, textData);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	void loadData(String filename, DefaultTableModel model) {
		Path path = Paths.get(filename);
		try {
			String textData = Files.readString(path);				
			Gson gson = new Gson();
			Object[][] tableData = gson.fromJson(textData,Object[][].class); 
			model.setDataVector(tableData, headers);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
