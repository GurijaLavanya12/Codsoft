import java.util.Scanner;
public class ATMInterface{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int balance=1000;
        while(true){
            System.out.println("ATM Menu: ");
            System.out.println("1.Check balance");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposit");
            System.out.println("4.Exit");
            System.out.println("Enter Your Choice : ");
            int choice=sc.nextInt();
            switch(choice){
                case 1 : System.out.println("Your balance is: "+balance);
                        break;
                case 2 : System.out.println("Enter amount to withdraw: ");
                        int amount = sc.nextInt();
                        if(amount<=balance){
                            balance-= amount;
                            System.out.println("Withdraw successfull.");
                            System.out.println("New balance : "+balance);

                        }else{
                            System.out.println("Insufficient balance.");
                        }
                        break;
                case 3 : System.out.println("Enter amount to deposit: ");
                        amount=sc.nextInt();
                        balance+=amount;
                        System.out.println("Deposit successfull.");
                        System.out.println("New balance : "+ balance);
                        break;
                case 4: System.out.println("Exit ATM.Visit again..!");
                        return;
                default: System.out.println("invalid choice.please try again.");
            }
      }
    }
}