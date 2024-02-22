import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable initializations
        int input, n1 = 0, n2 = 1, n3;

        //scanner initialization and user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of numbers you would like: ");
        input = scanner.nextInt();

        //print 0 and 1 each time
        System.out.print(n1 + " " + n2);

        //determine the rest of the Fibonacci number and print them
        for (int i = 2; i < input; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}