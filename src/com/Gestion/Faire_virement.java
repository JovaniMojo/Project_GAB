package com.Gestion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class Faire_virement extends JFrame {

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
					Faire_virement frame = new Faire_virement();
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
	public Faire_virement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Veuillez entrer le montant de votre virement :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(193, 28, 365, 38);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(268, 117, 186, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBackground(new Color(0, 255, 64));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(169, 370, 97, 28);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Confirmation c= new Confirmation();
				c.setVisible(true);
				};
			});
		
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ActionFrame a= new ActionFrame();
				a.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(444, 370, 97, 28);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Entrez le numero:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(192, 200, 306, 28);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(268, 252, 186, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\recovery_data\\WALLPAPERS\\NatureWallpapers\\pic.jpg"));
		lblNewLabel_2.setBounds(0, 0, 699, 439);
		contentPane.add(lblNewLabel_2);
		
	
	}
}
