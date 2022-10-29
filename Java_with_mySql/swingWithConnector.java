
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProductApp {

	private JFrame frame;
	private JTextField id;
	private JTextField name;
	private JTextField contact;
	private JLabel lblNewLabel_3;
	private JTextField course;
	private JTable table;
	private JScrollPane scrollPane;

	DefaultTableModel model;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductApp window = new ProductApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ProductApp() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setSize(800, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 241, 122);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel(" ID : ");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 36, 65, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Contact : ");
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 61, 78, 14);
		panel.add(lblNewLabel_2);

		id = new JTextField();
		id.setBounds(82, 10, 129, 20);
		panel.add(id);
		id.setColumns(10);

		name = new JTextField();
		name.setColumns(10);
		name.setBounds(82, 35, 129, 20);
		panel.add(name);

		contact = new JTextField();
		contact.setColumns(10);
		contact.setBounds(82, 60, 129, 20);
		panel.add(contact);

		lblNewLabel_3 = new JLabel("Course :");
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 86, 78, 14);
		panel.add(lblNewLabel_3);

		course = new JTextField();
		course.setColumns(10);
		course.setBounds(82, 85, 129, 20);
		panel.add(course);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(296, 22, 465, 214);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int i = table.getSelectedRow();
				id.setText(model.getValueAt(i, 0).toString());
				name.setText(model.getValueAt(i, 1).toString());
				contact.setText(model.getValueAt(i, 2).toString());
				course.setText(model.getValueAt(i, 3).toString());
			}
		});
		model = new DefaultTableModel();
		Object[] column = { "ID", "Name", "Contact", "Course" };
		final Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);

		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (id.getText().equals("") || name.getText().equals("") || course.getText().equals("")
						|| contact.getText().equals(""))

				{
					JOptionPane.showMessageDialog(null, "Please Fill Complete Information!");
				} else {
					row[0] = id.getText();
					row[1] = name.getText();
					row[2] = contact.getText();
					row[3] = course.getText();

					model.addRow(row);

					id.setText("");
					name.setText("");
					contact.setText("");
					course.setText("");
					JOptionPane.showMessageDialog(null, "File Saved!");
				}

			}
		});
		add.setBounds(10, 179, 89, 23);
		frame.getContentPane().add(add);

		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = table.getSelectedRow();
				
				if(i>=0)
				{
					model.removeRow(i);
					JOptionPane.showMessageDialog(null, "File Deleted!");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Select a row First!");
				}
				
			}
		});
		delete.setBounds(10, 213, 89, 23);
		frame.getContentPane().add(delete);

		JButton update = new JButton("Update");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int i = table.getSelectedRow();
				model.setValueAt(id.getText(),i , 0);
				model.setValueAt(name.getText(),i , 1);
				model.setValueAt(contact.getText(),i , 2);
				model.setValueAt(course.getText(),i , 3);
			}
		});
		update.setBounds(145, 179, 89, 23);
		frame.getContentPane().add(update);

		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				id.setText("");
				name.setText("");
				contact.setText("");
				course.setText("");
			}
		});
		clear.setBounds(145, 213, 89, 23);
		frame.getContentPane().add(clear);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
}


