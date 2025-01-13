package practice_ch02;

/**
 * int 타입의 배열 numbers를 선언하고, 크기가 10인 배열로 초기화하세요.
 * 배열의 모든 요소를 0부터 9까지의 숫자로 초기화하는 코드를 작성하세요.
 *
 */


public class Practice_01 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++)
            numbers[i] = i;

    }
}
