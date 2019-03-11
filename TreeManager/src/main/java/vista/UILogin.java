package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class UILogin {

	private JFrame frmRootmanager;
	private JPasswordField passwordField;
	private JTextField textField;
	private JButton btnLogin;

	/**
	 * Create the application.
	 */
	public UILogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRootmanager = new JFrame();
		frmRootmanager.setTitle("RootManager");
		frmRootmanager.getContentPane().setBackground(Color.ORANGE);
		frmRootmanager.setBounds(100, 100, 336, 190);
		frmRootmanager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRootmanager.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(10, 26, 46, 14);
		frmRootmanager.getContentPane().add(lblUsuario);
		
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(10, 79, 72, 14);
		frmRootmanager.getContentPane().add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(71, 77, 160, 17);
		frmRootmanager.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(71, 23, 160, 20);
		frmRootmanager.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(203, 110, 89, 23);
		frmRootmanager.getContentPane().add(btnLogin);
		
		frmRootmanager.setVisible(true);
 
	}

	public JFrame getFrmRootmanager() {
		return frmRootmanager;
	}

	public void setFrmRootmanager(JFrame frmRootmanager) {
		this.frmRootmanager = frmRootmanager;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}
	
	
}
