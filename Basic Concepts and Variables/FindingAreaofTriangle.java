import java.util.Scanner;
public class FindingAreaofTriangle {
    public static void main(String[] args) {
        int edge1,edge2,edge3;
        Scanner edge1Value = new Scanner(System.in);
        System.out.print("Enter the edge 1 value: ");
        edge1 = edge1Value.nextInt();

        Scanner edge2Value = new Scanner(System.in);
        System.out.print("Enter the edge 2 value: ");
        edge2 = edge2Value.nextInt();

        Scanner edge3Value = new Scanner(System.in);
        System.out.print("Enter the edge 3 value: ");
        edge3 = edge3Value.nextInt();

        int u = (edge1 + edge2 + edge3) / 2;
        int perimeter = 2 * u;
        int a = u * (u-edge1) * (u-edge2) * (u-edge3);
        double area = Math.sqrt(a);

        System.out.println("Perimeter of the triangle: " + perimeter);
        System.out.print("Area of triangle: " + area);
    }
}