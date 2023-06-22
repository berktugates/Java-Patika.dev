import java.util.Scanner;
import java.util.Arrays;
public class userArraySort {
    public static void main(String[] args) {
        int choose;
        Scanner input = new Scanner(System.in);
        System.out.print("How many elements should your array have: ");
        choose = input.nextInt();
        int[] array = new int[choose];

        for(int i = 0; i < array.length; i++){
            int n;
            System.out.print(i+1 + ". enter the element: ");
            n = input.nextInt();
            array[i] = n;
        }
        Arrays.sort(array);

        System.out.print("Sort: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}