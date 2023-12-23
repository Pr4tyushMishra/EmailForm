package emailApp;

import java.util.*;

public class emailApp {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("ENTER YOUR FIRSTNAME:");
        String firstName = obj.nextLine();

        System.out.println("ENTER THE LASTNAME:");
        String lastName = obj.nextLine();
    
        email userEmail = new email(firstName, lastName);
       
     obj.close();

     System.out.println(userEmail.showInfo());

     userEmail.setAlternateEmail("js@gmail.com");
     System.out.println("YOUR ALTERNATE EMAIL IS:" + userEmail.getAlternateEmail());

     userEmail.setMailboxCapacity(500);
     System.out.println("YOUR MAILBOX CAPACITY IS:" + userEmail.getMailboxCapacity());
    }
    
}
