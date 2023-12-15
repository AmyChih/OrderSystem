package OrderSystem;

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
		this.productName = productName;
		this.productSalesQty = productSalesQty;
	}
	
	public Product()
	{}
	
	
	//methods
	public Integer calculate()
	{
		this.productSalesTotal = this.productSalesPrice * this.productSalesQty;
		return this.productSalesTotal;
	}		
	public String show()
	{
		return "\n" + this.productName + this.productSalesQty +"瓶";
	}
	public String Get_ProductName()
	{
		return this.productName;
	}
	public Integer Get_ProductSalesPrice()
	{
		return this.productSalesPrice;
	}
	public Integer Get_ProductSalesQty()
	{
		return this.productSalesQty;
	}
}
