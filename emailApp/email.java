package emailApp;

import java.util.*;

public class email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private int mailboxCapacity;
    private int defaultPasswordLength = 8;
    private String companySuffix = "aeycompany.com";
    private String updatedPassword;

    // Constructor to receive the first name and last name
    public email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

         //Call a method asking for the department -- return the department
        this.department = setDepartment();
        
        //Call a method to return a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("YOUR PASSWORD IS:"+this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
       
        //New password
        this.updatedPassword = changePassword(defaultPasswordLength);
        System.out.println("YOUR NEW PASSWORD IS:" + this.updatedPassword);
    }
   
    //Ask for the department
    private String setDepartment(){
        System.out.print("WELCOME:" + firstName + " " + lastName +"\nEnter the department code\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nENTER THE DEPARTMENT CODE:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1){return "Sales";}
        else if(depChoice == 2){return "Development";}
        else if(depChoice == 3){return "Accounting";}
        else if(depChoice == 4){return "None";}
        else{return "PLEASE ENTER A VALID INPUT";}
        
    }

    //Generate a random password
     private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_@$";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
     }


    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //Change the password
   private String changePassword(int length){
    System.out.println("ENTER 1 FOR NEW PASSWORD");
    Scanner in = new Scanner(System.in);
    int passChoice = in.nextInt();
    if (passChoice == 1) {return  this.password;}
    else{return "PASSWORD IS NOT UPDATED";}
   }

    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    
    public String showInfo(){
        return "DISPLAY NAME:" + firstName + " " + lastName +
        "\nCOMPANY EMAIL:" + email +
        "\nDEPARTMENT:" + department;
        
    }
}
