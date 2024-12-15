package practice_ch01;

import java.util.Scanner;

public class Practice_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int RandNum = (int)(Math.random() * 100 + 1);
        String input = "";
        int UserNum = 0;

        while(true) {
            System.out.print("1부터 100사이의 숫자를 입력하세요 : ");
            input = scanner.nextLine();
            UserNum = Integer.parseInt(input);

            if(UserNum > RandNum) {
                System.out.println("정답보다 큽니다! 더 작은 수를 입력하세요.");
            }
            else if (UserNum < RandNum) {
                System.out.println("정답보다 작습니다! 더 큰 수를 입력하세요.");

            } else {
                System.out.println("정답을 맞추었습니다! ");
                break;
            }

        }
    }
}
