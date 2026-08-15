import java.util.Scanner;

public class Main {

    // Function to find GCD
    public static int gcd(int x, int y) {
        int r;

        while (y != 0) {
            r = x % y;
            x = y;
            y = r;
        }

        return x;
    }

    // Function to find LCM
    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.println("GCD = " + gcd(x, y));
        System.out.println("LCM = " + lcm(x, y));
    }
}