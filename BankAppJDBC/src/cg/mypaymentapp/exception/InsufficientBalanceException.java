package cg.mypaymentapp.exception;

public class InsufficientBalanceException extends RuntimeException{

	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
