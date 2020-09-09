import java.util.Scanner;
import java.util.Formatter;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which year do you want to check?");
        int year = scanner.nextInt();
        boolean result;
        if (year % 4 != 0)
            result = false;
        else {
            if (year % 100 != 0)
                result = true;
            else{
                if (year % 400 == 0)
                    result = true;
                else
                    result = false;
            }
        }
        if (result)
            System.out.printf("%d is a leap year",year);
        else
            System.out.printf("%d is not a leap year",year);
    }
}
