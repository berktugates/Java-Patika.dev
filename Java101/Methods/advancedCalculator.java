import java.util.Scanner;

public class advancedCalculator {
    static void sum(){
        int result=0,j,n;
        Scanner count = new Scanner(System.in);
        Scanner r = new Scanner(System.in);
        System.out.print("Kaç tane sayıyı toplamak istiyorsunuz: ");
        j = count.nextInt();

        for(int i=0;i<j;i++){
            System.out.print("Sayıyı giriniz: ");
            n = r.nextInt();
            result += n;
        }
        System.out.print("Cevap: " + result);
    }

    static void minus(){
        int result=0,j,n;
        Scanner count = new Scanner(System.in);
        Scanner r = new Scanner(System.in);
        System.out.print("Kaç tane sayıyı çıkarmak istiyorsunuz: ");
        j = count.nextInt();
        for(int i=0; i<j; i++){
            System.out.print("Sayıyı giriniz: ");
            n = r.nextInt();
            result-=n;
        }
        System.out.print("Cevap: " + result);
    }

    static void times(){
        int result=1,j,n;
        Scanner count = new Scanner(System.in);
        Scanner r = new Scanner(System.in);
        System.out.print("Kaç tane sayıyı çarpmak istiyorsunuz: ");
        j = count.nextInt();
        for(int i=0;i<j;i++){
            System.out.print("Sayıyı giriniz: ");
            n = r.nextInt();
            result*=n;
        }
        System.out.print("Cevap: "+result);
    }

    static void divided(){
        float a,b,result;
        Scanner ad = new Scanner(System.in);
        Scanner bd = new Scanner(System.in);
        System.out.print("Bölünecek sayıyı giriniz: ");
        a = ad.nextFloat();
        System.out.print("Bölecek sayıyı giriniz: ");
        b = bd.nextFloat();
        result = a/b;
        System.out.print("Cevap: " + result);
    }

    static void power(){
        int a,b,result=1;
        Scanner ap = new Scanner(System.in);
        Scanner bp = new Scanner(System.in);
        System.out.print("Üssünü almak istediğiniz sayıyı giriniz: ");
        a = ap.nextInt();
        System.out.print("Üs derecesini giriniz: ");
        b = bp.nextInt();
        for(int i=0;i<b;i++){
            result*=a;
        }
        System.out.print("Cevap: " +result);
    }

    static void factorial(){
        int result=1,a;
        Scanner b = new Scanner(System.in);
        System.out.print("Hangi sayının faktöriyelini almak istiyorsunuz: ");
        a = b.nextInt();
        for(int i=a;i>=1;i--){
            result*=i;
        }
        System.out.print("Cevap: " + result);
    }

    static void mod(){
        float result,a,b;
        Scanner c = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        System.out.print("Modunu almak istediğiniz sayıyı giriniz: ");
        a = c.nextFloat();
        System.out.print("Hangi sayıya göre modunu almak istiyorsunuz: ");
        b = d.nextFloat();
        result= a % b;
        System.out.print("Cevap: " + result);
    }

    static void rectangle(){
        int shorte,longe,area,env;
        Scanner c = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        System.out.print("Uzun kenarı giriniz: ");
        longe = c.nextInt();
        System.out.print("Kısa kenarı giriniz: ");
        shorte = d.nextInt();
        area = longe * shorte;
        env = 2 * (shorte + longe);
        System.out.println("Dikdörtgenin alanı: " + area);
        System.out.println("Dikdörtgenin çevresi: " + env);
    }
    public static void main(String[] args) {
        int select;
        Scanner input = new Scanner(System.in);
        do {
            String menu = "1- Toplama İşlemi\n"
                    +"2- Çıkarma İşlemi\n"
                    +"3- Çarpma İşlemi\n"
                    +"4- Bölme işlemi\n"
                    +"5- Üslü Sayı Hesaplama\n"
                    +"6- Faktoriyel Hesaplama\n"
                    +"7- Mod Alma\n"
                    +"8- Dikdörtgen Alan ve Çevre Hesabı\n"
                    +"0- Çıkış";

            System.out.println(menu);
            System.out.print("Hangi işlemi yapmak istiyorsunuz: ");
            select = input.nextInt();

            switch(select){
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız!");
            }

        }while(select!=0);
    }
}