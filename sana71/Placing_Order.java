package sana71;
import java.awt.EventQueue;
import java.sql.*;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Placing_Order extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Placing_Order frame = new Placing_Order();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Placing_Order() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Address");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 94, 61, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(129, 79, 229, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Mobile No.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 151, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 149, 120, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		//ButtonGroup bg = new ButtonGroup();
		
		
		JButton btnNewButton = new JButton("Place Order");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 Connection con = DriverManager.getConnection(
					        "jdbc:mysql://localhost:3306/ecommerce",
					        "root",
					        "Ruksana@0610"
					    );
				PreparedStatement ps = con.prepareStatement("insert into placeorder values( ?,?,?,?)");
				ps.setString(1,textField.getText());
				ps.setString(2,textField_1.getText());
				ps.setString(3, textField_2.getText());
				ps.setString(4, textField_3.getText());
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null,"Order placed Successfully");
				System.exit(0);
				}
				catch(Exception ev) {
					ev.printStackTrace();	
				}
			}
		});


		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(282, 208, 127, 27);
		contentPane.add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("payment mode");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 176, 114, 20);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(134, 177, 153, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("NAME");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 32, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(129, 31, 125, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
