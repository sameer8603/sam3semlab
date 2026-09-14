
public class Fruit {
    String color;
    String taste;
    double price;

    void setDetails() {
        color = "Unknown";
        taste = "Unknown";
        price = 0;
    }
        void setDetails(String c) {
        color = c;
        taste = "Unknown";
        price = 0;
    }
        void setDetails(String c, String t) {
        color = c;
        taste = t;
        price = 0;
    }

    void setDetails(String c, String t, double p) {
        color = c;
        taste = t;
        price = p;
    }
   
    void display() {
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit();
        Fruit f3 = new Fruit();
       // Default constructer
        f1.setDetails();
        f2.setDetails();
        f3.setDetails(); 
        System.out.println("For Default constructor: ");
        f1.display();
        f2.display();
        f3.display();
        // Constructor with two args:
        f1.setDetails("Red", "Sweet");
        f2.setDetails("Yellow", "Sweet");
        f3.setDetails("Green", "Sour");
          System.out.println("For 2 args constructor: ");
        f1.display();
        f2.display();
        f3.display();
        // Constructor with one arg:
        f1.setDetails("Red");
        f2.setDetails("Yellow");
        f3.setDetails("Green");
          System.out.println("For 1 args constructor: ");
        f1.display();
        f2.display();
        f3.display();
         // Constructor with all args:
        f1.setDetails("Red", "Sweet", 100);
        f2.setDetails("Yellow", "Sweet", 60);
        f3.setDetails("Green", "Sour", 50);
        /*  Fruit f1 = new Fruit();
        f1.color = "Red";
        f1.taste = "Sweet";
        f1.price = 100;

        Fruit f2 = new Fruit();
        f2.color = "Yellow";
        f2.taste = "Sweet";
        f2.price = 60;

        Fruit f3 = new Fruit();
        f3.color = "Green";
        f3.taste = "Sour";
        f3.price = 50;*/
  System.out.println("For 3 args constructor: ");
        f1.display();
        f2.display();
        f3.display();
    }
}

