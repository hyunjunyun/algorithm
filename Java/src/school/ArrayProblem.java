package school;

import java.util.Scanner;

public class ArrayProblem {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.print("��� ��:");
		int input = scanner.nextInt();

		System.out.println("������ �Է��ϼ���.");
		int result = 0, max = -987643, min = 98765545;
		for (int i = 0; i < input; i++) {
			System.out.print((i + 1) + "���� ���� : ");
			int score = scanner.nextInt();
			result += score;
			if (max < score) {
				max = score;
			}
			if (min > score) {
				min = score;
			}
		}

		System.out.println("�հ�� " + result + "���Դϴ�.");
		System.out.println("����� " + (float) (result / input) + "���Դϴ�.");
		System.out.println("�ְ����� " + max + "���Դϴ�.");
		System.out.println("�������� " + min + "���Դϴ�.");
	}
}
