package com.cg.mra.dao;

import com.cg.mra.beans.Account;

public interface AccountDAO {
	Account getAccountDetails(String mobileNo);
	double rechargeAccount(String mobileNo, double rechargeAmount);

}
