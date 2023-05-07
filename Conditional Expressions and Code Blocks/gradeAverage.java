import java.util.Scanner;

public class gradeAverage {
    public static void main(String[] args) {
        double math,physics,turkish,chemistry,music,avg;
        Scanner grade = new Scanner(System.in);

        System.out.print("Enter your math grade: ");
        math = grade.nextDouble();
        if(math < 0 || math > 100){
            math = 0;
        }
        System.out.print("Enter your physics grade: ");
        physics = grade.nextDouble();
        if(physics < 0 || physics > 100){
            physics = 0;
        }
        System.out.print("Enter your turkish grade: ");
        turkish = grade.nextDouble();
        if(turkish < 0 || turkish > 100){
            turkish = 0;
        }
        System.out.print("Enter your chemistry grade: ");
        chemistry = grade.nextDouble();
        if(chemistry < 0 || chemistry > 100){
            chemistry = 0;
        }
        System.out.print("Enter your music grade: ");
        music = grade.nextDouble();
        if(music < 0 || music > 100){
            music = 0;
        }

        avg = (math + physics + turkish + chemistry + music) / 6;
        System.out.println("Your GPA: " + avg);

        if(avg > 55){
            System.out.print("Congratulations! You passed the class.");
        }
        else{
            System.out.print("Unfortunately, you failed the class.");
        }

    }
}