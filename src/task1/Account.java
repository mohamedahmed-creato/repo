package task1;
/**
 * this is a class account
 * @author mohamed 
 */
public class Account {
    protected float balance;
    private int Accountnumber;
    
    /**
     * this function set balance
     * @param b 
     */  
    public void setBalance(float b)
    {balance = b;}
    
    /**
     * this function set account number
     * @param a 
     */
    public void setAccount_Number(int a)
    {Accountnumber = a;}
    
    /**
     * 
     * @return balance of account
     */
    public float getBalance()
    {return balance;}
    
    /**
     * 
     * @return account number
     */
    public int getAccount_Number()
    {return Accountnumber;}
    
    /**
     * this is a default constructor
     */
    public Account()             
    {}
    
    /**
     * this is a parameterize constructor
     * @param b  the balance of account
     * @param a  the account number
     */
    public Account(float b ,int a)
    {balance = b;
    Accountnumber = a;
      
    }

    /**
     * this function override 
     * @return all data about account
     */
   @Override
    public String toString() {
        return "Account{" + "balance=" + balance + ", Accountnumber=" + Accountnumber + '}';
    }
  
    /**
     * this function override 
     * this function withdraws the money up to the maximum amount in the balance
     * @param money 
     */
    public void Withdraw(float money)
    {     
        if (balance>=money){
        balance=balance-money;
        System.out.println("your balance becomes" +balance);
    }
        else{
           System.out.println("Error");
                }
    }

    /**
     * this function makes a deposit of money
     * @param money 
     */
  public void Deposit(float money)
  {
      
          balance = balance + money;
  System.out.println("your balance becomes" + balance);
  
  }

    boolean Withdraw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    }
