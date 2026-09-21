class Fruit3 {
    String color;
    String taste;
    double price;

    // Default constructor
      Fruit3 () {
        color = "Unknown";
        taste = "Unknown";
        price = 0;
    }

    // One-argument constructor
      Fruit3 (String color) {
        this.color = color;
        taste = "Unknown";
        price = 0;
    }

    // Two-argument constructor
    Fruit3(String color, String taste) {
        this.color = color;
        this.taste = taste;
        price = 0;
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
        System.out.println();
    }
    public static void main(String[] args) {

        Fruit3 f1 = new Fruit3();
        Fruit3 f2 = new Fruit3("Red");
        Fruit3 f3 = new Fruit3("Yellow", "Sweet");

        f1.display();
        f2.display();
        f3.display();
    }

}