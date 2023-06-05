import java.util.Scanner;

public class isPalindrome {
    static boolean query(int number){
        int temp=number;
        int reverseNumber=0;
        int lastnumber;
        while(temp != 0){
            lastnumber = temp % 10;
            reverseNumber = (reverseNumber*10) + lastnumber;
            temp = temp /10;
        }
        if(number == reverseNumber){
            System.out.println(number + " is a palindrome number.");
            return true;
        }
        else{
            System.out.println(number + " is not a palindrome number.");
            return false;
        }
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        number = input.nextInt();
        query(number);
    }
}