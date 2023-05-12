import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int n,c,f=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number whose factorial you want to get: ");
        n = input.nextInt();

        for(c=n;c>0;c--){
            f = f * c;
        }
        System.out.print("Answer: " + f);

    }
}