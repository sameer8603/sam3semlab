class Vehicle {
    void cost() {
        System.out.println("Cost of vehicle is calculated.");
    }
}
class Bus extends Vehicle {
    void display() {
        System.out.println("This is a Bus.");
    }
}

class Train extends Vehicle {
    void display() {
        System.out.println("This is a Train.");
    }
}
public class Vehicle {
    public static void main(String[] args) {
        Bus b = new Bus();
        Train t = new Train();

        b.cost();
        b.display();

        t.cost();
        t.display();
    }
}

