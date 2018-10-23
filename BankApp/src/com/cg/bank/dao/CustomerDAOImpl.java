package com.cg.bank.dao;

import java.util.Map;

import com.cg.bank.dto.Customer;


public class CustomerDAOImpl implements CustomerDAO{
	Map<Integer, Customer> custMap;
	public CustomerDAOImpl(){
		custMap = DataStore.createCollection();
		}

	@Override
	public int addCustomer(Customer customer) {
		int custId = (int) (1000*Math.random());
		customer.setCustId(custId);
		custMap.put(custId, customer);
		return custId;
		}

	@Override
	public void deposit(int custId, double amt) {
		Customer cust = custMap.get(custId);
		double inibal = cust.getIniBal();
		inibal = inibal + amt;
		String name = cust.getCustName();
		String mob = cust.getCustMob();
		int age = cust.getCustAge();
		cust.setIniBal(inibal);
		cust.setCustAge(age);
		cust.setCustId(custId);
		cust.setCustMob(mob);
		cust.setCustName(name);
		custMap.put(custId, cust);
		System.out.println("Amount deposited. New balance: " + inibal);
	}

	@Override
	public void withdraw(int custId, double amt) {
		Customer cust = custMap.get(custId);
		double inibal = cust.getIniBal();
		if((inibal-amt)>500){
		inibal = inibal - amt;
		String name = cust.getCustName();
		String mob = cust.getCustMob();
		int age = cust.getCustAge();
		cust.setIniBal(inibal);
		cust.setCustAge(age);
		cust.setCustId(custId);
		cust.setCustMob(mob);
		cust.setCustName(name);
		custMap.put(custId, cust);
		System.out.println("Amount withdrawan. New balance: " + inibal);
		}
		else{
			System.out.println("Cant withdraw! Insufficient balance: "+inibal);
		}

	}

	@Override
	public double checkbal(int custId) {
		Customer cust = custMap.get(custId);
		double bal = cust.getIniBal();		
		return bal;
		
	}

	@Override
	public void fundtrans(int custId1, int custId2, double amt) {
		Customer cust1 = custMap.get(custId1);
		Customer cust2 = custMap.get(custId2);
		double bal1 = cust1.getIniBal();
		if((bal1-amt)>500){
			double bal2 = cust2.getIniBal();
			bal2 = bal2 + amt;
			bal1 = bal1 - amt;
			String name1 = cust1.getCustName();
			String mob1 = cust1.getCustMob();
			int age1 = cust1.getCustAge();
			cust1.setIniBal(bal1);
			cust1.setCustAge(age1);
			cust1.setCustId(custId1);
			cust1.setCustMob(mob1);
			cust1.setCustName(name1);
			custMap.put(custId1, cust1);
			String name2 = cust2.getCustName();
			String mob2 = cust2.getCustMob();
			int age2 = cust2.getCustAge();
			cust2.setIniBal(bal2);
			cust2.setCustAge(age2);
			cust2.setCustId(custId2);
			cust2.setCustMob(mob2);
			cust2.setCustName(name2);
			custMap.put(custId2, cust2);
			System.out.println("Amount transferred!");
		}
		else{
			System.out.println("Insufficient funds in first account.");
		}
		
	}
	

}
