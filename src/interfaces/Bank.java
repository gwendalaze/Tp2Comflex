package interfaces;

import exception.InsufficientBalanceException;
import exception.UnknownAccountException;

public interface Bank {

	void transfert(String bankAccountRef, String string, double amount) throws InsufficientBalanceException, UnknownAccountException;

}
