package baekjoon.Bronze;

import java.util.Scanner;

public class Baek11719_그대로_출력하기_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            System.out.println(input);
        }
        sc.close();
    }
}