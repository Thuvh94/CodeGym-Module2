import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your money in dollar");
        long dollar = scanner.nextInt();
        long vnd = dollar * rate;
        System.out.printf("%d dollar is %,d vnd",dollar,vnd);
    }
}
