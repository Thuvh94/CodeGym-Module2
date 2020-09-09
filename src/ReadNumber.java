import java.util.Scanner;
public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number you want to read");
        int num = scanner.nextInt();
        String word;
        if (num > 999)
            word = "out of ability";
        else if(0 <= num && num <=10){
            switch (num){
                case 0:
                    word = "zero";
                    break;
                case 1:
                    word = "one";
                    break;
                case 2:
                    word = "two";
                    break;
                case 3:
                    word = "three";
                    break;
                case 4:
                    word = "four";
                    break;
                case 5:
                    word = "five";
                    break;
                case 6:
                    word = "six";
                    break;
                case 7:
                    word = "seven";
                    break;
                case 8:
                    word = "eight";
                    break;
                case 9:
                    word = "nine";
                    break;
                case 10:
                    word = "ten";
                    break;
            }
        }
    }
}
