import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        int secim,sonuc,n1,n2;
        System.out.println("Choose your action:\n" +
                "1) Addition\n2) Subtraction\n3) Multiplication\n4) Division");

        Scanner input = new Scanner(System.in);
        secim = input.nextInt();

        System.out.print("Enter the first number: ");
        n1 = input.nextInt();

        System.out.print("Enter the second number ");
        n2 = input.nextInt();

        switch (secim){
            case 1:
                sonuc = n1 + n2;
                System.out.print("The result of the addition operation: " + sonuc);
                break;
            case 2:
                sonuc = n1- n2;
                System.out.print("The result of the subtraction operation: " + sonuc);
                break;
            case 3:
                sonuc = n1 * n2;
                System.out.print("The result of the multiplication operation: " + sonuc);
                break;
            case 4:
                sonuc = n1 / n2;
                System.out.print("The result of the division operation: " + sonuc);
                break;
            default:
                System.out.print("Incorrect entry made!");
                break;
        }
    }
}