import java.util.Scanner;

public class Powersof2LessThanEntered {
    public static void main(String[] args) {
        int n,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();
        System.out.println("Girilen sayıya kadar olan 4'ün kuvvetleri:");
        for(i=1; i<=n; i*=4){
            System.out.println(i);
        }
        System.out.println("----------------------------");
        System.out.println("Girilen sayıya kadar olan 5'in kuvvetleri:");

        for(i=1; i<=n; i*=5){
            System.out.println(i);
        }

    }
}