package cg.mypaymentapp.service;

import java.math.BigDecimal;

import cg.mypaymentapp.beans.Customer;

public interface WalletService {
public Customer createAccount(String name ,String mobileno, BigDecimal balance);
public Customer showBalance (String mobileno);
public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, BigDecimal amount);
public Customer depositAmount (String mobileNo,BigDecimal amount );
public Customer withdrawAmount(String mobileNo, BigDecimal amount);

}
