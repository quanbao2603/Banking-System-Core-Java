
import java.util.ArrayList;
import java.util.List;
    
public class Account {
    private String accountNumber;
    private String customer;
    private double  balance;
    private List<Transaction> transactions;
    public Account(String accountNumber, String customer, double balance){
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public String getCustomer(){
        return customer;
    }
    public Double getBalance(){
        return balance;
    }
    public List<Transaction> getTransactions(){
        return transactions;        
    }
}
