package hwaccount;

public class AccountClient {

	
	
	double cost;
	double amount;
	
	//para çekme
	public void withDraw(Account account,double amount) {
		
		
		if(amount > account.getBalance()) 
			
			System.out.println("Yetersiz bakiye, isleminiz gerceklestirilemedi");
			
		else {
		
			System.out.println(amount+ "Islem gerceklestirildi");
			
		}
	}
	
	
		
	//para yatırma
		
		public void depositure(Account account, Double amount) {
			
			account.setBalance(account.getBalance()+ amount);
			
			System.out.println("Para yatırma islemi tamamlandi");
			
		}
		
		
		//havale
		
		
		public void transfer(Account fromAccount, Account toAccount, Double amount) {
			
			if (fromAccount.getBalance() < amount)
				System.out.println("Yetersiz bakiye");
			else
				
				System.out.println("Havale isleminiz gerceklestirildi");
		}





				
			
	


		}
			

		
		
		
		
	
	

