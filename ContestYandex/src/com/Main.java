package com;

import java.util.Scanner;

public class Main {

    public static void check(String [] s) {
        String [] nums = new String[]{"1","2","3","4","5","6","7","8","9"};
        String [] s1 = new String[s.length];
        for (int i = 0; i < s.length; i ++) {
            for(int j = 0; j < nums.length; j++){
                if (s[i].contains(nums[j])) {
                    int k = Integer.parseInt(nums[j]) - 1;
                    s1[k] = s[i];
                }
            }
        }
        for (String value : s1) {
            System.out.print(value.replaceAll("[\\d.]", "") + "\n");
            //System.out.println();
        }
    }

    public static void main(String[] args) {
        String [] s = new String[]{"str3", "1smth", "bla2bla"};
        check(s);
    }
}
