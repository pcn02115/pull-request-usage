package practice;

public class InnerExam2 {
    static class Cal {
        int val = 0;
        public void plus() {
            val++;
        }
    }

    public static void main(String[] args) {
        InnerExam2.Cal cal = new InnerExam2.Cal();
        cal.plus();
        System.out.println(cal.val);
    }
}
