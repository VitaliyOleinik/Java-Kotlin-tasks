package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class IsPrime {
    static void isPrime(int n) {
        for (int i = 2; i < n; ++ i) {
            if (n % i == 0) {
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
    }

    static void bigIntegerIsPrime() {
        String s = "12";
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();;
        in.close();
        System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        BigInteger n = new BigInteger(s);

        System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");
        bufferedReader.close();
    }
}
