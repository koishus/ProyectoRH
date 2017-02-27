package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterGUI window = new RegisterGUI();
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
	public RegisterGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 610, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username*:");
		lblUsername.setBounds(42, 46, 79, 16);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password*:");
		lblPassword.setBounds(42, 75, 74, 16);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblRepeatPassword = new JLabel("Repeat password*:");
		lblRepeatPassword.setBounds(42, 104, 114, 16);
		frame.getContentPane().add(lblRepeatPassword);
		
		JLabel lblName = new JLabel("Name*:");
		lblName.setBounds(42, 137, 56, 16);
		frame.getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname*:");
		lblSurname.setBounds(42, 166, 79, 16);
		frame.getContentPane().add(lblSurname);
		
		JLabel lblDni = new JLabel("DNI*:");
		lblDni.setBounds(42, 224, 56, 16);
		frame.getContentPane().add(lblDni);
		
		JLabel lblAddress = new JLabel("Address*:");
		lblAddress.setBounds(42, 253, 79, 16);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblAge = new JLabel("Age*:");
		lblAge.setBounds(42, 195, 56, 16);
		frame.getContentPane().add(lblAge);
		
		JCheckBox chckbxHeLeidoY = new JCheckBox("He le\u00EDdo y acepto las condiciones de uso y la pol\u00EDtica de privacidad de Sinking Soft*");
		chckbxHeLeidoY.setBounds(42, 330, 525, 25);
		frame.getContentPane().add(chckbxHeLeidoY);
		
		JCheckBox chckbxDeseoRecibirEl = new JCheckBox("Mant\u00E9ngase informado sobre los productos y servicios de Sinking Sotf");
		chckbxDeseoRecibirEl.setBounds(42, 360, 473, 25);
		frame.getContentPane().add(chckbxDeseoRecibirEl);
		
		JLabel lblEmail = new JLabel("Email*:");
		lblEmail.setBounds(42, 17, 56, 16);
		frame.getContentPane().add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(195, 14, 288, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(195, 43, 288, 22);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(195, 72, 288, 22);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(195, 101, 288, 22);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(195, 134, 288, 22);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(195, 163, 288, 22);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(195, 192, 288, 22);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(195, 221, 288, 22);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(195, 250, 288, 22);
		frame.getContentPane().add(textField_8);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Client");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(121, 281, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOwner = new JRadioButton("Owner");
		buttonGroup.add(rdbtnOwner);
		rdbtnOwner.setBounds(252, 281, 127, 25);
		frame.getContentPane().add(rdbtnOwner);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO WEA queonda 
				
				
			}
		});
		btnRegister.setBounds(247, 412, 97, 25);
		frame.getContentPane().add(btnRegister);
	}
}
