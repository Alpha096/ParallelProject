package cg.mypaymentapp.ui;

import java.math.BigDecimal;
import java.util.Scanner;

import cg.mypaymentapp.beans.Customer;
import cg.mypaymentapp.beans.Wallet;
import cg.mypaymentapp.service.WalletService;
import cg.mypaymentapp.service.WalletServiceImpl;


public class Main {

	public static void main(String[] args) {
		WalletService service = new WalletServiceImpl();
		Scanner sc = new Scanner(System.in);
		int ch =0;
		do{
		
		System.out.println("1. Create Account ");
		System.out.println("2. Deposit Money ");
		System.out.println("3. Withdraw Money ");
		System.out.println("4. Check balance ");
		System.out.println("5. Fund transfer");
		System.out.println("6. Exit");
		System.out.println(" Enter your choice ");
		ch = sc.nextInt();
		
		switch(ch){
		case 1:
			Customer c = new Customer();
			System.out.println("Enter name: ");
			String name = sc.next();
			System.out.println("Enter Phone number: ");
			String mobileNo= sc.next();
			System.out.println("Enter initial amount:");
			BigDecimal bal = sc.nextBigDecimal();
			c = service.createAccount(name, mobileNo, bal);
			System.out.println("Customer added .. ");
			break;
			
		/*case 2:
			System.out.println("Enter Customer ID: ");
			int custId =sc.nextInt();
			System.out.println("Enter amount: ");
			double amt = sc.nextDouble();
			service.deposit(custId,amt); 
			break;
			
		case 3:
			System.out.println("Enter Customer ID: ");
			int custIdwithdraw = sc.nextInt();
			System.out.println("Enter amount to withdraw: ");
			double withdrawamt = sc.nextDouble();
			service.withdraw(custIdwithdraw, withdrawamt);
			break;
			
		case 4:
			System.out.println("Enter Customer ID: ");
			int custid = sc.nextInt();
			double bal = service.checkbal(custid);
			System.out.println("Balance is :" + bal);
			break;
		
		case 5:
			System.out.println("Enter Customer ID from which amount has to be transferred: ");
			int custid1 = sc.nextInt();
			System.out.println("Enter Customer ID into which amount has to be transferred: ");
			int custid2 = sc.nextInt();
			System.out.println("Enter amount to transfer: ");
			double transamt = sc.nextDouble();
			service.fundtrans(custid1, custid2, transamt);
			break;						
		}*/
		}
		}while(ch!=6);
			
		
	}

}
