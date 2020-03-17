package javaStudy;

public class LedExam {
    public static void main(String[] args) {
        TV tv = new LedTv();
        tv.changeChannel(22);
        tv.changeVolume(10);
        tv.turnOff();
        tv.turnOn();
    }
}
