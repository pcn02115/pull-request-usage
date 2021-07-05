package javaStudy;

public interface TV {
    //final 키워드 없어도 상수 사용가능
    public int MIN_VOLUME = 0;
    public int MAX_VOLUME = 100;

    /*
    구현하기는 좀 애매... 있어야 할 것 같음 -> 추상메소드 abstract 필요
    interface는 어떤 걸 가지고 있을까? 나타내는 것 -> abstract 없어도 오키
     */
    public void turnOn();
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);
}
