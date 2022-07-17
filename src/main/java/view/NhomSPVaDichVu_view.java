package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class NhomSPVaDichVu_view extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NhomSPVaDichVu_view frame = new NhomSPVaDichVu_view();
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
	public NhomSPVaDichVu_view() {
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
		
		JLabel lblNewLabel = new JLabel("Trạng thái");
		lblNewLabel.setBounds(20, 11, 63, 31);
		panel_3.add(lblNewLabel);
		
		SwitchButton switchButton = new SwitchButton();
		switchButton.setBounds(20, 37, 55, 25);
		panel_3.add(switchButton);
		switchButton.setBackground(new Color(0, 153, 204));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(224, 19, 385, 51);
		panel_3.add(panel_2);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Nh\u00F3m h\u00E0ng h\u00F3a", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tất cả", "Sản phẩm", "Dịch vụ"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(3, 18, 376, 28);
		comboBox.setBorder(new EmptyBorder(-11, -4, -11, -1));
		panel_2.add(comboBox);
		
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(619, 19, 610, 51);
		panel_3.add(panel_2_1);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "T\u00ECm ki\u1EBFm Theo t\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(10, 18, 543, 29);
		panel_2_1.add(textField);
		textField.setBorder(null);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 113, 1219, 507);
		panel_3.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Cập Nhật Nhóm Sản Phẩm", null, panel_4, null);
		panel_4.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(22, 54, 819, 46);
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Sản phẩm", "Dịch vụ"}));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(22, 181, 1207, 46);
		panel_4.add(comboBox_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 295, 1207, 190);
		panel_4.add(textArea);
		
		JButton btnThm = new JButton("Làm mới");
		btnThm.setBackground(new Color(255, 204, 102));
		btnThm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThm.setBounds(1077, 578, 152, 42);
		panel_4.add(btnThm);
		
		JLabel lblNewLabel_1 = new JLabel("Tên nhóm");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(22, 22, 185, 32);
		panel_4.add(lblNewLabel_1);
		
		SwitchButton switchButton_1 = new SwitchButton();
		switchButton_1.setBackground(new Color(0, 153, 204));
		switchButton_1.setBounds(905, 54, 55, 25);
		panel_4.add(switchButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Trạng thái");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(842, 22, 185, 32);
		panel_4.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Loại");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(22, 148, 185, 32);
		panel_4.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Ghi chú:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2_1.setBounds(22, 262, 185, 32);
		panel_4.add(lblNewLabel_1_2_1);
		
		JButton btnSa = new JButton("Sửa");
		btnSa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSa.setBackground(new Color(255, 204, 102));
		btnSa.setBounds(915, 578, 152, 42);
		panel_4.add(btnSa);
		
		JButton btnThm_2 = new JButton("Thêm");
		btnThm_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThm_2.setBackground(new Color(255, 204, 102));
		btnThm_2.setBounds(753, 578, 152, 42);
		panel_4.add(btnThm_2);
		
	}
}
