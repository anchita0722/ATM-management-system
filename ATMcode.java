// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
//sum of two number taking input from user
class Main {
    public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
    System.out.println("welcome to ATM");
    System.out.print("Enter PIN:");
    int PIN = sc.nextInt();
    int balance =10000;
    int deposit =0;
    int withdrawl = 0;
    if(PIN==1234){
        System.out.println("Select any one option");
        System.out.println("Check Your Balance-->press 1");
         System.out.println("Deposit money -->press 2");
         System.out.println(" Withdrawl money -->press 3");
         System.out.print("press valid option :");
         int opt = sc.nextInt();
         if(opt == 1){
             System.out.println("Balance remaining is : " + balance);
         }
         else if(opt == 2){
             System.out.print("enter Amount :");
             int dep = sc.nextInt(); 
             balance = balance + dep;
             System.out.println("Balance is :" + balance);
         }
 else {
         System.out.print("enter Amount :");
         int with = sc.nextInt();
         balance = balance - with;
         System.out.println("Remaining balance is :" + (balance));
         }
    }
    else{ System.out.println("Incorrect PIN!!!");
}
}
}
