import java.util.Scanner;
public class ArraySort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose,n;
        System.out.print("How many elements does the array consist of: ");
        choose = input.nextInt();
        int [] array = new int[choose];
        for(int i = 0; i< choose; i++){
            System.out.print(i+1 + " enter element: ");
            n = input.nextInt();
            array[i] = n;
        }
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}