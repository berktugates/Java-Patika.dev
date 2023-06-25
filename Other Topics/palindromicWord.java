import java.util.Scanner;

import static java.lang.System.*;

public class palindromicWord {
    public static boolean isPalindrome(String word){
        int i = 0;
        int j = word.length() - 1;
        while(i < j){
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String word;
        Scanner input = new Scanner(in);
        System.out.print("Enter a word: ");
        word = input.next();

        System.out.println(isPalindrome(word));
    }
}