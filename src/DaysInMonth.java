import java.util.Scanner;
import java.util.Formatter;
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month do you want to count days?");
        int month = scanner.nextInt();
        String result;
        switch (month){
            case 2:
                result = "28 or 29 days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "31 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = "30 days";
                break;
            default:
                result = "";
        }
        if (result!="")
            System.out.printf("Month %d has %s ",month,result);
        else
            System.out.println("Invalid input!");
    }

}
