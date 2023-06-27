import java.util.Scanner;

public class FindEvenNumbersUpToTheEnteredNumber {
    public static void main(String[] args) {
        int choose,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        choose = input.nextInt();

        for (i=0; i<=choose; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}