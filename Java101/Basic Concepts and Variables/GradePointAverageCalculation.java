import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int math,physics, chemistry, turkish, history, music;

            Scanner mathGrade = new Scanner(System.in);
            System.out.print("Enter the math grade: ");
            math = mathGrade.nextInt();

            Scanner physicsGrade = new Scanner(System.in);
            System.out.print("Enter your physics grade: ");
            physics = physicsGrade.nextInt();

            Scanner chemistryGrade = new Scanner(System.in);
            System.out.print("Enter your chemistry grade: ");
            chemistry = chemistryGrade.nextInt();

            Scanner turkishGrade = new Scanner(System.in);
            System.out.print("Enter your turkish grade: ");
            turkish = turkishGrade.nextInt();

            Scanner historyGrade = new Scanner(System.in);
            System.out.print("Enter your history grade: ");
            history = historyGrade.nextInt();

            Scanner musicGrade = new Scanner(System.in);
            System.out.print("Enter your music grade: ");
            music = musicGrade.nextInt();
            int avg = (math+physics+chemistry+turkish+history+music)/6;
            System.out.println("Your course average: " + avg);

            String result = (avg>60) ? "Congratulations! You passed the lesson." : "Unfortunately! You failed the course.";
            System.out.println(result);
        }
    }
