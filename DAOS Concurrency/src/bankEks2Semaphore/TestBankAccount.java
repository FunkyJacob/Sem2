package bankEks2Semaphore;

public class TestBankAccount {

	public static void main(String[] args) {
		bankEks2Semaphore.BankAccount ba = new bankEks2Semaphore.BankAccount();
			bankEks2Semaphore.BankAccountTraad bat1 = new BankAccountTraad(ba);
			bankEks2Semaphore.BankAccountTraad2 bat2 = new BankAccountTraad2(ba);
			
			bat1.start();
			bat2.start();
		}
}
