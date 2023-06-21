import java.util.Scanner;
import java.util.Arrays;
public class MaxMinArray {
    public static void main(String[] args) {
        int choose;
        Scanner input = new Scanner(System.in);
        int[] array = {15,12,788,1,-1,-778,2,0};
        System.out.print(Arrays.toString(array));
        System.out.println(" ");
        System.out.print("Enter a number: ");
        choose = input.nextInt();
        int min = choose;
        int max = choose;
        Arrays.sort(array);

        for(int i = 0; i < array.length; i++){
            if(array[i] > choose){
                min = array[i];
                break;
            }
        }

        for(int i = 0; i< array.length; i++){
            if(array[i] < choose){
                max = array[i];
            }
        }

        System.out.println("Seçilen sayıdan büyük en küçük sayı: " + min);
        System.out.println("Seçilen sayıdan küçük en büyük sayı: " + max);

    }
}