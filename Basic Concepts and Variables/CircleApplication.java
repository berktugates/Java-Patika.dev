import java.util.Scanner;

public class CircleApplication {
    public static void main(String[] args) {
        double radius,angle,area,perimeter,pi=3.14,circleSliceArea;
        Scanner inputRadius = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        radius = inputRadius.nextDouble();
        area = pi * radius * radius;
        perimeter = 2 * pi * radius;
        System.out.println("Dairenin çevresi: " + perimeter);
        System.out.println("Dairenin alanı: " + area);

        Scanner inputAngle = new Scanner(System.in);
        System.out.print("Daire diliminin açısını giriniz: ");
        angle = inputAngle.nextDouble();
        circleSliceArea = (pi * (radius*radius) * angle)/360;
        System.out.println("Daire diliminin alanı: " + circleSliceArea);


    }
}