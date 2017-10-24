import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;
        int a = 0, b = 1, c = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to print the fibonacci series upto it");
	    num = scan.nextInt();
	    while(a+b < num)
        {
            if(a == 0) {
                System.out.print("Fibonacci Series is: ");
                System.out.print(a + " " + b); /* To initially print the 0 and 1 */
            }
            c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }

    }
}
