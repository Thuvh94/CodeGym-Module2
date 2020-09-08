import java.util.Scanner; //The Scanner class is used to get user input, and it is found in the java.util package.
public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Width: ");
        width = scanner.nextFloat(); //nextFloat: Reads a float value from the user

        System.out.println("Enter Height: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
