package task1;
/**
 * this is a class for especial account that inherit from class account
 * @author mohamed
 */
public class SpecialAccount extends Account{
 
    /**
     * this is a default constructor
     */
    SpecialAccount() 
    {}

    /**
     * this is a parameterize constructor
     * @param balance the balance of account
     * @param Accountnumber the account number
     */
  public SpecialAccount(float balance, int Accountnumber)
  {
      super(balance,Accountnumber);
  }

  /**
   * this function override 
   * this function withdraws the money up to the maximum amount in the balance And a thousand more
   * @param money 
   */
    @Override
    public void Withdraw(float money) {
        super.Withdraw(money);
         if(money>balance){
             if(balance-money>=-1000)
           {balance=balance-money;}
        else{
             System.out.println("Money greater than your balance " + balance);
            
            }
         }
         else{
             
            balance=balance-money;
         }
        
       
    }
}
