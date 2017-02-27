package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class LogInGUI {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInGUI window = new LogInGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogInGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(157, 119, 198, 22);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.setBounds(167, 168, 97, 25);
		frame.getContentPane().add(btnLogIn);
		
		JLabel lblUser = new JLabel("User:");
		lblUser.setBounds(52, 72, 56, 16);
		frame.getContentPane().add(lblUser);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(52, 122, 71, 16);
		frame.getContentPane().add(lblPassword);
		
		JButton btnEnterAsGuest = new JButton("Enter as guest");
		btnEnterAsGuest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEnterAsGuest.setBounds(12, 215, 158, 25);
		frame.getContentPane().add(btnEnterAsGuest);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(323, 215, 97, 25);
		frame.getContentPane().add(btnRegister);
		
		textField = new JTextField();
		textField.setBounds(157, 69, 198, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
