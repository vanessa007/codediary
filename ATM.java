import java.util.*;

public class ATM {
	public static void main(String[] args) {
		// Create 10 accounts (id = 0, 1...9) with initial balance 100 dollars
		
		ATMAccount[] accounts = new ATMAccount[10]; 
				
		for (int i = 0; i < 10; i++) {
			accounts[i] = new ATMAccount(i, 100); 
		}
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\n\nEnter an id: ");
			int id = input.nextInt();
			
			while (true) {
				
				System.out.print("\n\nMain menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\nEnter a choice: ");
				int choice = input.nextInt();
				
				if (choice == 4) break;
				
				process(accounts[id], choice);
			}
			
		}

	}
	
	public static void process(ATMAccount account, int choice) {
		if (choice == 1) {
			System.out.println("The balance is " + account.getBalance());
		} else if (choice == 2) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter an ammount to withdraw: ");
			double withdraw = input.nextDouble();
			account.withDraw(withdraw);
		} else if (choice == 3) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter an ammount to deposit: ");
			double deposit = input.nextDouble();
			account.deposit(deposit);
		}
}

}
