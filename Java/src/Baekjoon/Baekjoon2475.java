package baekjoon;

import java.util.Scanner;

public class Baekjoon2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			cnt += Math.pow(sc.nextInt(),2);
		}
		System.out.println(cnt % 10);
	}
}
