package sana71;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class login71 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login71 frame = new login71();
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
	public login71() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		setSize(820,540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblNewLabel.setBounds(213, 150, 79, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblNewLabel_1.setBounds(213, 224, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Login Form");
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
		lblNewLabel_2.setBounds(297, 75, 104, 20);
		contentPane.add(lblNewLabel_2);
		
		TextField txtuser = new TextField();
		txtuser.setBounds(383, 142, 129, 22);
		contentPane.add(txtuser);
		
		TextField txtpwd = new TextField();
		txtpwd.setBounds(398, 224, 129, 22);
		contentPane.add(txtpwd);
	
		Button button = new Button("Login");
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setBackground(new Color(255, 182, 193));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtuser.getText().equals("Ruksana"))
					if(txtpwd.getText().equals("Sana"))
					{
						JOptionPane.showMessageDialog(null,"Welcome to ecommerce");
						Home71 h = new Home71();
						h.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"invalid Password");
					}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Username");
				}
				     
			}
		});
		button.setBounds(213, 304, 109, 38);
		contentPane.add(button);
		
		Button button_1 = new Button("Cancel");
		button_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_1.setBackground(new Color(255, 182, 193));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setBounds(398, 304, 97, 38);
		contentPane.add(button_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(272, 101, 5, 5);
		contentPane.add(tabbedPane);
	}
}
