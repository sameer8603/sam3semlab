
class Constructor_Chaning {
    String color;
    String taste;
    double price;

    // Default constructor
   Constructor_Chaning () {
        this("Unknown", "Unknown", 0);
    }

    // One-argument constructor
    Constructor_Chaning(String c) {
        this(c, "Unknown", 0);
    }

    // Two-argument constructor
   Constructor_Chaning(String c, String t) {
        this(c, t, 0);
    }

    // Three-argument constructor
    Constructor_Chaning(String c, String t, double p) {
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
        Constructor_Chaning f1 = new Constructor_Chaning();
        Constructor_Chaning f2 = new Constructor_Chaning("Red");
        Constructor_Chaning f3 = new Constructor_Chaning("Yellow", "Sweet");
        Constructor_Chaning f4 = new Constructor_Chaning("Green", "Sour", 50);

        f1.display();
        f2.display();
        f3.display();
        f4.display();
    }
}

