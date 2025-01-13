package practice_ch01;

/**
 * 프로그램 실행 시 args로 두 숫자와 연산자(+, -, *, /)를 입력받아 결과를 출력하는 프로그램을 작성하세요.
 * 예를 들어, java Main 10 5 +로 실행하면 10 + 5 = 15가 출력됩니다.
 *
 */

public class Practice_08 {
    public static void main(String[] args) {
        int inputNum1 = Integer.parseInt(args[0]);
        int inputNum2 = Integer.parseInt(args[1]);
        String op = args[2];

        switch(op) {
            case "+":
                System.out.printf("%d + %d = %d\n", inputNum1, inputNum2, inputNum1 + inputNum2);
                break;
            case "-":
                System.out.printf("%d + %d = %d\n", inputNum1, inputNum2, inputNum1 - inputNum2);
                break;
            case "*":
                System.out.printf("%d * %d = %d\n", inputNum1, inputNum2, inputNum1 * inputNum2);
                break;
            case "/":
                System.out.printf("%d / %d = %.2f\n", inputNum1, inputNum2, (float)inputNum1 / inputNum2);
                break;
            default:
                System.out.println("다시 입력해주세요.");

        }

    }
}
