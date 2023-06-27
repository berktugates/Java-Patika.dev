import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        double height,weight,index;
        Scanner inputHeight = new Scanner(System.in);
        System.out.print("Enter your height: ");
        height = inputHeight.nextDouble();

        Scanner inputWeight = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        weight = inputWeight.nextDouble();

        index = weight / (height * height);
        System.out.print("Your body mass index: " + index);
    }
}