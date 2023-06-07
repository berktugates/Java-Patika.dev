import java.util.Scanner;
public class recursivePow {
    static int pow(int a, int b) {
        if(b==0) {
            return 1;
        }
        else {
            return a * pow(a,b-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean devamEt=true;

        while (devamEt) {
            System.out.print("Taban Değeri:");
            int a = input.nextInt();
            System.out.print("Üs:");
            int b = input.nextInt();
            System.out.println("Cevap: " + pow(a, b));

        }
    }
}