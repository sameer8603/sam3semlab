class FRUIT1 {
    String color;
    String taste;
    double price;

    void setDetails(String color, String taste, double price) {
        this.color = color;
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

        FRUIT1 f1 = new FRUIT1();
        FRUIT1 f2 = new FRUIT1();
        FRUIT1 f3 = new FRUIT1();

        f1.setDetails("Red", "Sweet", 100);
        f2.setDetails("Yellow", "Sweet", 60);
        f3.setDetails("Green", "Sour", 50);

        f1.display();
        f2.display();
        f3.display();
    }
}

