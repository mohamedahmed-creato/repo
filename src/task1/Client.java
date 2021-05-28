package task1;
/**
 * this is a class for client
 * @author Mohamed 
 */
public class Client {
   protected String name;
   protected String nationalID;
   protected String address;
   protected int phone;
   protected Account acc;

   /**
    * this is a parameterize constructor 
    * @param name the name of the client 
    * @param nationalID the national id of the client 
    * @param address the address of the client
    * @param phone the phone of the client 
    * @param acc data of account 
    */
    public Client(String name, String nationalID, String address, int phone,Account acc) {
        this.name = name;
        this.nationalID = nationalID;
        this.address = address;
        this.phone = phone;
        this.acc = acc;
    }
/**
 * this is a default constructor 
 */
    Client() {}

/**
 * this function set client name 
 * @param name 
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * this function set client national id
 * @param nationalID 
 */
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }
/**
 * this function set client address
 * @param address 
 */
    public void setAddress(String address) {
        this.address = address;
    }
/**
 * this function set client phone
 * @param phone 
 */
    public void setPhone(int phone) {
        this.phone = phone;
    }
 /**
  * this function set account information
  * @param acc 
  */   
    public void setAcc(Account acc) {
        this.acc = acc;
    }
    
/**
 * 
 * @return client name
 */
    public String getName() {
        return name;
    }
/**
 * 
 * @return client national id
 */
    public String getNationalID() {
        return nationalID;
    }
/**
 * 
 * @return client address 
 */
    public String getAddress() {
        return address;
    }
/**
 * 
 * @return client phone
 */
    public int getPhone() {
        return phone;
    }
/**
 * 
 * @return data about account
 */
    public Account getAcc() {
        return acc;
    }
/**
 * this function override 
 * @return all data about client
 */
   @Override
    public String toString(){
       String account1=acc.toString();
       return  "nameis:" +name +",nationalID is:" + nationalID +",address is:"+address+",phone is:"+phone+",account info is:"+ account1;
        
    }  
}