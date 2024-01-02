package MemberSystem;

public class ProductList extends Product
{
	//field
	private int productSalesQty;
	private String productName;	
	
	//constructors
	ProductList()
	{		
	}	
	
	ProductList(String productName,int productSalesQty )
	{
		super(productName,productSalesQty);
		this.productName=productName;
		this.productSalesQty=productSalesQty;		
	}	
	
	//methods
	
	
}
