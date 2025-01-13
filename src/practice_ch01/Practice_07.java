package practice_ch01;

/**
 * 프로그램 실행 시 args로 1 ~ 100 사이의 숫자를 정답으로 입력받습니다.
 * 사용자는 1 ~ 100 사이의 숫자를 계속 시도하며, 정답을 맞힐 때까지 반복합니다.
 * 정답보다 작은 경우 "더 높습니다", 큰 경우 "더 낮습니다"라는 힌트를 출력합니다.
 *
 * 힌트
 * args[0]로 정답 숫자를 가져오기
 * 사용자 입력은 args를 통해 미리 정해진 시도 값 사용
 * 반복문으로 정답을 맞힐 때까지 힌트 출력
 *
 */


public class Practice_07 {

    public static void main(String[] args) {
        int answer = Integer.parseInt(args[0]);
        for(int i = 1; i < args.length; i++) {
            int inputNum = Integer.parseInt(args[i]);
            System.out.println("입력값 : " + args[i]);
            if(inputNum > answer)
                System.out.println("더 낮습니다!");
            else if(inputNum < answer)
                System.out.println("더 높습니다!");
            else {
                System.out.println("정답입니다!");
                break;
            }
        }
    }
}
