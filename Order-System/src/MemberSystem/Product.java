package MemberSystem;

public class Product {
	
	//field
	
	private int productNum;
	private String productName;
	private int productUnitQty=30;
	private String productUnit="ml";
	private String productType;
	private Integer productSalesQty;	
	private int productSalesPrice=2680;
	private int productSalesTotal;
	
	//constructors
	public Product(String productName,int productSalesQty)
	{
		this.productName=productName;
		this.productSalesQty=productSalesQty;
	}
	
	public Product()
	{}
	
	
	//methods
	public Integer caucalate(Integer productSalesQty)
	{
		
		this.productSalesQty=productSalesQty;
		this.productSalesTotal=productSalesPrice*productSalesQty;
		return this.productSalesTotal;
	}	
	
	public String show(int productSalesQty_Love,int productSalesQty_Sweet,int productSalesQty_Divine)
	{
		return "購買明細："+
			   "\nLove & Light心靈修護："+productSalesQty_Love+"瓶"+
			   "\nSweet Dreams 甜美夢境："+productSalesQty_Sweet+"瓶"+
			   "\nDivine Light純淨極光："+productSalesQty_Divine+"瓶"+
			   "\n總金額："+(productSalesQty_Love+productSalesQty_Sweet+productSalesQty_Divine)*productSalesPrice+"元"	;
	}
	
	
}
