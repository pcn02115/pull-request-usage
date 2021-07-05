package practice.Exception;

public class example {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main에서 예외처리");
        }
    }

    private static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1에서 예외처리");
            throw e;
        }
    }
}
