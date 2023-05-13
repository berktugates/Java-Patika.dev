import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i;
        double sum = 0;
        System.out.print("Which number do you want to find the harmonic series of: ");
        n = input.nextInt();

        for (i=1;i<=n;i++){
            sum = sum + 1.0/i;
        }

        System.out.println("Sum: " + sum);
    }
}