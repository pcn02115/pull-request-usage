package practice.Exception;

public class BizExam {
    public static void main(String[] args) {
        BizService biz = new BizService();
        biz.bizMethod(5);
        try {
            biz.bizMethod(-2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
