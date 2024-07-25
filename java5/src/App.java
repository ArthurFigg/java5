import java.util.Scanner;

import account.entities;

public class App {
    public static void main(String[] args) throws Exception {
    entities entities;
    
    Scanner sc = new Scanner(System.in);

     System.out.print("enter account number: ");
     int number = sc.nextInt();
     System.out.print("enter account holder: ");
     sc.nextLine();
     String holder = sc.nextLine();
     System.out.print("is there an inital deposit (y/n)? ");
     char response = sc.next().charAt(0);
     if (response == 'y'){
        System.out.print("enter initial deposit value: ");
        double initialdeposit = sc.nextDouble();
        entities = new entities(number, holder, initialdeposit);
     } else {
        entities = new entities(number, holder);
     }
       System.out.println();
       System.out.println("account data: ");
       System.out.println(entities);
       System.out.println();
       System.out.print("enter a deposit value: ");
       double depositValue = sc.nextDouble();
       entities.deposit(depositValue);
       System.out.println("updated account data: ");
       System.out.println(entities);
     
       System.out.println();
       System.out.println("account data: ");
       System.out.println(entities);
       System.out.println();
       System.out.print("enter a withdraw value: ");
       double withdrawValue = sc.nextDouble();
       entities.withdraw(withdrawValue);
       System.out.println("updated account data: ");
       System.out.println(entities);


    sc.close();
}
}