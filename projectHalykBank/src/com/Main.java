package com;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static int findDuplicate() {
        // 3 1 2 1 4  1 1 2 3 4
        // 3 1 2 3 1
        // 2 2 2 2 1
        // 3 2 1 4 1
        int [] a = randomArray();
        int k = 0;
        for (int i = 0; i < a.length; i ++) {
            for (int j = 1; j < i + 1; j ++) {
                if (a[i] == a[j]) {
                    k = a[i];
                }
            }
        }

//        Arrays.sort(a);
//        for (int i = 0; i < a.length - 1; i ++) {
//            if (a[i] == a[i + 1]) {
//                return a[i];
//            }
//        }

        Set<Integer> set = new HashSet<>();
        int w = 0;
        for (int i = 0; i < a.length; i ++) {
            if(!set.contains(a[i])){
                set.add(a[i]);
            } else {
                w = a[i];
            }
        }

        return 0;
    }

    public static int[] randomArray() {
        Random random = new Random(98);
        int n = random.nextInt() + 2;

        int [] a = new int[n];

        for (int i = 0; i < n; i ++) {
            a[i] = random.nextInt(n - 2) + 1;
        }
        return a;
    }

    public static void main(String[] args) {
        randomArray();
    }
}
