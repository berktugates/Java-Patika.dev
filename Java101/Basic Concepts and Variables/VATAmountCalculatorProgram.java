import java.util.Scanner;

public class VATAmountCalculatorProgram {
    public static void main(String[] args) {
            int user;
            Scanner userAmount = new Scanner(System.in);
            System.out.print("Enter the amount of money: ");
            user = userAmount.nextInt();
            if(user>=0 && user<1000){
                System.out.println("Price without VAT : " + user);
                int VAT = (user * 18)/100;
                int newcost = user += VAT;
                System.out.println("Price with VAT: " + newcost);
                System.out.println("VAT: " + VAT);
            }
            else if (user >1000){
                System.out.println("Price without VAT : " + user);
                int VAT = (user * 8)/100;
                int newcost = user + VAT;
                System.out.println("Price with VAT: " + newcost);
                System.out.println("VAT: " + VAT);
            }
        }
    }
