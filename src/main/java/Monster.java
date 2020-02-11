class Init {
    static {
        System.out.println("static { 클래스 초기화 블럭 }");
    }
    {
        System.out.println("{ 인스턴스 초기화 블럭 }");
    }
    public Init() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("인스턴스 초기화 Init init = new Init();");
        Init init = new Init();

        System.out.println("인스턴스 초기화 Init init2 = new Init();");
        Init init2 = new Init();
    }
}