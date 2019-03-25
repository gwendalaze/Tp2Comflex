package exec;

import impl.AccountImpl;
import impl.BankImpl;
import impl.ClientImpl;
import impl.ProviderImpl;
import impl.StoreImpl;
import interfaces.ITransfert;
import interfaces.IProvider;

public class MainClass {

    public static void main (String [] args) {
		IProvider prov = new ProviderImpl();
		AccountImpl accAnne = new AccountImpl();
		AccountImpl accBob = new AccountImpl();
		AccountImpl accEStore = new AccountImpl();
		ITransfert bank = new BankImpl(accEStore,accAnne,accBob,
										accEStore,accAnne,accBob);
		StoreImpl store = new StoreImpl(prov,bank);
		ClientImpl cl = new ClientImpl(store,store,store);
		
		cl.run();
    }
}
