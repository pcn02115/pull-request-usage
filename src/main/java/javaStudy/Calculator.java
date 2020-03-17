package javaStudy;

public interface Calculator {

    //기존: 추상클래스만 가짐 -> 선언만!
    public int plus(int i, int j);
    public int multiple(int i, int j);

    //default 키워드로 메소드 구현 가능
    default int exec(int i, int j) {
        return i + j;
    }
    public static int exec2(int i, int j) {
        return i * j;
    }
}
