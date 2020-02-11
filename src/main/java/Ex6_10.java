class Point {
    Point() {
        // 매개 변수가 없는 생성자
    }
}
class Point2 {
    Point2(int a, int b) {
        // 매개 변수가 있는 생성자
    }
}
class Data_1 {
    int value; //생성자가 하나도 없음 -> 컴파일러가 기본 생성자 추가
}
class Data_2 {
    int value;

    Data_2(int x) { // 생성자 정의됨
        value = x; //매개변수가 있는 생성자
    }
}
class Ex6_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2(10); //
    }
}

class Car {
    String color;
    String gearType;
    int door;

    Car() {} //기본 생성자
    Car(String c, String g, int d) { //생성자
        color = c;
        gearType = g;
        door = d;
    }
}
class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {
        this("white", "auto", 4);
    }

    Car2(String color) {
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
class Ex6_13 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");
        System.out.println("c1: " + c1.color + c1.gearType + c1.door);
        System.out.println("c2: " + c2.color + c2.gearType + c2.door);
    }
}