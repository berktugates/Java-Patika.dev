import java.util.Scanner;

public class GroceryProgram {
    public static void main(String[] args) {
        double pear=2.14,apple=3.67,tomato=1.11,banana=0.95,aubergine=5.0,cost;
        double pearKg,appleKg,tomatoKg,bananaKg,aubergineKg;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kg giriniz: ");
        pearKg = input.nextDouble();

        System.out.print("Elma kg giriniz: ");
        appleKg = input.nextDouble();

        System.out.print("Domates kg giriniz: ");
        tomatoKg = input.nextDouble();

        System.out.print("Muz kg giriniz: ");
        bananaKg = input.nextDouble();

        System.out.print("Patlıcan kg giriniz: ");
        aubergineKg = input.nextDouble();

        cost = (pear * pearKg) + (apple* appleKg) + (tomato * tomatoKg) + (banana * bananaKg) + (aubergine * aubergineKg);
        System.out.print("Ödemeniz gereken toplam tutar: " + cost);
    }
}