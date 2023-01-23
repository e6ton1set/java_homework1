package homework1;

//Написать метод, который определяет, является ли год високосным, и возвращает boolean
// (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го,
// при этом каждый 400-й – високосный.
import java.util.Scanner;


public class main2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = keyboard.nextInt();
        getLeapYear(year);
    }

    public static void getLeapYear(int year){
        if ((year % 4 == 0 | year == 400) & (year != 100)){
            System.out.println("Високосный");
            }
        else System.out.println("Не високосный");
    }

}
