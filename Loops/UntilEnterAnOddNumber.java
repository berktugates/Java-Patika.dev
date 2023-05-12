import java.util.Scanner;

public class UntilEnterAnOddNumber {
    public static void main(String[] args) {
        int i,counter=0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            i = input.nextInt();

            if (i % 4 == 0){
                counter += i;
            }

        } while (i % 2 == 0);
        System.out.println("Sonuc: " + counter);
    }
}