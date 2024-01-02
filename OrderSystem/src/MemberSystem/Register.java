package MemberSystem;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setTitle("會員註冊");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 600, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(255, 205, 168));
		panel.setBounds(10, 25, 566, 92);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("澳洲花精訂購系統");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(125, 49, 70));
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 10, 566, 46);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("會員註冊");
		lblNewLabel.setBounds(0, 52, 566, 25);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(125, 49, 70));
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(252, 194, 194));
		panel_1.setBounds(10, 127, 566, 476);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("帳號：");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(125, 49, 70));
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_2.setBounds(44, 75, 74, 25);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("密碼：");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(125, 49, 70));
		lblNewLabel_2_1.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(44, 122, 74, 25);
		panel_1.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setColumns(10);
		textField.setBounds(114, 75, 155, 25);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(114, 122, 155, 25);
		panel_1.add(textField_1);
		
		JButton summit = new JButton("送出");
		summit.setForeground(new Color(125, 49, 70));
		summit.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		summit.setBounds(238, 404, 107, 37);
		panel_1.add(summit);
		
		JLabel lblNewLabel_2_2 = new JLabel("姓名：");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(new Color(125, 49, 70));
		lblNewLabel_2_2.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_2_2.setBounds(44, 30, 74, 25);
		panel_1.add(lblNewLabel_2_2);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setColumns(10);
		textField_2.setBounds(114, 30, 155, 25);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("電話：");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setForeground(new Color(125, 49, 70));
		lblNewLabel_2_3.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(44, 233, 74, 25);
		panel_1.add(lblNewLabel_2_3);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("");
		textField_3.setColumns(10);
		textField_3.setBounds(114, 233, 155, 25);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Email：");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_4.setForeground(new Color(125, 49, 70));
		lblNewLabel_2_4.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_2_4.setBounds(44, 281, 74, 25);
		panel_1.add(lblNewLabel_2_4);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("");
		textField_4.setColumns(10);
		textField_4.setBounds(114, 281, 155, 25);
		panel_1.add(textField_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("地址：");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setForeground(new Color(125, 49, 70));
		lblNewLabel_2_5.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_2_5.setBounds(44, 330, 74, 25);
		panel_1.add(lblNewLabel_2_5);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("");
		textField_5.setColumns(10);
		textField_5.setBounds(114, 330, 155, 25);
		panel_1.add(textField_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 219, 225));
		panel_2.setBounds(44, 176, 225, 37);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("會員基本資料");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(125, 49, 70));
		lblNewLabel_3.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		panel_2.add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("男");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(new Color(243, 224, 230));
		rdbtnNewRadioButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		rdbtnNewRadioButton.setBounds(426, 61, 51, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("性別：");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setForeground(new Color(125, 49, 70));
		lblNewLabel_2_2_1.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_2_2_1.setBounds(355, 30, 74, 25);
		panel_1.add(lblNewLabel_2_2_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("女");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		rdbtnNewRadioButton_1.setBackground(new Color(243, 224, 230));
		rdbtnNewRadioButton_1.setBounds(426, 97, 51, 23);
		panel_1.add(rdbtnNewRadioButton_1);
	}
}
