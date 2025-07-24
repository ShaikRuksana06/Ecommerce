package sana71;
import java.awt.EventQueue;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class women71 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					women71 frame = new women71();
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
	public women71() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		setSize(960,960);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img2 =new ImageIcon(this.getClass().getResource("1.png"));
		lblNewLabel.setIcon(img2);
		
		lblNewLabel.setBounds(523, 80, 232, 195);
		contentPane.add(lblNewLabel);
		
		JLabel newlb = new JLabel("");
		newlb.setBounds(207, 80, 205, 195);
		contentPane.add(newlb);
		ImageIcon img =new ImageIcon(this.getClass().getResource("saree.png"));
		newlb.setIcon(img);
		
		JLabel lblNewLabel_2 = new JLabel("Women");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(409, 31, 98, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Saree");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(207, 297, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Lehanga");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(535, 308, 88, 22);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Buy Now");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Placing_Order p = new Placing_Order();
				p.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(207, 362, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buy Now");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Placing_Order p = new Placing_Order();
				p.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(523, 390, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Price: 250 RS.");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(204, 334, 98, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Price:2500 RS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(523, 341, 126, 22);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home71 h =new Home71();
				h.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(353, 440, 99, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CANCEL");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(353, 491, 99, 23);
		contentPane.add(btnNewButton_3);
		
	}

}
