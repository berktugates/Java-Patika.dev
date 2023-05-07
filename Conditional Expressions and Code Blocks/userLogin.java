import java.util.Scanner;

public class userLogin {
    public static void main(String[] args) {
        String username,password,newPassword,choose;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        username = input.nextLine();
        System.out.print("Parolanızı giriniz: ");
        password = input.nextLine();

        if(username.equals("berktugates") && password.equals("1903")){
            System.out.print("Hesabınıza giriş yapılıyor lütfen bekleyiniz...");
        }
        else {
            System.out.println("Kullanıcı adınız veya parolanız yanlış.");
            System.out.print("Parolanızı yeniden oluşturmak ister misiniz? [Y/N]: ");
            choose = input.nextLine();
            switch (choose){
                case "Y" :
                    System.out.print("Yeni parolanızı giriniz: ");
                    newPassword = input.nextLine();
                    if (newPassword.equals(password)){
                        System.out.print("Parolanız önceki parolanız ile aynı olamaz. Yeniden oluşturunuz.");
                    }
                    else {
                        System.out.print("Parolanız değiştirilmiştir.");
                    }
                case "N":
                    System.out.print("Hesabınıza tekrar giriş yapmayı deneyiniz.");
            }

        }
    }
}