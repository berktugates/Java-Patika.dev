import java.util.Scanner;

public class TaximeterProgram {
    public static void main(String[] args) {
       int km;
       double cost = 10;
       Scanner inputKm = new Scanner(System.in);
       System.out.print("How many kilometers will you travel? ");
       km = inputKm.nextInt();
       cost += km * 2.20;

       if(cost<=20){
           System.out.println("Fee payable: 20");
       }
       else if(cost>20){
           System.out.println("Fee payable: " + cost);
       }
       else{
           System.out.println("Incorrect mileage entered.");
       }
    }
}