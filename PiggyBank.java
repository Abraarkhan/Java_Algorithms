package piggy_bank;

public class PiggyBank {
	
	
	private int account_no;
	private String account_holder_name;
	private int bank_balance = 0;

	
	public PiggyBank(int account_no, String account_holder_name, int initial_deposite) {
		this.account_no = account_no;
		this.account_holder_name = account_holder_name;
		this.bank_balance = initial_deposite;
	}

	public int getAccount_no() {
		return account_no;
	}

	
	public String account_holder_name() {
		return account_holder_name;
	}

	public void balance_inquiry() {
		System.out.println("Available balance : " + bank_balance);
	}

	
	public void deposit(int amount) {
		bank_balance += amount;
		System.out.println("Updated balance : " + bank_balance);
		
	}
	
	public void withdraw(int amount) {
		bank_balance -= amount;
		System.out.println("Remaining balance : " + bank_balance);
		
	}
	

	public void account_info() {
		System.out.println("Account No : " + account_no + "\n" + "Account Holder Name : " + account_holder_name + "\n" + "Available Balance : " + bank_balance);
	}
	
	
	
	
	
	
	
	
	
	
	

}
