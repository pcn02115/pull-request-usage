package javaStudy2;

class StaticTest {
    //클래스 변수(static 변수)
    static int width = 200;
    static int height = 120;
    String color = "yellow";

    //클래스 초기화 블럭
    static {

    }

    //클래스 메서드(static 메서드)
    static int max(int a, int b) {
        StaticTest st = new StaticTest();
        System.out.println(st.color);
        return a > b ? a : b;
    }
}
