package com.vaccination;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setUndecorated(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.BOLD, 28));
		panel.setBackground(Color.ORANGE);
		panel.setDoubleBuffered(false);
		panel.setBounds(0, 0, 800, 115);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcom To Vaccination ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		ImageIcon img = new ImageIcon (this.getClass().getResource("/login1.jpg"));
		btnNewButton.setIcon(img);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lg = new LoginPage();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(49, 479, 308, 187);
		contentPane.add(btnNewButton);
		
		JButton signUp = new JButton("SignUp");
		signUp.setForeground(new Color(240, 255, 255));
		ImageIcon img1 = new ImageIcon (this.getClass().getResource("/signup.jpg"));
		signUp.setIcon(img1);
		signUp.setSize(10,10);
		signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationPage rg = new RegistrationPage();
				rg.setVisible(true);
			    setVisible(false);
			}
		});
		signUp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		signUp.setBorderPainted(false);
		signUp.setBackground(new Color(0, 0, 255));
		signUp.setBounds(402, 354, 398, 310);
		contentPane.add(signUp);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(134, 125, 482, 173);
		contentPane.add(lblNewLabel_2);
		ImageIcon img11 = new ImageIcon (this.getClass().getResource("/slogun.jpg"));
		lblNewLabel_2.setIcon(img11);
		
	}
}
