import java.util.Scanner;
public class flightTicket {
    public static void main(String[] args) {
            double km,age,price,discounted_price,special_discount;
            int choose;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your distance: ");
            km = input.nextDouble();

            System.out.print("Enter your age: ");
            age = input.nextDouble();

            System.out.print("Select the type of trip [One Way = 1 | Round Trip = 2]: ");
            choose = input.nextInt();

            if(age < 0 || km < 0){
                    System.out.print("You have entered incorrectly!");
                    System.exit(0);
            }

            switch (choose){
                    case 1:
                            if(age<12){
                                    price = km * 0.10;
                                    discounted_price = price - (price * 0.5);
                                    System.out.println("The fee you will pay: " + discounted_price);
                            }
                            else if(age >12 && age < 24){
                                    price = km * 0.10;
                                    discounted_price = price - (price * 0.1);
                                    System.out.println("The fee you will pay: " + discounted_price);
                            }
                            else if(age > 24 && age < 65){
                                    price = km * 0.10;
                                    System.out.println("The fee you will pay: " + price);
                            }
                            else if(age > 65){
                                    price = km * 0.10;
                                    discounted_price = price - (price * 0.3);
                                    System.out.println("The fee you will pay: " + discounted_price);
                            }
                            break;
                    case 2:
                            if(age < 12){
                                    price = km * 0.10;
                                    discounted_price = price - (price * 0.5);
                                    special_discount = discounted_price - (discounted_price * 0.2);
                                    special_discount = special_discount * 2;
                                    System.out.println("The fee you will pay: " + special_discount);
                            }
                            else if(age >12 && age < 24){
                                    price = km * 0.10;
                                    discounted_price = price - (price * 0.1);
                                    special_discount = discounted_price - (discounted_price * 0.2);
                                    special_discount = special_discount * 2;
                                    System.out.println("The fee you will pay: " + special_discount);
                            }
                            else if(age > 24 && age < 65){
                                    price = km * 0.10;
                                    special_discount = price - (price * 0.2);
                                    special_discount = special_discount * 2;
                                    System.out.println("The fee you will pay: " + special_discount);
                            }
                            else if(age > 65){
                                    price = km * 0.10;
                                    discounted_price = price - (price * 0.3);
                                    special_discount = discounted_price - (discounted_price * 0.2);
                                    special_discount = special_discount * 2;
                                    System.out.println("The fee you will pay: " + special_discount);
                            }
                            break;

                    default:
                            System.out.print("You have entered incorrectly!");

            }


    }
}