package util;

import java.util.Scanner;

public class InputUtil {

    public static String requireText(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title + ": ");
        String answer = sc.nextLine();
        return answer;
    }
    
    public static byte requireNumber(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title + ": ");
        byte answer = sc.nextByte();
        return answer;
    }
}
