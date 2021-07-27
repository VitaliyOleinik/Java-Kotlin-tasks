package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	void cntAZaz(){
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char[] chars = s.toCharArray();
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < s.length(); i++) {
			if (chars[i] >= 65 && chars[i] <= 90){
				sum1 ++;
			} else if (chars[i] >= 97 && chars[i] <= 122) {
				sum2 ++;
			}
		}
		System.out.println("from A to Z " + sum1 + "\nfrom a to z " + sum2);
	}

	void fromSmallToCapital() {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String s1 = s.toUpperCase();
		System.out.println(s1);
	}

	void substring(){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String sub = in.next();
		if (s.contains(sub)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println(s + "   " + sub);
	}

	void palindromes() {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char [] chars = s.toCharArray();
		for (int i = 0; i < s.length() / 2; i ++){
			if (chars[i] != chars[s.length() - 1 - i]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("YES");
	}

	void sumEqualsOddEven() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = String.valueOf(n);
		char[] chars = s.toCharArray();
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < chars.length; i ++){
			if (i % 2 == 0) {
				sum1 += chars[i];
			} else {
				sum2 += chars[i];
			}
		}
		if (sum1 == sum2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	void substringLR() {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int l = in.nextInt(), r = in.nextInt();
		System.out.println(s.substring(l, r + 1));
	}

	void repeatCountNum() {
		Scanner in = new Scanner(System.in);
		String s = in.next();
//		if ((s.length() - 1) / 2 != 0){
//			System.out.println("No");
//			return;
//		}
		ArrayList<Integer> arrayList = new ArrayList<>();
		char [] chars = s.toCharArray();
		int k = 0;
		for (char aChar : chars) {
			for (char c : chars) {
				if (aChar == c) {
					k++;
				}
			}
			arrayList.add(k);
			k = 0;
		}
		for (int i = 0; i < chars.length; i ++) {
			for (int j = 0; j < chars.length; j ++){
				if (arrayList.indexOf(i) != arrayList.indexOf(j)) {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
	}

	public static void countRowAndColumn() {
		Scanner in = new Scanner(System.in);
		int n = 3, m = 3;
		int [][] array = new int[n][m];
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				array[i][j] = in.nextInt();
			}
		}

		int [] total = new int[array.length];
		for(int column= 0; column< array.length; column++)
		{
			total[column] = 0;
			for(int row= 0; row < array.length; row++)
			{
				total[column] += array[row][column];
			}
		}

		for (int row = 0; row < array.length; row ++) {
			total[row] = 0;
			for (int column= 0; column< array.length; column++)
			{
				total[row] += array[row][column];
			}
		}

		for (int i = 0; i < array.length; i ++) {
			System.out.print(total[i] + " ");
		}
	}

	public static void order() {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length - 1; i ++) {
			if (chars[i] > chars[i+1]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

	public static void amountOfCharacter() {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String x = in.next();
		int n = in.nextInt();
		char[] chars = s.toCharArray();
		int cnt = 0;
		for (int i = 0; i < s.length(); i ++) {
			if (chars[i] == x.charAt(0)) {
				cnt ++;
			}
		}
		if (cnt == n) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static void task74871() {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();
		for (int i = 0, j = 0; i < tChars.length;  i ++, j ++) {
			if (j > sChars.length - 1) {
				j = 0;
			}
			if (sChars[j] != tChars[i]) {
				System.out.println("NO");
				return;
			}
			if (tChars.length - 1 == i && j < sChars.length - 1) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

	public static void shift() {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char [] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i ++) {
			if (chars[i] == 'z') {
				chars[i] = 'a';
			} else {
				chars[i] ++;
			}
		}
		for (char c : chars) {
			System.out.print(c);
		}
	}

	public void countOfEachCharacter() {
		Scanner in = new Scanner(System.in);
		String apple = in.nextLine();

		Map<Character, Integer> charList = new HashMap<>();
		for (char c = 'a'; c <= 'z'; ++c) {
			charList.put(c, 0);
		}
		for (int i = 0; i < apple.length(); i ++) {
			Character first = apple.toLowerCase().charAt(i);
			Integer count = charList.get(first);
			if (count != null) {
				charList.put(first, ++count);
			}
		}

		for (Map.Entry<Character, Integer> entry : charList.entrySet()) {
			System.out.println("The number of words that start with "+entry.getKey()+" - " + entry.getValue());
		}
	}

	public void nBooksDividedByKDays() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt();
		if (n % k == 0) {
			System.out.println(n / k);
		} else {
			System.out.println(n / k + 1);
		}
	}

	public void exchange() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] a = new int[n];
		for (int i = 0; i < a.length; i ++) {
			a[i] = in.nextInt();
		}
		int d = in.nextInt();
		for (int i = 0; i < a.length; i ++) {
			a[i] *= d;
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

    public static void main(String[] args) {

	}
}
