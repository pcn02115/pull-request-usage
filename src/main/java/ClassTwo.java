class MyMath2 {
    long a, b;

    long add() { return a + b; }
    long subtract() { return a - b; }
    long multiply() { return a * b; }
    long devide() { return a / b; }

    static long add (long a, long b) { return a + b; }
    static long subtract (long a , long b) { return a - b; }
    static long multiply (long a , long b) { return a * b; }
    static long devide (long a , long b) { return a / b; }
}

class Ex6_9 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200L, 100L));
        MyMath2 myMath2 = new MyMath2();
        myMath2.a = 200L;
        myMath2.b = 100L;

        System.out.println(myMath2.add());
    }
}

class TestClass {
    void instanceMethod() {} //인스턴스 메서드
    static void staticMethod() {} //static 메서드

    void instanceMethod2() { //인스턴스 메서드
        instanceMethod();
        staticMethod();
    }
    static void staticMethod2() { //static 메서드
//        instanceMethod(); 호출 불가
        staticMethod();
    }
}

class TestClass2 {
    int iv;
    static int cv;

    void instanceMethod() {
        System.out.println(iv);
        System.out.println(cv);
    }
    static void staticMethod() {
//        System.out.println(iv);
        System.out.println(cv);
    }
}

