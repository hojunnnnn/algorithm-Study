package programmers.etc;

import java.util.stream.IntStream;

public class 순서쌍의_개수 {
    public static void main(String[] args) {
        System.out.println(solution(20));
        System.out.println(solution(100));
    }

    public static int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}
