package javaStudy;

public class CalExam {
    public static void main(String[] args) {
        Calculator cal = new MyCar();
        cal.plus(2,3);
        int result = cal.exec(5, 6);
        System.out.println(result);

        Calculator.exec2(3,7);
    }
}
