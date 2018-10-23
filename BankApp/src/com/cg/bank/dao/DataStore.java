package com.cg.bank.dao;

import java.util.HashMap;
import java.util.Map;
import com.cg.bank.dto.Customer;


public class DataStore {
	private static Map<Integer, Customer> cust;
	public static Map<Integer, Customer> createCollection() {
		if(cust==null)
			cust = new HashMap<>();
		return cust;
	}

}
