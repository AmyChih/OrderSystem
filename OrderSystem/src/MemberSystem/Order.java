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
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;

public class Order extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField Qty_Love;
	private JTextField Qty_Sweet;
	private JTextField Qty_Divine;
	private JTextField Qty_Sum;
	private JTextField Amt_Love;
	private JTextField Amt_Sweet;
	private JTextField Amt_Divine;
	private JTextField Amt_Sum;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField Cash;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order frame = new Order();
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
	public Order() {
		setTitle("澳洲花精訂購系統");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 120, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(255, 205, 168));
		panel.setBounds(10, 10, 566, 66);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("澳洲花精訂購系統");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(125, 49, 70));
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 10, 576, 46);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(252, 194, 194));
		panel_1.setBounds(10, 86, 566, 297);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 219, 225));
		panel_2.setBounds(10, 10, 209, 37);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("商品清單");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(125, 49, 70));
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Love & Light心靈修護");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setForeground(new Color(125, 49, 70));
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 57, 209, 25);
		panel_1.add(lblNewLabel_2);		
		
		
		JLabel lblNewLabel_2_1 = new JLabel("Sweet Dreams 甜美夢境");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setForeground(new Color(125, 49, 70));
		lblNewLabel_2_1.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(10, 93, 209, 25);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Divine Light純淨極光");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setForeground(new Color(125, 49, 70));
		lblNewLabel_2_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_2_1_1.setBounds(10, 128, 209, 25);
		panel_1.add(lblNewLabel_2_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(240, 219, 225));
		panel_2_1.setBounds(232, 10, 72, 37);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("單價");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(125, 49, 70));
		lblNewLabel_3.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		panel_2_1.add(lblNewLabel_3);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(new Color(240, 219, 225));
		panel_2_1_1.setBounds(315, 10, 72, 37);
		panel_1.add(panel_2_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("數量");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(new Color(125, 49, 70));
		lblNewLabel_3_1.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		panel_2_1_1.add(lblNewLabel_3_1);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBackground(new Color(240, 219, 225));
		panel_2_1_2.setBounds(397, 10, 159, 37);
		panel_1.add(panel_2_1_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("總金額");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setForeground(new Color(125, 49, 70));
		lblNewLabel_3_2.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		panel_2_1_2.add(lblNewLabel_3_2);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(240, 219, 225));
		panel_2_2.setBounds(10, 163, 209, 37);
		panel_1.add(panel_2_2);
		
		JLabel lblNewLabel_4 = new JLabel("合　　計");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(new Color(125, 49, 70));
		lblNewLabel_4.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		panel_2_2.add(lblNewLabel_4);
		
		
		
		JLabel lblNewLabel_3_3 = new JLabel("2,680");
		lblNewLabel_3_3.setBounds(242, 57, 62, 25);
		panel_1.add(lblNewLabel_3_3);
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setForeground(new Color(125, 49, 70));
		lblNewLabel_3_3.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		
		JPanel panel_2_1_3 = new JPanel();
		panel_2_1_3.setBackground(new Color(240, 219, 225));
		panel_2_1_3.setBounds(232, 57, 72, 25);
		panel_1.add(panel_2_1_3);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("2,680");
		lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1.setForeground(new Color(125, 49, 70));
		lblNewLabel_3_3_1.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_3_3_1.setBounds(242, 93, 62, 25);
		panel_1.add(lblNewLabel_3_3_1);
		
		JPanel panel_2_1_3_1 = new JPanel();
		panel_2_1_3_1.setBackground(new Color(240, 219, 225));
		panel_2_1_3_1.setBounds(232, 93, 72, 25);
		panel_1.add(panel_2_1_3_1);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("2,680");
		lblNewLabel_3_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_2.setForeground(new Color(125, 49, 70));
		lblNewLabel_3_3_2.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_3_3_2.setBounds(242, 128, 62, 25);
		panel_1.add(lblNewLabel_3_3_2);
		
		JPanel panel_2_1_3_2 = new JPanel();
		panel_2_1_3_2.setBackground(new Color(240, 219, 225));
		panel_2_1_3_2.setBounds(232, 128, 72, 25);
		panel_1.add(panel_2_1_3_2);
		
		JTextArea output = new JTextArea();
		output.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		output.setBounds(10, 393, 280, 160);
		contentPane.add(output);
		
		Qty_Love = new JTextField();
		Qty_Love.setBounds(315, 57, 72, 25);
		panel_1.add(Qty_Love);
		Qty_Love.setColumns(10);
		
		Qty_Sweet = new JTextField();
		Qty_Sweet.setColumns(10);
		Qty_Sweet.setBounds(315, 93, 72, 25);
		panel_1.add(Qty_Sweet);
		
		Qty_Divine = new JTextField();
		Qty_Divine.setColumns(10);
		Qty_Divine.setBounds(315, 128, 72, 25);
		panel_1.add(Qty_Divine);
		
		Qty_Sum = new JTextField();
		Qty_Sum.setColumns(10);
		Qty_Sum.setBounds(315, 163, 72, 37);
		panel_1.add(Qty_Sum);
		
		Amt_Love = new JTextField();
		Amt_Love.setColumns(10);
		Amt_Love.setBounds(397, 57, 159, 25);
		panel_1.add(Amt_Love);
		
		Amt_Sweet = new JTextField();
		Amt_Sweet.setColumns(10);
		Amt_Sweet.setBounds(397, 93, 159, 25);
		panel_1.add(Amt_Sweet);
		
		Amt_Divine = new JTextField();
		Amt_Divine.setColumns(10);
		Amt_Divine.setBounds(397, 128, 159, 25);
		panel_1.add(Amt_Divine);
		
		Amt_Sum = new JTextField();
		Amt_Sum.setColumns(10);
		Amt_Sum.setBounds(397, 163, 159, 37);
		panel_1.add(Amt_Sum);
		
		JTextArea output_return = new JTextArea();
		output_return.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		output_return.setBounds(296, 393, 280, 160);
		contentPane.add(output_return);
		
		
		JRadioButton Paytype = new JRadioButton("現金");
		Paytype.setSelected(true);
		Paytype.setForeground(new Color(125, 49, 70));
		buttonGroup.add(Paytype);
		Paytype.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		Paytype.setBounds(100, 212, 72, 23);
		panel_1.add(Paytype);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("信用卡");
		rdbtnNewRadioButton_1.setForeground(new Color(125, 49, 70));
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		rdbtnNewRadioButton_1.setBounds(100, 256, 81, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		Cash = new JTextField();
		Cash.setText("0");
		Cash.setColumns(10);
		Cash.setBounds(177, 210, 141, 25);
		panel_1.add(Cash);
		
		
		
				
		JButton summit = new JButton("送出");
		summit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String Qty_love = Qty_Love.getText();
				String Qty_sweet = Qty_Sweet.getText();
				String Qty_divine = Qty_Divine.getText();
				String cash = Cash.getText();
				Integer cashReveive = Integer.parseInt(cash);
								
				if ((Qty_love.length()==0)||(Qty_sweet.length()==0)||(Qty_divine.length()==0))
				{
						JOptionPane.showMessageDialog(contentPane,"請確認您輸入的購買數量!","輸入警示", 2, null);
				}
				
				else if(cashReveive<=0)
				{
					JOptionPane.showMessageDialog(contentPane,"請確認您輸入的收現金額!","輸入警示", 2, null);
				}
								
				else
				{			
					
				Integer qty_love = Integer.parseInt(Qty_love);
				Integer qty_sweet = Integer.parseInt(Qty_sweet);
				Integer qty_divine = Integer.parseInt(Qty_divine);
				
				Product [] p = new ProductList [3];
				p[0]= new ProductList("Love & Light心靈修護",qty_love);
				p[1]= new ProductList("Sweet Dreams 甜美夢境",qty_sweet);
				p[2]= new ProductList("Divine Light純淨極光",qty_divine);		
					
				Qty_Sum.setText(String.valueOf(qty_love + qty_sweet + qty_divine));
				Amt_Love.setText(String.valueOf(p[0].caucalate(qty_love)));
				Amt_Sweet.setText(String.valueOf(p[1].caucalate(qty_sweet)));
				Amt_Divine.setText(String.valueOf(p[2].caucalate(qty_divine)));
				
				Integer total=p[0].caucalate(qty_love)+p[1].caucalate(qty_sweet)+(p[2].caucalate(qty_divine));
				Amt_Sum.setText(String.valueOf(total));
				int A1000 = (cashReveive-total)/1000;
				int A500 = (cashReveive-total-A1000*1000)/500;
				int A100 = (cashReveive-total-A1000*1000-A500*500)/100;
				int A50 = (cashReveive-total-A1000*1000-A500*500-A100*100)/50;
				int A10 = (cashReveive-total-A1000*1000-A500*500-A100*100-A50*50)/10;
				int A5 = (cashReveive-total-A1000*1000-A500*500-A100*100-A50*50-A10*10)/5;
				int A1 = (cashReveive-total-A1000*1000-A500*500-A100*100-A50*50-A10*10-A5*5)/1;
				
				if(cashReveive<=total)
				{
					JOptionPane.showMessageDialog(contentPane,"請確認您輸入的收現金額!","輸入警示", 2, null);
				}
				
				else
				{
					output_return.setText("找零："+
							  "\n"+A1000+"張1000元"+
							  "\n"+A500+"張500元"+
							  "\n"+A100+"張100元"+
							  "\n"+A50+"個50元"+
							  "\n"+A10+"個10元"+
							  "\n"+A5+"個5元"+
							  "\n"+A1+"個1元");		
				}
				
				Boolean paytype =Paytype.isSelected();
				if (paytype == true)
				{
					output.setText(p[0].show(qty_love, qty_sweet, qty_divine)+"\n付款方式：現金");								
				}
				else
				{
					output.setText(p[0].show(qty_love, qty_sweet, qty_divine)+"\n付款方式：信用卡");
					output_return.setText("收您信用卡，無須找零");
				}
				
				
				}
				}
				
				
			
		});
		summit.setForeground(new Color(125, 49, 70));
		summit.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		summit.setBounds(211, 250, 107, 37);
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
		close.setBounds(449, 250, 107, 37);
		panel_1.add(close);
		
		JButton print = new JButton("列印");
		print.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					output.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		print.setForeground(new Color(125, 49, 70));
		print.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		print.setBounds(332, 250, 107, 37);
		panel_1.add(print);
	
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(new Color(240, 219, 225));
		panel_2_3.setBounds(10, 210, 81, 76);
		panel_1.add(panel_2_3);
		
		JLabel lblNewLabel_5 = new JLabel("付款");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(new Color(125, 49, 70));
		lblNewLabel_5.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		panel_2_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("方式");
		panel_2_3.add(lblNewLabel_5_1);
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setForeground(new Color(125, 49, 70));
		lblNewLabel_5_1.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		
		
		
		
		
		
		
		
	}
}
