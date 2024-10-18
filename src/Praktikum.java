import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Какой год интересует?( 0 - exit)");
            int year = 0;
            try {
                year = scanner.nextInt();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            if (year == 0){
                scanner.close();
                System.exit(0);
            } 
                if (isLeapYear(year)) {
                     System.out.println("13.09." + year);
                }else System.out.println("12.09." + year);
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 & (year % 100 != 0 || year % 400 == 0);
    }
}