package javaStudy;

public class LedTv implements TV {
    @Override
    public void turnOn() {
        System.out.println("켜다");
    }

    @Override
    public void turnOff() {
        System.out.println("끄다");

    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("볼륨업");

    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("볼륨다운");

    }
}
