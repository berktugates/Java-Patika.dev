import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int n,i,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("How many steps should your Fibonacci series consist of:");
        n = input.nextInt();
        int s1=0;
        int s2=1;
        for(i=1;i<=n;i++){
            System.out.print(s1 + " ");
            sum = s1+s2;
            s1=s2;
            s2=sum;
        }
    }
}