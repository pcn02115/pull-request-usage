package practice;

class Number {
    int num1, num2;
    Number(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}

class Add {
    Number number;

    Add(int num1, int num2) {
        number = new Number(num1, num2);
    }

    int getResult() {
        return number.num1 + number.num2;
    }
}

class Subtract {
    Number number;

    Subtract(int num1, int num2) {
        number = new Number(num1, num2);
    }

    int getResult() {
        return number.num1 - number.num2;
    }

}
public class TestClass {
    public static void main(String[] args) {
        int num1 = 8,
            num2 = 7;
        Add adder = new Add(num1, num2);
        Subtract subtracter = new Subtract(num1, num2);
        System.out.println("num1: " + num1 + ", num2: " + num2);
        System.out.println(adder.getResult());
        System.out.println(subtracter.getResult());


    }
}
