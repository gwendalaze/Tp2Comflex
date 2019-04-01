package impl;

import interfaces.IAdmin;
import interfaces.IBalanceMgt;
import interfaces.ITransfert;
import exception.InsufficientBalanceException;
import exception.UnknownAccountException;

public class BankMetier implements ITransfert {

	private IAdmin estore, anne, bob;
	private IBalanceMgt estore_b, anne_b, bob_b;

	public BankMetier (IAdmin in_estore, IAdmin in_anne, IAdmin in_bob,
			IBalanceMgt in_estore_b, IBalanceMgt in_anne_b,IBalanceMgt in_bob_b) {
		estore = in_estore;
		estore_b = in_estore_b;
		anne = in_anne;
		anne_b = in_anne_b;
		bob = in_bob;
		bob_b = in_bob_b;
		estore.setOwner("Estore");
		estore_b.credit(0);
		anne.setOwner("Anne");
		anne_b.credit(30);
		bob.setOwner("Bob");
		bob_b.credit(100);
	}
	
     public void transfert(String from, String to, double amount)
        throws InsufficientBalanceException, UnknownAccountException {
    	 IBalanceMgt Afrom=null, Ato=null;        
 
        if (from.equals("E-Store")) Afrom = estore_b;
        	if (from.equals("Anne")) Afrom = anne_b;
        	if (from.equals("Bob")) Afrom = bob_b;
        	
        	if (to.equals("E-Store")) Ato = estore_b;
        	if (to.equals("Anne")) Ato = anne_b;
        	if (to.equals("Bob")) Ato = bob_b;
            
            // Perform the transfert
			Afrom.withdraw(amount);
			Ato.credit(amount);
    }
    
 }
