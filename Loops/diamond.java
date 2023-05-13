import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        int n,i,j;
        Scanner input = new Scanner(System.in);
        System.out.print("Elmas kaç adımdan oluşsun: ");
        n = input.nextInt();
        for(i=1;i<=n;i+=2){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i=1;i<=n;i+=2){
            for(j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}