package practice_ch01;

import java.util.Scanner;

public class Practice_04 {

    public static void main(String[] args) {

        int Factorial_Result = 1;
        int i = 1, num = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("팩토리얼 계산기 시작! 정수 n을 입력하세요 : ");
        String input = scanner.nextLine();

        num = Integer.parseInt(input);

        while(i <= num) {
            Factorial_Result = Factorial_Result * i;
            i++;
        }

        System.out.printf("%d! = %d%n", num, Factorial_Result);

    }

}
