package metier;

import interfaces.IProvider;

import java.util.HashMap;
import java.util.Map;

import exception.UnknownItemException;

public class ProviderMetier implements IProvider{
    	
    private Map<String, Double> itemPrices = new HashMap<String, Double>();

    /**
     * Constructs a new ProviderImpl
     */
    public ProviderMetier() {
        itemPrices.put("CD",new Double(15));
        itemPrices.put("DVD",new Double(20));
    }


    /**
     * Get the price of an item provided by this provider.
     * 
     * @param item
     * @return
     */
    public double getPrice( Object item ) throws UnknownItemException {
        
        if ( ! itemPrices.containsKey(item) )
            throw new UnknownItemException(
                    "Item "+item+
                    " is not an item delivered by this provider.");
        
        Double price = (Double) itemPrices.get(item);
        return price.doubleValue();
    }
    
    /**
     * Emit an order for items.
     * The provider returns the delay for delivering the items.
     * 
     * @param store  the store that emits the order
     * @param item   the item ordered
     * @param qty    the quantity ordered
     * @return       the delay (in hours)s
     */
    public int order(Object item, int qty )
    throws UnknownItemException {
        
        if ( ! itemPrices.containsKey(item) )
            throw new UnknownItemException(
                    "Item "+item+
                    " is not an item delivered by this provider.");
        
        // Actually the production process is quite chaotic
        // We only know that the production a random number of hours!!
        double r = Math.random() * 10 * qty;
        return (int)r;
    }

}
