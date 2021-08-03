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

    void serialNumbers() {
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

    void primitiveType() {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767) System.out.println("* short");
                if(x>=-Math.pow(2, 31) && x<=Math.pow(2, 31)-1) System.out.println("* int");
                if(x>=-Math.pow(2, 63) && x<=Math.pow(2, 63)-1) System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }

    void numerationRowOfFile () {
        Scanner in = new Scanner(System.in);
        for (int i = 1; in.hasNext(); i ++) {
            System.out.println(i + " " + in.nextLine());
        }
    }

    public static void main(String[] args) {

    }
}
