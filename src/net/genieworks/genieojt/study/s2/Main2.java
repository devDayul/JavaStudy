package net.genieworks.genieojt.study.s2;

/**
 * Created by wody@genieworks.net on 2019/12/09.
 *
 * int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (1) 에 알맞은 코드를 넣으시오.
 */
public class Main2 {

    public static void main(String[] args) {

        int num = 123456;
        int sum = 0;

        String numStr = Integer.toString(num);

        for(int i =0; i < numStr.length(); i++ ) {
//            int numAt = Integer.parseInt(numStr.charAt(i) + "");
//            sum = sum + numAt;
            sum = sum + (num % 10);
            num = num / 10;
        }

        System.out.println(String.format("sum = %d", sum));
    }

}
