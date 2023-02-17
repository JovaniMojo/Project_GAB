package com.Gestion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;

public class ActionFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
//	private String nom;
//	private String montant;
//	private String blaze;
	//private MainFrame main;
	
	
//	public ActionFrame(MainFrame main) {
//        this.main = main;
//    }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActionFrame frame = new ActionFrame();
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
	public ActionFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenu : )\r\n\r\n");
		lblNewLabel_1.setBounds(238, 62, 182, 30);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Consulter votre solde");
		btnNewButton.setBounds(234, 158, 214, 48);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				MainFrame main = new MainFrame();
//			    String montant = main.getMontant();
//			    System.out.println(montant);
				
				
//             try {
//            	 Connection connexion = BDconnect.obtenirConnexion();
//            	MainFrame main = new MainFrame();
//            	//ActionFrame state = new ActionFrame(main);
//            	 
//            	   
//            	     
//            	      nom = main.getName();
//            	      System.out.println(nom);
//            	 
//					PreparedStatement prepare = connexion.prepareStatement("SELECT * FROM client INNER JOIN compte  ON dto = num_cl  WHERE nom_cl = ?");
//					prepare.setString(1,nom);
//					ResultSet reslt = prepare.executeQuery();
//					while(reslt.next()) {
//					montant = reslt.getString("montant");
//					blaze = reslt.getString("nom_cl");
//					
//					
//					
//					}
//				
					
					Consulter_RetraitFrame a= new Consulter_RetraitFrame();
					a.setVisible(true);
					
				
					
//					connexion.close();
//					
// 			}catch (Exception t) {
// 				t.printStackTrace();
// 				}
				};
			});
			
		
		
		JButton btnNewButton_1 = new JButton("Proceder a un virement ");
		btnNewButton_1.setBounds(234, 278, 214, 48);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Faites votre choix :");
		lblNewLabel.setBounds(234, 102, 214, 30);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, -27, 707, 454);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\recovery_data\\WALLPAPERS\\NatureWallpapers\\pic.jpg"));
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("New label");
		label.setBounds(383, 113, 45, 13);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(65, 10, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Faire_virement c= new Faire_virement();
				c.setVisible(true);
				};
			});
	}
	
//	public String getMontant() {
//        return montant;
//    }
//	public String getBlaze() {
//        return blaze;
//    }
}
