package sana71;
import javax.swing.ImageIcon;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class men71 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					men71 frame = new men71();
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
	public men71() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		setSize(960,960);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane); 
		contentPane.setLayout(null);
		
		JLabel nl = new JLabel("Txt");
		ImageIcon img = new ImageIcon(this.getClass().getResource("s4.png"));
		nl.setIcon(img);
		nl.setBounds(239, 65, 185, 171);
		contentPane.add(nl);
		
		JLabel nl1 = new JLabel("txt2");
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("s1.png"));
		nl1.setIcon(img1);
		
		nl1.setBounds(626, 65, 212, 171);
		contentPane.add(nl1);
		
		JLabel lblNewLabel = new JLabel("Mens Formal Shirt");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblNewLabel.setBounds(437, 11, 165, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Black");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblNewLabel_1.setBounds(239, 276, 75, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("White");
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblNewLabel_2.setBounds(634, 265, 115, 40);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Buy Now");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Placing_Order p = new Placing_Order();
				p.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(235, 357, 135, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Buy Now");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Placing_Order p = new Placing_Order();
				p.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(634, 357, 131, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("Price:500 RS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(239, 316, 131, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Price:550 RS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(640, 316, 150, 30);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home71 h =new Home71();
				h.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(427, 407, 135, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("CANCEL");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(431, 469, 131, 23);
		contentPane.add(btnNewButton_3);
	}
}
