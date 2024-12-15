package practice_ch01;

import java.util.Scanner;

public class Practice_06 {

    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int inputNum = 0;


        while(true) {
            System.out.print("양의 정수를 입력하세요 : ");
            input = scanner.nextLine();
            inputNum = Integer.parseInt(input);

            if(inputNum < 0) {
                System.out.println("양의 정수를 입력해주세요.");
            }

            else if(inputNum == 0) {
                System.out.println("지금까지 입력받은 양의 정수들의 총합 : " + result);
                break;
            }

            else {
                result += inputNum;
            }
        }
    }
}
