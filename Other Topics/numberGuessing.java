import java.util.Scanner;
import java.util.Random;
public class numberGuessing {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int n = rand.nextInt(100);
        int right = 5;
        int choose;
        System.out.println("WELCOME TO THE NUMBER PREDICTION GAME! YOU HAVE 5 RIGHTS TO PREDICT THE NUMBER BETWEEN 1-100.");

        while(right > 0){
            do {
                System.out.print("Enter a number [1-100] : ");
                choose = input.nextInt();
            }while (choose < 0 && choose > 100);

            if(choose < 0 || choose > 100){
                System.out.println("The number you have chosen is not between 0-100. Try again!");
                right = 5;

            }
            if(n == choose){
                System.out.print("Congratulations, you got the number right!");
                break;
            }
            else{
                if(choose > 0 && choose < 100){
                    if(n > choose){
                        System.out.println("The number you are looking for is larger.");
                    }
                    else {
                        System.out.println("The number you are looking for is smaller.");
                    }
                }
            }
            right--;
            System.out.println("Your Rigths: " + right);
            if(right == 0){
                System.out.println("You lost the game!");
                System.out.print("Selected number: " + n);
            }
        }
    }
}