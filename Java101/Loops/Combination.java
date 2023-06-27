import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {

        int n,r,i,a,nf=1,rf=1,af=1,c;
        Scanner input = new Scanner(System.in);
        System.out.print("Küme kaç elemanlı olsun: ");
        n = input.nextInt();
        System.out.print("Kaç elemanlı farklı grupları olsun: ");
        r = input.nextInt();

        // n sayısının faktöriyelini bulmak için:
        for(i= n; i>0; i--){
            nf = nf * i;
        }

        // r sayısının faktöriyelini bulmak için:
        for(i=r; i>0; i--){
            rf = rf * i;
        }

        a = n-r;

        // a sayısının faktöriyelini bulmak için:
        for(i=a; i>0; i--){
            af = af * i;
        }

        c = nf / (rf * af);
        System.out.print(c);
    }
}