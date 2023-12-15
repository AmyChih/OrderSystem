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

public class ForgetPassword extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgetPassword frame = new ForgetPassword();
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
	public ForgetPassword() {
		setTitle("忘記密碼");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(255, 205, 168));
		panel.setBounds(48, 21, 395, 66);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("澳洲花精訂購系統");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(125, 49, 70));
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 10, 395, 46);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(252, 194, 194));
		panel_1.setBounds(48, 97, 395, 244);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 219, 225));
		panel_2.setBounds(116, 21, 164, 37);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("會員登入");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(125, 49, 70));
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("帳號：");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(125, 49, 70));
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_2.setBounds(68, 88, 74, 25);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("密碼：");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(125, 49, 70));
		lblNewLabel_2_1.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(68, 123, 74, 25);
		panel_1.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setColumns(10);
		textField.setBounds(138, 88, 155, 25);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(138, 123, 155, 25);
		panel_1.add(textField_1);
		
		JButton summit = new JButton("送出");
		summit.setForeground(new Color(125, 49, 70));
		summit.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		summit.setBounds(150, 177, 107, 37);
		panel_1.add(summit);
	}

}
