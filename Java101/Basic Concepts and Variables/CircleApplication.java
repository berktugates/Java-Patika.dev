import java.util.Scanner;

public class CircleApplication {
    public static void main(String[] args) {
        double radius,angle,area,perimeter,pi=3.14,circleSliceArea;
        Scanner inputRadius = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = inputRadius.nextDouble();
        area = pi * radius * radius;
        perimeter = 2 * pi * radius;
        System.out.println("Perimeter of circle " + perimeter);
        System.out.println("Area of circle " + area);

        Scanner inputAngle = new Scanner(System.in);
        System.out.print("Enter the angle of the circle segment: ");
        angle = inputAngle.nextDouble();
        circleSliceArea = (pi * (radius * radius) * angle) / 360;
        System.out.println("Area of the circle segment: " + circleSliceArea);


    }
}
