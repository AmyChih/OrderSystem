package MemberSystem;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import OrderSystem.Order;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBx_Account;
	private JTextField txtBx_Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("會員登入");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 205, 168));
		panel.setBounds(30, 24, 395, 66);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("澳洲花精訂購系統");
		lblNewLabel_1.setForeground(new Color(125, 49, 70));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 10, 395, 46);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(252, 194, 194));
		panel_1.setBounds(30, 100, 395, 244);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 219, 225));
		panel_2.setBounds(116, 21, 164, 37);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("會員登入");
		panel_2.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(125, 49, 70));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		
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
		
		txtBx_Account = new JTextField();
		txtBx_Account.setToolTipText("");
		txtBx_Account.setBounds(138, 88, 155, 25);
		panel_1.add(txtBx_Account);
		txtBx_Account.setColumns(10);
		
		txtBx_Password = new JTextField();
		txtBx_Password.setColumns(10);
		txtBx_Password.setBounds(138, 123, 155, 25);
		panel_1.add(txtBx_Password);
		
		
		JButton summit = new JButton("送出");
		summit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String account = txtBx_Account.getText();
				String password = txtBx_Password.getText();
				member m = new member();
				String[] options = {"確定"};
				JOptionPane.showOptionDialog(contentPane,m.message(account, password),"會員登入",JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, "確定");				
				Boolean b = m.checkMember(account, password);
				if(b==true)
				{
					dispose();
					Order o = new Order ();
					o.setVisible(true);
				}				
			}
		});
		summit.setForeground(new Color(125, 49, 70));
		summit.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		summit.setBounds(88, 177, 107, 37);
		panel_1.add(summit);
		
		
		
		JButton close = new JButton("離開");
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		close.setForeground(new Color(125, 49, 70));
		close.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		close.setBounds(212, 177, 107, 37);
		panel_1.add(close);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
