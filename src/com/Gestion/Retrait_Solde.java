package com.Gestion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Retrait_Solde extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Retrait_Solde frame = new Retrait_Solde();
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
	public Retrait_Solde() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Veuillez saisir le montant a retirer :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(82, 66, 267, 26);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(211, 131, 309, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBackground(new Color(0, 128, 64));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfirmationRetrait c= new ConfirmationRetrait();
				c.setVisible(true);
			}
		});
		btnNewButton.setBounds(183, 244, 101, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.setBackground(new Color(128, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(468, 244, 96, 31);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 703, 402);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\recovery_data\\WALLPAPERS\\NatureWallpapers\\pic.jpg"));
		contentPane.add(lblNewLabel_1);
	}
}
