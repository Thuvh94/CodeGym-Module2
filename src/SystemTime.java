//Public = This method is visible to all other classes.
//
//static = This method doesn't need an instance to be ran.
//
//void = This method doesn't return anything.
//
//main() = Main method (First method to run).
//
//String[] = Array of strings.
//
//args = Array name.
import java.util.Date;
public class SystemTime {
    public static void main(String[] args) {
        Date now = new Date();

        System.out.println("Now is: "+now);
    }
}
