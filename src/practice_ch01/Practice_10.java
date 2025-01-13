package practice_ch01;

/**
 * 프로그램 실행 시 args로 여러 숫자를 입력받아 합계를 계산하세요.
 * 모든 숫자를 더한 결과를 출력합니다.
 */


public class Practice_10 {
    public static void main(String[] args) {
        int sum = 0;

        for(String input : args) {
            sum = Integer.parseInt(input);

        }

        System.out.println("합계 : " + sum);
    }
}
