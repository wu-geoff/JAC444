import java.io.*;
public class ATM {
	private static Account[] testArr = new Account[10];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		for(int i = 0;i < testArr.length; i++){
			testArr[i] = new Account(i, 100);
		}
		
		int id = 0;
		boolean doneWithMainMenu = false;
		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter an id: ");
			id = Integer.parseInt(br.readLine());
			if(id >= 0 && id <= 9) {
				doneWithMainMenu = mainMenu(id);
			}
			else {
				System.out.println("Account not exist, try again");
			}
		} while (!(id >= 0 && id <= 9) || doneWithMainMenu);
	}
	
	private static boolean mainMenu(int acct) throws NumberFormatException, IOException {
		int choice = 0;
		do {
			System.out.print("Main menu\n" + 
							"1: check balance\n" + 
							"2: withdraw\n" + 
							"3: deposit\n" + 
							"4: exit\n");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter a choice: ");
			choice = Integer.parseInt(br.readLine());
			if(choice == 1) {
				System.out.println("The balance is " + testArr[acct].getBalance());
			}
			else if (choice == 2) {
				System.out.print("Enter an amount to withdraw: ");
				double amount = Double.parseDouble(br.readLine());
				testArr[acct].withdraw(amount);
			}
			else if (choice == 3) {
				System.out.print("Enter an amount to deposit: ");
				double amount = Double.parseDouble(br.readLine());
				testArr[acct].deposit(amount);
			}
			else if (choice == 4) {
				System.out.println("Bye :)");
			}
			else {
				System.out.println("Invalid selection, try again");
			}
			System.out.println();
		} while (!(choice >= 1 && choice <= 4) || choice != 4);
		return true;
	}

}
