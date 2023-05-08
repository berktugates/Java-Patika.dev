import java.util.Scanner;

public class horoscopeFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choose;
        System.out.print("1 : 21 March - 20 April\n");
        System.out.print("2 : 21 April - 21 May\n");
        System.out.print("3 : 22 May - 22 June\n");
        System.out.print("4 : 23 June - 22 July\n");
        System.out.print("5 : 23 July - 22 August\n");
        System.out.print("6 : 23 August - 22 September\n");
        System.out.print("7 : 23 September - 22 October\n");
        System.out.print("8 : 23 October - 22 November\n");
        System.out.print("9 : 23 November - 21 December\n");
        System.out.print("10 : 22 December - 21 January\n");
        System.out.print("11 : 22 January - 19 February\n");
        System.out.print("12 : 20 February - 20 March\n");
        System.out.print("Please select the day you were born:");
        choose=input.nextInt();
        if (choose==1)
            System.out.print(" Your horoscope is Aries");
        else if (choose==2)
            System.out.print(" Your horoscope is Taurus");
        else if (choose==3)
            System.out.print(" Your horoscope is Gemini");
        else if (choose==4)
            System.out.print(" Your horoscope is Cancer");
        else if (choose==5)
            System.out.print(" Your horoscope is Leo");
        else if (choose==6)
            System.out.print(" Your horoscope is Virgo");
        else if (choose==7)
            System.out.print(" Your horoscope is Libra");
        else if (choose==8)
            System.out.print(" Your horoscope is Scorpio");
        else if (choose==9)
            System.out.print(" Your horoscope is Sagittarius");
        else if (choose==10)
            System.out.print(" Your horoscope is Capricorn");
        else if (choose==11)
            System.out.print(" Your horoscope is Aquarius");
        else if (choose==12)
            System.out.print(" Your horoscope is Pisces");

    }}