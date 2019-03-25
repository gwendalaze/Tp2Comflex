package interfaces;

import datatypes.Order;
import exception.InsufficientBalanceException;
import exception.UnknownAccountException;
import exception.UnknownItemException;

public interface IFastLane {
	Order oneShotOrder(IClient client, Object item, int qty, String address,
			String bankAccountRef) throws UnknownItemException,
			InsufficientBalanceException, UnknownAccountException;
}
