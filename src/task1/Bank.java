package task1;
import java.util.ArrayList;
/**
 * this is a class bank
 * @author dell
 */
public class Bank {
    private static int counter=0;
    private String name;
    private String adrress;
    private int phone;

    /**
     * this is parmerize constructor
     * @param name the name of bank
     * @param adrress the address of bank
     * @param phone the phone of bank
     */
    public Bank(String name, String adrress, int phone) {
        this.name = name;
        this.adrress = adrress;
        this.phone = phone;
    }

    /**
     * this is a default constructor
     */
    public Bank() {
    }

/**
 * this function set name
 * @param name 
 */
    public void setName(String name) {
        this.name = name;
    }

/**
 * this function set address
 * @param adrress 
 */
    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

/**
 * this function set phone
 * @param phone 
 */
    public void setPhone(int phone) {
        this.phone = phone;
    }

/**
 * 
 * @return name 
 */
    public String getName() {
        return name;
    }

/**
 * 
 * @return address
 */
    public String getAdrress() {
        return adrress;
    }

/**
 * 
 * @return phone
 */
    public int getPhone() {
        return phone;
    }
    ArrayList<Account> accounts=new ArrayList<>();
    ArrayList<Client> clients=new ArrayList<>();
     public void addclient(Client client)
    {
        clients.add(client);
        accounts.add(client.getAcc());
        counter++;
          
    }
     
      
     
    public Bank display()
    {
        for(int i=0;i<counter;i++)
        {
          System.out.println("display all data about client");
          System.out.println(i+1);
          System.out.println(clients.get(i).toString());
            
        }
        return this;
    }
        
   
    
    
    
    
    


    }
