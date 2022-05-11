package bankEks1;

public class BankAccount {

	private double balance;

	//for at lave den om til en moitor skal du skrive ''synchronized'' efter public



	public synchronized void setBalance(double amount, String action) {
		if (action.equals("c")) {
			balance = balance + amount;
		}
		if (action.equals("d")){
			balance = balance - amount;
		}
		
	}

	public double getBalance() {
		return balance;
	}
}
