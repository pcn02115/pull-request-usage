package practice.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;
        int count = 0;

        do {
            count++;
            System.out.println("1 ~ 100 사이 값 입력");
            try {
                input = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("유효하지 않은 값입니다. 다시 입력해주세요.");
                continue;
            }
                if (answer > input) {
                    System.out.println("더 큰 수를 입력");
                } else if (answer < input) {
                    System.out.println("더 작은 수를 입력");
                } else {
                    System.out.println("정답");
                    System.out.println("시도 횟수: " + count + "번");
                    break;
                }
        } while (true);
    }
}
