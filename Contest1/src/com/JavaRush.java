package com;

import java.util.Scanner;

public class JavaRush {

    void toInfinity() {
        int start = Integer.MAX_VALUE - 1;
        for (int i = start; i <= start + 1; i++) {
            if (start == Integer.MAX_VALUE)
                start = Integer.MIN_VALUE;
        }
    }

    static void executableComment() {
        // комментарий ниже будет выполнен!
        // \u000d System.out.println("выполняемый комментарий");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                a = a + (int) Math.pow(2, j) * b;
                System.out.print(a + " ");
            }
            System.out.println("");
        }
        in.close();
    }
}
