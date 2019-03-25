package interfaces;

import exception.InsufficientBalanceException;

public interface IBalanceMgt {
	void credit(double amount);
	
	void withdraw(double amount) throws InsufficientBalanceException;
}
