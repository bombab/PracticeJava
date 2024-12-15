package practice_ch01;

public class Practice_03 {
    public static void main(String[] args) {
        int i = 2;
        while(i < 10) {
            int j = 1;
            while(j < 10) {
                System.out.printf("%d X %d = %d%n", i, j, i * j);
                j++;
            }
            i++;
        }
    }

}
