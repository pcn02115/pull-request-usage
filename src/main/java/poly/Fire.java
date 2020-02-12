package poly;

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("ddd");
    }
    void stop() {
        System.out.println("sss");
    }
}
class FireEngine extends Car {
    void water() {
        System.out.println("water");
    }
}

public class Fire {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
//        car.water();

        fe2 = (FireEngine) car;
        fe2.water();
    }
}
