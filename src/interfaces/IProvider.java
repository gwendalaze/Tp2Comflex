package interfaces;

import exception.UnknownItemException;

public interface IProvider {
	public double getPrice(Object item) throws UnknownItemException;

	public int order(Object item, int quantity) throws UnknownItemException;
}
