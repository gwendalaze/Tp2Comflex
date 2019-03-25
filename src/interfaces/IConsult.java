package interfaces;

import exception.UnknownItemException;

public interface IConsult {
	boolean isAvailable(Object item, int qty)throws UnknownItemException;
	
	double getPrice(Object item ) throws UnknownItemException;
}
