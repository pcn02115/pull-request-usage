package practice;

public class InnerExam3 {
    public void exec() {
        class Cal {
            int val = 0;
            public void plus() {
                val++;
            }
        }
        Cal cal = new Cal();
        cal.plus();
        System.out.println(cal.val);
    }

    public static void main(String[] args) {
        InnerExam3 t = new InnerExam3();
        t.exec();
    }
}
