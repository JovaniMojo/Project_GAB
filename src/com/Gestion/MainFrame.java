package com.Gestion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private String name;
	private  String montant = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setFont(null);
		setTitle("MainFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom d'utilisateur:");
		lblNewLabel.setBounds(140, 79, 152, 31);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mot de passe:");
		lblNewLabel_1.setBounds(155, 154, 99, 31);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		JTextField textField = new JTextField();
		textField.setBounds(311, 79, 214, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(311, 154, 214, 30);
		contentPane.add(passwordField);
		
		
		
		JButton btnNewButton = new JButton("Se connecter");
		btnNewButton.setBounds(530, 369, 144, 37);
		btnNewButton.setBackground(new Color(0, 128, 64));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnNewButton);
		
		
	
		
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Connection connexion = BDconnect.obtenirConnexion();
				String password = new String (passwordField.getPassword());
				 name = textField.getText();
				 
				
				try {
					
					PreparedStatement prepare = connexion.prepareStatement("SELECT nom_cl, password_cl FROM client WHERE nom_cl = ?");
					prepare.setString(1, name);
					ResultSet result = prepare.executeQuery();
					//ResultSetMetaData resultMeta = result.getMetaData();
					
					System.out.println(textField.getText()); 
				
				if (result.next() && password.equals(result.getString("password_cl"))) {
					
					passwordField.setText(null);
				
					
					ActionFrame a= new ActionFrame();
					a.setVisible(true);
					
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Impossible de se connecter...mot de passe incorect",
							" erreur de connexion ", JOptionPane.ERROR_MESSAGE);
					passwordField.setText(null);
					
						
				}
				
				
				
				
			}catch (Exception t) {
				t.printStackTrace();
				}
	
				
				};
			});
		
		
			
			JLabel lblNewLabel_2 = new JLabel("CONNEXION");
			lblNewLabel_2.setBounds(261, 10, 152, 37);
			lblNewLabel_2.setForeground(new Color(255, 255, 255));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setBounds(-11, 0, 718, 423);
			lblNewLabel_3.setIcon(new ImageIcon("D:\\recovery_data\\WALLPAPERS\\NatureWallpapers\\pic.jpg"));
			contentPane.add(lblNewLabel_3);
		}
	
	
	public String getMontant() {
	    
	    try {
	        Connection connexion = BDconnect.obtenirConnexion();
	        PreparedStatement prepare = connexion.prepareStatement("SELECT montant FROM client INNER JOIN compte  ON dto = num_cl  WHERE nom_cl = ?");
	        prepare.setString(1, name);
	        ResultSet reslt = prepare.executeQuery();
	        while (reslt.next()) {
	            montant = reslt.getString("montant");
	            System.out.println(name);
	            System.out.println(montant); 
	            
	        }
	        connexion.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return montant;
	}
	
	  public String getName() {
		
    	return name;
	} 
	
	 

	


	}


