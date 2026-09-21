class Fruit {
    String color;
    String taste;
    double price;

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
        System.out.println();
    }
    public static void main(String[] args) {

        Fruit f1 = new  Fruit();
        f1.color = "Red";
        f1.taste = "Sweet";
        f1.price = 99;

        Fruit f2 = new  Fruit();
        f2.color = "Yellow";
        f2.taste = "Sweet";
        f2.price = 60;

        Fruit f3 = new  Fruit();
        f3.color = "Green";
        f3.taste = "Sour";
        f3.price = 50;

        f1.display();
        f2.display();
        f3.display();
    }
}

