package practice_ch01;

/**
 *프로그램 실행 시 args로 숫자를 입력받아 해당 숫자가 홀수인지 짝수인지 판별하세요.
 * 여러 숫자를 한꺼번에 입력받아 각각 판별 결과를 출력합니다.
 *
 */


public class Practice_09 {
    public static void main(String[] args) {
        for(String num : args) {
            if(Integer.parseInt(num) % 2 == 0)
                System.out.println(num + "은(는) 짝수입니다.");
            else
                System.out.println(num + "은(는) 홀수입니다.");
        }

    }
}
