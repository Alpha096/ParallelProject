package com.cg.mra.ui;

import java.util.Scanner;
import com.cg.mra.exception.AccountException;
import com.cg.mra.beans.Account;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MainUI {
	public static void main(String args[]) throws AccountException{
		AccountService service=new AccountServiceImpl();
		Account account = new Account();
		int ch=0;
		Scanner sc=new Scanner(System.in);
		do{	
			System.out.println("1. Account Balance Enquiry ");
			System.out.println("2. Recharge Account");
			System.out.println("3. Exit");
			System.out.println("Enter Your Choice");
			ch=sc.nextInt();
			switch(ch)
			{
			//Balance Enquiry
			case 1:
				System.out.println("Enter Mobile No : ");
				String mobile=sc.next();
				account = service.getAccountDetails(mobile);
				if(service.validatePhoneNo(mobile)){
					if( account!=null)
						System.out.println("Your Current Balance is Rs. " + account.getAccountBalance());
					else
						System.out.println("ERROR: Given Account Id does not exist");
				}
				else
					System.out.println("Enter a valid phone number");
			break;
			
			//Account Recharge
			case 2:
				System.out.println("Enter Mobile No : ");
				String mob =sc.next();
				System.out.println("Enter Recharge Amount : ");
				double amt =sc.nextDouble();
				if(service.validatePhoneNo(mob) && service.validateRechargeAmt(amt))
					service.rechargeAccount(mob, amt);
				else
					System.out.println("Check phone number or recharge amount");
			break;
			}
			
		}while(ch!=3);
		
		sc.close();
		System.out.println("Application closed");
}
	}
