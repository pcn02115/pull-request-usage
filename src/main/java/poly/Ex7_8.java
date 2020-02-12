package poly;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}
class Tv extends Product {
    Tv() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}
class Computer extends Product {
    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {

        if (money < p.price) {
            System.out.println("잔액 부족으로 구매 불가");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구매하셨습니다.");
    }
}

public class Ex7_8 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("현재 잔액: " + b.money);
        System.out.println("현재 포인트: " + b.bonusPoint);
    }
}
