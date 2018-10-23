package cg.mypaymentapp.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cg.mypaymentapp.beans.Customer;
import cg.mypaymentapp.exception.InvalidInputException;

public class CustomerDAOImpl implements CustomerDAO{
	Connection connection;
	public CustomerDAOImpl() throws InvalidInputException{
		connection= DBConnection.getConnection();
	}
	@Override
	public Customer createAccount(String name, String mobileno,	BigDecimal balance) {
		
		
		String sql="insert into customer values(?,?)";
		String sql1="insert into wallet values"
			+ "(?,?)";
		Customer cust = new Customer();
		try {
			System.out.println(name+mobileno+balance);
			PreparedStatement ps=connection.prepareStatement(sql);
			System.out.println("check");
			PreparedStatement ps1 = connection.prepareStatement(sql1);
			ps.setString(1,mobileno);
			ps.setString(2,name);
			ps1.setString(1,mobileno);
			ps1.setBigDecimal(2,balance);
			int rowcount=ps.executeUpdate();
			System.out.println(rowcount);
			int rowcount1 = ps1.executeUpdate();
			if(rowcount==1 && rowcount1==1){
			return cust;
			}
		} catch (SQLException e) {
		throw new InvalidInputException(e.getMessage());
		}
		return null;
	}

	@Override
	public Customer showBalance(String mobileno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo,
			BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer depositAmount(String mobileNo, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer withdrawAmount(String mobileNo, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}

}
