package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

public class DangNhap extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangNhap frame = new DangNhap();
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
	public DangNhap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1108, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(Color.WHITE);
		contentPane_1.setBounds(0, 0, 1097, 576);
		contentPane.add(contentPane_1);
		
		textField = new JTextField();
		textField.setText("Tên đăng nhập");
		textField.setForeground(new Color(153, 153, 153));
		textField.setBounds(827, 231, 252, 39);
		contentPane_1.add(textField);
		
		JCheckBox checkBox_rememberPassword = new JCheckBox("Nhớ Mật Khẩu");
		checkBox_rememberPassword.setOpaque(false);
		checkBox_rememberPassword.setBorderPainted(false);
		checkBox_rememberPassword.setBackground(new Color(220, 220, 220));
		checkBox_rememberPassword.setBounds(827, 327, 112, 23);
		contentPane_1.add(checkBox_rememberPassword);
		
		JButton btn_login = new JButton("Đăng nhập");
		btn_login.setBackground(Color.LIGHT_GRAY);
		btn_login.setBounds(827, 385, 252, 47);
		contentPane_1.add(btn_login);
		
		JComboBox comboBox_selectLanguage = new JComboBox();
		comboBox_selectLanguage.setBackground(new Color(220, 220, 220));
		comboBox_selectLanguage.setBounds(988, 522, 91, 23);
		contentPane_1.add(comboBox_selectLanguage);
		
		JButton btn_forgetPassword = new JButton("Quên mật khẩu?");
		btn_forgetPassword.setOpaque(false);
		btn_forgetPassword.setHorizontalAlignment(SwingConstants.LEFT);
		btn_forgetPassword.setBorderPainted(false);
		btn_forgetPassword.setBackground(new Color(220, 220, 220));
		btn_forgetPassword.setBounds(806, 522, 136, 23);
		contentPane_1.add(btn_forgetPassword);
		
		passwordField = new JPasswordField();
		passwordField.setText("Mật khẩu");
		passwordField.setForeground(new Color(153, 153, 153));
		passwordField.setEchoChar(' ');
		passwordField.setBounds(827, 281, 252, 39);
		contentPane_1.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(602, 38, -207, 190);
		contentPane_1.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 786, 534);
		contentPane_1.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_hotelImage = new JLabel("Ảnh");
		lbl_hotelImage.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_hotelImage.setBounds(0, 0, 786, 534);
		panel.add(lbl_hotelImage);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(827, 11, 252, 197);
		contentPane_1.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl_imgLogo = new JLabel();
		lbl_imgLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_imgLogo.setText("Logo thương hiệu");
		lbl_imgLogo.setBounds(0, 0, 252, 197);
		panel_1.add(lbl_imgLogo);
	}

}
