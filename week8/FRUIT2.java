class Fruit2 {
    String color;
    String taste;
    double price;

    Fruit2(String c, String taste, double price) {
        color = c;
        this.taste = taste;
        this.price = price;
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Fruit2 f1 = new  Fruit2("Red", "Sweet", 99);
        Fruit2 f2 = new  Fruit2("Yellow", "Sweet", 60);
        Fruit2 f3 = new  Fruit2("Green", "Sour", 50);

        f1.display();
        f2.display();
        f3.display();
    }
}

