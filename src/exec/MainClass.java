package exec;

import metier.AccountMetier;
import metier.BankMetier;
import metier.ClientMetier;
import metier.ProviderMetier;
import metier.StoreMetier;
import interfaces.ITransfert;
import interfaces.IProvider;

public class MainClass {

    public static void main (String [] args) {
		IProvider prov = new ProviderMetier();
		AccountMetier accAnne = new AccountMetier();
		AccountMetier accBob = new AccountMetier();
		AccountMetier accEStore = new AccountMetier();
		ITransfert bank = new BankMetier(accEStore,accAnne,accBob,
										accEStore,accAnne,accBob);
		StoreMetier store = new StoreMetier(prov,bank);
		ClientMetier cl = new ClientMetier(store,store,store);
		
		cl.run();
    }
}
