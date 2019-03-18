package exception;

public class InsufficientBalanceException extends Exception {
    
    private static final long serialVersionUID = 1365771904467860173L;
    private String account;
    
    public InsufficientBalanceException( String account ) {
        super();
        this.account = account;
    }
    
    public String getMessage() {
        return "The account "+account+" is not sufficiently balanced.";
    }
}
