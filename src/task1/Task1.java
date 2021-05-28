//mohamed ahmed abdallah ahmed ,ziad ahmed
//20190414,20190216
package task1;
import java.util.Scanner;
public class Task1 {
     static void option()
     {
         System.out.println("1.add");
         System.out.println("2.display");
         System.out.println("3.withdraw");
         System.out.println("4.deposit");
         System.out.println("5.exit");
     }
     
    public static void main(String[] args) {
          Account a=new Account() ;
      
      System.out.println(a.getAccount_Number());
      System.out.println(a.getBalance());
      a.setAccount_Number(600);
      a.setBalance(1000);
      System.out.println(a.getAccount_Number());
      System.out.println(a.getBalance());
      System.out.println(a.toString());
      a.Withdraw(800);
      a.Deposit(30);
      
      SpecialAccount Sa= new SpecialAccount() ;
      System.out.println(Sa.getAccount_Number());
      System.out.println(Sa.getBalance());
      Sa.setAccount_Number(600);
      Sa.setBalance(700);
      System.out.println(Sa.getAccount_Number());
      System.out.println(Sa.getBalance());
      System.out.println(Sa.toString());
      Sa.Withdraw(500);
      Client w=new Client();
      w.setName("mohamed");
      w.setAddress("cairo");
      w.setNationalID("161151");
      w.setAcc(a);
     System.out.println( w.getName());
     System.out.println(  w.getAddress());
     System.out.println(  w.getNationalID());
      System.out.println( w.getAcc());
      CommercialClient ww=new CommercialClient();
      ww.setName("mohamed");
      ww.setAddress("cairo");
      ww.setCommercialID("161151");
      ww.setAcc(a);
     System.out.println( w.getName());
     System.out.println(  w.getAddress());
     System.out.println(  ww.getCommercialID());
      System.out.println( w.getAcc());
        int user_choice;
        int value;
        Account account1=new Account();
        SpecialAccount specialaccount=new SpecialAccount();
        Client client1=new Client();
        CommercialClient commercialclient=new CommercialClient();
        Bank bank1=new Bank();
        Scanner input= new Scanner (System .in);
       
         while (true) {
             option();
             user_choice=input.nextInt();
             switch (user_choice) {
                 case 1:
                     input.nextLine();
                     client1.setName(input.nextLine());
                     client1.setAddress(input.nextLine());
                     client1.setNationalID(input.nextLine());
                     client1.setPhone(input.nextInt());
                     account1.setBalance(input.nextFloat());
                     account1.setAccount_Number(input.nextInt());
                     client1.setAcc(account1);
                     bank1.addclient(client1);
                     break;
                 case 2:
                     bank1.display();
                     break;
                 case 3:
                     System.out.println("enter the account number");
                     
                     break;
                 case 4:
                     System.out.println("enter the account number");
                     break;
                 case 5:
                     break;
                 default:
                     System.out.println("wrong input!");
                     break;
             }
         }
    }
    
}
