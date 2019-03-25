package exec;

import impl.AccountImpl;
import impl.BankImpl;
import impl.ClientImpl;
import impl.ProviderImpl;
import impl.StoreImpl;
import interfaces.Account;
import interfaces.Bank;
import interfaces.Provider;
import interfaces.Store;

public class MainClass {

    public static void main (String [] args) {
		Provider prov = new ProviderImpl();
		Account accAnne = new AccountImpl();
		Account accBob = new AccountImpl();
		Account accEStore = new AccountImpl();
		Bank bank = new BankImpl(accAnne,accBob,accEStore);
		Store store = new StoreImpl(prov,bank);
		ClientImpl cl = new ClientImpl(store);
		
		cl.run();
    }
}
