import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String username,password;
        Scanner input = new Scanner(System.in);
        int right=3,choose,money;
        double balance = 1498.76;

        while(right>0){
            System.out.print("Enter your nickname: ");
            username = input.nextLine();
            System.out.print("Enter your password: ");
            password = input.nextLine();

            if(username.equals("berktugates") && password.equals("1903")){
                System.out.println("Logging into your account...\n");
                do {
                    System.out.println("1-Deposit\n" +
                            "2-Withdrawal\n" +
                            "3-Question Balance\n" +
                            "4-Log Out");
                    System.out.print("Please select the operation you want to perform: ");
                    choose = input.nextInt();

                    switch (choose) {
                        case 1:
                            System.out.print("Enter the amount you want to deposit: ");
                            money = input.nextInt();
                            balance += money;
                            break;
                        case 2:
                            System.out.print("Enter the amount you want to withdraw: ");
                            money = input.nextInt();
                            if (money > balance) {
                                System.out.print("The amount you want to withdraw is greater than your balance.");
                            } else {
                                balance -= money;
                            }
                            break;
                        case 3:
                            System.out.print("Your balance: " + balance);
                            break;
                        case 4:
                            right = 0;
                            break;
                        default:
                            System.out.print("You have entered incorrectly! Please try again...");
                    }
                }while(choose!=4);
            }
            else{
                right--;
                if(right == 0){
                    System.out.print("Your account has been blocked. Please contact your bank!");
                }
                else{
                    System.out.println("Your username or password is incorrect!");
                    System.out.println("Your remaining right: " + right +"\n");
                }

            }
        }

    }
}