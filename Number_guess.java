import java.util.Random;
import java.util.Scanner;
public class Number_guess{
    public static void main(String[] args){
        Random r= new Random();
        int guess=r.nextInt(100);
        int tries=0;
        Scanner sc= new Scanner(System.in);
        int g;
        boolean win= false;
        while(win== false){
            System.out.println("Guess number between 0 to 100");
            g=sc.nextInt();
            tries++;
            if(g==guess){
                win=true;

            }else if(g<guess){
                System.out.println("Your guess is too low.");

            }else if(g>guess){
                System.out.println("Your guess is too high.");
            }
        }
        System.out.println("You win..");
        System.out.println("The number was "+guess);
        System.out.println("It took you "+tries+" tries");
    }
    
}
