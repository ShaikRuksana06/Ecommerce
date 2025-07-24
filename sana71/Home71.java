package sana71;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
public class Home71 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home71 frame = new Home71();
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
	public Home71() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		setSize(960,960);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search");
		lblNewLabel.setBounds(10, 28, 60, 19);
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(94, 28, 418, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setBounds(541, 27, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("categories");
		lblNewLabel_1.setBounds(69, 73, 104, 36);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("MEN");
		btnNewButton_1.setBounds(40, 146, 314, 43);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				men71 m1=new men71();
				m1.setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("FEMALE");
		btnNewButton_2.setBounds(40, 262, 326, 43);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				women71 w1= new women71();
				w1.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(407, 113, 213, 177);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Administrator\\Pictures\\Saved Pictures\\image.png"));
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_3 = new JButton("CANCEL");
		btnNewButton_3.setBounds(449, 366, 112, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(btnNewButton_3);
	
		/*JLabel lblNewLabel_2 = new JLabel("home");
		ImageIcon i= new ImageIcon(this.getClass().getResource("/image.png"));
	     lblNewLabel_2.setIcon(i);
		lblNewLabel_2.setBounds(166, 77, 238, 173);
		contentPane.add(lblNewLabel_2);*/
	}
}
