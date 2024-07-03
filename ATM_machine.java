//package mini_project.ATM_Mc;
import java.util.*;

class ATM {
    float Balance;
    int PIN = 9999;

    public void Checkpin() {
        System.out.println("**********************************  Enter your PIN  **********************************************");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();

        if (enteredpin == PIN) {
            System.out.println("  =========================     Welcome to ATM      ==========================================");
            menu();
        } else {
            System.out.println("  =========================    Enter a valid PIN    =============================================");
            Checkpin();
        }
    }

    public  void menu() {
         System.out.println("Enter youe choice:");
         System.out.println("1. Check Your Balance");
         System.out.println("2. Deposit Money");
         System.out.println("3. Withdraw Money");
         System.out.println("Exit");

         Scanner sc = new Scanner(System.in);
         int choice = sc.nextInt();

         if (choice == 1) {
             checkBalance();
             menu();
         }
         else if (choice == 2) {
             depositMoney();
             menu();
         }
         else if (choice == 3) {
             withDrawMoney();
             menu();
         }
         else if(choice ==4){
             return;
          }
         else{
               System.out.println("Entr a Valid Choice");
           }
    }

    public void checkBalance()
    {
        System.out.println("Balance: " + Balance);
    }

    public void depositMoney()
    {
        System.out.println("Enter the amount you want to Deposit: ");
        Scanner sc = new Scanner(System.in);
        Float amount = sc.nextFloat();
        Balance = Balance + amount;
         System.out.println("Money successfully Deposited");
    }

    public void withDrawMoney() {
        System.out.println("Enter the amount to be Withdrawn :");
        Scanner sc = new Scanner(System.in);
        float nikalna = sc.nextFloat();
        if (nikalna > Balance)
        {
            System.out.println("Insufficient Funds");
        }
        else {
            Balance = Balance - nikalna;
            System.out.println("Money successfully Withdrawn");
        }
        
}
}

public class ATM_machine {
   public static void main(String[] args)
   {
       ATM obj = new ATM();
        obj.Checkpin();
   }
}

