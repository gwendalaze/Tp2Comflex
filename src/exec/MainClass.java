package exec;

import impl.BankImpl;
import impl.ClientImpl;
import impl.ProviderImpl;
import impl.StoreImpl;
import interfaces.Bank;
import interfaces.Provider;
import interfaces.Store;

public class MainClass {

    public static void main (String [] args) {
		Provider prov = new ProviderImpl();
		Bank bank = new BankImpl();
		Store store = new StoreImpl(prov,bank);
		ClientImpl cl = new ClientImpl(store);
		
		cl.run();
    }
}
