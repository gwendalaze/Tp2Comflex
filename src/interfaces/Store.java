package interfaces;

import datatypes.Cart;
import datatypes.Order;
import exception.InsufficientBalanceException;
import exception.InvalidCartException;
import exception.UnknownAccountException;
import exception.UnknownItemException;

public interface Store {

	Order pay(Cart cart, String address, String account) throws InvalidCartException, UnknownItemException, InsufficientBalanceException, UnknownAccountException;

	Cart addItemToCart(Cart cart, Client client, Object item, int qty)
			throws UnknownItemException, InvalidCartException;

	Order oneShotOrder(Client client, Object item, int qty, String address,
			String bankAccountRef) throws UnknownItemException,
			InsufficientBalanceException, UnknownAccountException;

}
