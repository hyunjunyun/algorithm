package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon5622 {
	public static int time;

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char[] num = bf.readLine().toCharArray();//char �迭�� ����
		bf.close();
		for (char c : num) {
			time += (c - 'A') / 3 + 3;// ó�� �� 2�� �����ϱ⿡ 3�� �����ش�.
			if (c=='S' || c=='V' || c=='Y' || c=='Z') {//������ 7,8,9 ���ڰ� �ٸ� ���ڿʹ� �ٸ� ������ �����⿡ �и� ���ĺ��� ����
				time--;
			}
		}
		System.out.println(time);
	}
}
