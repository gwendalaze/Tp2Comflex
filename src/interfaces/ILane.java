package interfaces;

import datatypes.Cart;
import datatypes.Order;
import exception.InsufficientBalanceException;
import exception.InvalidCartException;
import exception.UnknownAccountException;
import exception.UnknownItemException;

public interface ILane {

	Order pay(Cart cart, String address, String account) throws InvalidCartException, UnknownItemException, InsufficientBalanceException, UnknownAccountException;

	Cart addItemToCart(Cart cart, IClient client, Object item, int qty)
			throws UnknownItemException, InvalidCartException;

}
