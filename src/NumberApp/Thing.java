package NumberApp;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Thing {
    public static void getInteger () {
        Scanner readInput = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter a number: ");
            try {
                int numberInput = readInput.nextInt();
                System.out.println("The input is an integer: " + numberInput);
                break;
            } catch (InputMismatchException e) {
                System.out.println("The input is not an integer. Please try again.");
                readInput.nextLine();
            }
        }
        readInput.close();
    }   
}
