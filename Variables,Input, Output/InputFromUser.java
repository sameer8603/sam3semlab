import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // byte
        System.out.print("Enter byte value: ");
        byte b = sc.nextByte();

        // short
        System.out.print("Enter short value: ");
        short s = sc.nextShort();

        // int
        System.out.print("Enter int value: ");
        int i = sc.nextInt();

        // long
        System.out.print("Enter long value: ");
        long l = sc.nextLong();

        // float
        System.out.print("Enter float value: ");
        float f = sc.nextFloat();

        // double
        System.out.print("Enter double value: ");
        double d = sc.nextDouble();

        // boolean
        System.out.print("Enter boolean value (true/false): ");
        boolean bool = sc.nextBoolean();

        // char
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // String (single word)
        System.out.print("Enter a word: ");
        String word = sc.next();

        sc.nextLine(); // clear buffer

        // String (full line)
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("\n--- Output ---");
        System.out.println("byte = " + b);
        System.out.println("short = " + s);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
        System.out.println("boolean = " + bool);
        System.out.println("char = " + ch);
        System.out.println("word = " + word);
        System.out.println("sentence = " + sentence);

        sc.close();
    }
}