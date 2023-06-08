import java.util.Scanner;

public class recursivePattern {
    static int pattern(int x, int tempX, boolean stop) {
        System.out.print(x + " ");
        if (x < 0 || x == 0 || !stop) {
            stop = false;
            if (x != tempX) {
                return pattern(x + 5, tempX, stop);
            } else
                return 0;
        } else {
            return pattern(x - 5, tempX, stop);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, tempX;
        System.out.print("Bir Sayı Giriniz: ");
        x = inp.nextInt();
        pattern(x, tempX = x, true);
    }
}