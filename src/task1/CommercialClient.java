package task1;
/**
 * this is a class for commercial client that inherit from class client
 * @author Mohamed
 */
public class CommercialClient extends Client  {
    private String commercialID;
    
/**
 * this is a default constructor
 */
   public CommercialClient() {
    }

   /**
    * this is a parmerize constructor
    * @param name  the name of the client 
    * @param nationalID the national id of the client    
    * @param address the address of the client
    * @param phone the phone of the client 
    * @param acc data of account
    * @param commercialID  the commercial id for the commercial client
    */
    public CommercialClient(String name, String nationalID, String address, int phone, Account acc,String commercialID) {
        super(name, "0000000000000", address, phone, acc);
        this.commercialID=commercialID;
    }
    
    /**
     * this function set commercial id
     * @param commercialID 
     */
    public void setCommercialID(String commercialID) {
        this.commercialID = commercialID;
    }

    /**
     * 
     * @return commercial id for the client
     */
    public String getCommercialID() {
        return commercialID;
    }

    /**
     * this function override
     * @return all data about commercial client
     */
     @Override
    public String toString()
    {
         return  "nameis:" +name +",commericalID is:" + commercialID +",address is:"+address+",phone is:"+phone+",account info is:"+acc;
    }
    
  
    
}
