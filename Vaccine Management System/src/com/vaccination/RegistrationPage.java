package com.vaccination;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage frame = new RegistrationPage();
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
	public RegistrationPage() {
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
		panel.setBounds(0, 0, 600, 78);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION PAGE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(98, 10, 384, 44);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(271, 137, 235, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(271, 210, 235, 38);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(271, 276, 235, 38);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(271, 340, 235, 38);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(271, 404, 235, 38);
		contentPane.add(textField_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBackground(new Color(240, 230, 140));
		rdbtnNewRadioButton.setForeground(new Color(139, 0, 0));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(271, 472, 93, 33);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(new Color(139, 0, 0));
		rdbtnFemale.setForeground(new Color(240, 230, 140));
		rdbtnFemale.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnFemale.setBounds(404, 472, 102, 33);
		contentPane.add(rdbtnFemale);
		
		JLabel lblNewLabel_1 = new JLabel("FIRST NAME:-");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(95, 137, 138, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("LAST NAME:-");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(95, 205, 138, 38);
		contentPane.add(lblNewLabel_1_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(271, 523, 235, 131);
		contentPane.add(textPane);
		
		JLabel lblNewLabel_1_2 = new JLabel("PHONE NUMBER:-");
		lblNewLabel_1_2.setToolTipText("");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(64, 271, 169, 38);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("EMAIL ID:-");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(116, 335, 117, 38);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("DOB:-");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(154, 399, 72, 38);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("GENDER :-");
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_4_1.setBounds(116, 469, 107, 38);
		contentPane.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("ADDRESS :-");
		lblNewLabel_1_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_4_2.setBounds(116, 523, 107, 38);
		contentPane.add(lblNewLabel_1_4_2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(64, 684, 117, 33);
		contentPane.add(btnNewButton);
		
		JButton btnCancle = new JButton("CANCLE");
		btnCancle.setForeground(Color.WHITE);
		btnCancle.setBackground(Color.RED);
		btnCancle.setBorderPainted(false);
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage hg = new HomePage();
				hg.setVisible(true);
				setVisible(false);
			}
		});
		btnCancle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCancle.setBounds(389, 684, 117, 33);
		contentPane.add(btnCancle);
	}
}
