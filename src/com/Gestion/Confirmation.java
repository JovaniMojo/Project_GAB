package com.Gestion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Confirmation extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Confirmation dialog = new Confirmation();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Confirmation() {
		setBounds(100, 100, 713, 438);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton okButton = new JButton("Valider");
			okButton.setBounds(185, 209, 81, 25);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
			okButton.setBackground(new Color(0, 128, 64));
			okButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
			
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Fin_confirmation c= new Fin_confirmation();
					c.setVisible(true);
					};
				});
		}
		{
			JButton cancelButton = new JButton("Annuler");
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Faire_virement c= new Faire_virement();
					c.setVisible(true);
				}
			});
			cancelButton.setBounds(416, 209, 90, 25);
			contentPanel.add(cancelButton);
			cancelButton.setActionCommand("Cancel");
			getRootPane().setDefaultButton(cancelButton);
			cancelButton.setBackground(new Color(255, 0, 0));
			cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		}
		
		JLabel lblNewLabel = new JLabel("Voulez vous confirmez le virement ?");
		lblNewLabel.setBounds(214, 57, 257, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPanel.add(lblNewLabel);
		{
			JLabel lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setBounds(0, 0, 699, 401);
			lblNewLabel_1.setIcon(new ImageIcon("D:\\recovery_data\\WALLPAPERS\\NatureWallpapers\\pic.jpg"));
			contentPanel.add(lblNewLabel_1);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				
			
				
			}
		}
	}
}
