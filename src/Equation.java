import java.util.Scanner; //sử dụng thư viện Scanner trong gói java.util
public class Equation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner sc = new Scanner(System.in);

        System.out.println("a: ");
        double a = sc.nextDouble();

        System.out.println("b: ");
        double b = sc.nextDouble();

        System.out.println("c: ");
        double c = sc.nextDouble();

        if(a != 0){
            double result = (c - b) / a;
            System.out.println("Result is " + result);
        }
        else {
            if(b==0)
                System.out.println("The result is all x");
            else
                System.out.println("No result");
        }
    }
}
