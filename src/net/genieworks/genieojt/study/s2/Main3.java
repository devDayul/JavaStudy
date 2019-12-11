package net.genieworks.genieojt.study.s2;

/**
 * Created by wody@genieworks.net on 2019/12/09.
 *
 * 다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽 어도 앞으로 읽는 것과 같은 수를 말한다.
 * 예를 들면 ‘12321’이나 ‘13531’같은 수를 말한 다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
 */
public class Main3 {

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);

        System.out.print("값을 입력하세요 : ");
        final int number = s.nextInt();

        int tmp = number;
        int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수

        while (tmp != 0) {
            result = (result * 10) + (tmp % 10);
            tmp = tmp / 10;
        }

        if (number == result) {
            System.out.println(String.format("%d는 회문수입니다.", number));
        } else {
            System.out.println(String.format("%d는 회문수가 아닙니다.", number));
        }
    }

}
