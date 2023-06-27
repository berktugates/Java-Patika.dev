import java.util.Scanner;

public class NumberofDigits {
    public static void main(String[] args) {
        int i,h,t,o,sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        i = input.nextInt();
        h = i / 100;
        t = (i/ 10) % 10;
        o = i % 10;
        sum = h + t + o;

        System.out.println("Hundred digits: " + h);
        System.out.println("They digits: " + t);
        System.out.println("Ones digits: " + o);
        System.out.println("Sum: " + sum);

    }
}