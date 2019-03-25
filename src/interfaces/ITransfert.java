package interfaces;

import exception.InsufficientBalanceException;
import exception.UnknownAccountException;

public interface ITransfert {

	void transfert(String bankAccountRef, String string, double amount) throws InsufficientBalanceException, UnknownAccountException;

}
