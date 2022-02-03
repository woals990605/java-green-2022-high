package site.metacoding.ex23;

import java.util.Scanner;

public class ThreadEx04 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Thread t1 = new Thread(() -> {
            // 이 부분이 run 메서드 내부
        });
        t1.start();
        System.out.println("메인 스레드 종료");
    }
}
