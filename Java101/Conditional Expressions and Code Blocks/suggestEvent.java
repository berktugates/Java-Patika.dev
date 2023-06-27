import java.util.Scanner;

public class suggestEvent {
    public static void main(String[] args) {
        double degree;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava kaç derece: ");
        degree = input.nextDouble();

        if(degree < 5){
            System.out.print("Kayak yapabilirsiniz.");
        }
        else if(degree > 5 && degree < 15) {
            System.out.print("Sinemaya gidebilirsiniz.");
        }
        else if(degree > 15 && degree < 25){
            System.out.print("Pikniğe gidebilirsiniz.");
        }
        else if(degree > 25){
            System.out.print("Yüzmeye gidebilirsiniz.");
        }
        else{
            System.out.print("Hatalı derece girişi yapılmıştır.");
        }
    }
}