package hwaccount;

public class AccountTest {
	
	public static void main(String[] args) {

	AccountClient accountClient= new AccountClient();
	
	Account from = new Account();
	Account to= new Account();
	
	
	accountClient.withDraw(from, 100.0);
	accountClient.depositure(to, 200.0);
	accountClient.transfer(from, to, 150.0);
	
	
	
	}
	
	
			
		
		
	}
	

