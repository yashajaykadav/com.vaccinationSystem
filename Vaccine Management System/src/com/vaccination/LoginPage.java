package com.vaccination;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setUndecorated(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 600, 85);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User ID :-");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(140, 171, 87, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PassWord:-");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(125, 242, 102, 32);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(234, 171, 220, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(237, 242, 220, 32);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(76, 394, 117, 33);
		contentPane.add(btnNewButton);
		
		JButton btnCancle = new JButton("CANCLE");
		btnCancle.setForeground(Color.WHITE);
		btnCancle.setBorderPainted(false);
		btnCancle.setBackground(Color.RED);
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage hg = new HomePage();
				hg.setVisible(true);
				setVisible(false);
				
			}
		});
		btnCancle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCancle.setBounds(417, 394, 117, 33);
		contentPane.add(btnCancle);
	}
}
