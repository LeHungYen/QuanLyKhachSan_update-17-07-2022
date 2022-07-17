package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

public class Kho_view extends JFrame {

	private JPanel contentPane;
	private JTextField txtNhpTn;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kho_view frame = new Kho_view();
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
	public Kho_view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1264, 681);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 1244, 659);
		panel_1.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Danh Sách", null, panel_3, null);
		panel_3.setLayout(null);
		
		SwitchButton switchButton = new SwitchButton();
		switchButton.setBounds(20, 37, 55, 25);
		panel_3.add(switchButton);
		switchButton.setBackground(new Color(0, 153, 204));
		
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(81, 19, 326, 51);
		panel_3.add(panel_2_1);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "T\u00EAn kho", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		txtNhpTn = new JTextField();
		txtNhpTn.setBackground(Color.WHITE);
		txtNhpTn.setBounds(10, 18, 306, 29);
		panel_2_1.add(txtNhpTn);
		((JComponent) txtNhpTn).setBorder(null);
		txtNhpTn.setColumns(10);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Danh s\u00E1ch kho", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_1.setBackground(new Color(204, 204, 204));
		panel_2_1_1_1.setBounds(10, 81, 1219, 539);
		panel_3.add(panel_2_1_1_1);
		
		SwitchButton switchButton_2 = new SwitchButton();
		switchButton_2.setBackground(new Color(0, 153, 204));
		switchButton_2.setBounds(10, 39, 55, 25);
		panel_2_1_1_1.add(switchButton_2);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "T\u00ECm ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_2.setBackground(Color.WHITE);
		panel_2_1_2.setBounds(133, 21, 1076, 51);
		panel_2_1_1_1.add(panel_2_1_2);
		
		textField = new JTextField();
		textField.setText("Nhập tên để tìm kiếm");
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(Color.WHITE);
		textField.setBounds(10, 18, 1128, 29);
		panel_2_1_2.add(textField);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 97, 1199, 431);
		panel_2_1_1_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_2_1_3 = new JPanel();
		panel_2_1_3.setLayout(null);
		panel_2_1_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "\u0110\u1ECBa ch\u1EC9 kho", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_3.setBackground(Color.WHITE);
		panel_2_1_3.setBounds(417, 19, 326, 51);
		panel_3.add(panel_2_1_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(10, 18, 306, 29);
		panel_2_1_3.add(textField_1);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(797, 15, 140, 51);
		panel_3.add(btnNewButton);
		
		JButton btnSa = new JButton("Sửa");
		btnSa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSa.setBackground(new Color(255, 204, 0));
		btnSa.setBounds(951, 15, 140, 51);
		panel_3.add(btnSa);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Cập Nhật Kho", null, panel_4, null);
		panel_4.setLayout(null);
		
	}
}