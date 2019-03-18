package interfaces;

import exception.UnknownItemException;

public interface Provider {
	public double getPrice(Object item) throws UnknownItemException;

	public int order(Store store, Object item, int quantity) throws UnknownItemException;
}
