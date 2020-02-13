package abstractC;

public class DuckExam {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.sing();
        duck.fly();

        //Bird는 추상 클래스 -> 객체 생성 불가
//        Bird bird = new Bird();
    }
}
