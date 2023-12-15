package MemberSystem;

public class member 
{
	//field
	private String account;
	private String password;	
	
	//constructors
	
	public member()
	{
		this.account="ABC123";
		this.password="abc123";
		
	}
	
	public member(String account,String password)
	{
		this.account=account;
		this.password=password;
	}
	
	//methods
	
	public Boolean checkMember(String account,String password)
	{
		Boolean check =false;
		
		if(this.account.equals(account) && this.password.equals(password))
		{
			check =true;
		}
		else
		{
			check =false;
		}
			
		return check;
	}
	
	public String message (String account,String password)
	{
		String result = "";
		if(this.account.equals(account) && this.password.equals(password))
		{
			result="登入成功";			
		}
		else
		{
			result="帳號密碼錯誤";					
		}		
		
		return result;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
