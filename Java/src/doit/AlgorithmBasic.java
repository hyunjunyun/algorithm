package doit;

import java.util.Scanner;

public class AlgorithmBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�� ������ �ִ��� ���մϴ�.");
        System.out.print("n3�� �� : ");
        int n1 = scanner.nextInt();
        System.out.print("n2�� �� : ");
        int n2 = scanner.nextInt();
        System.out.print("n3�� �� : ");
        int n3 = scanner.nextInt();

        int max = n1;
        if (n2 > max) max = n2;
        if (n3 > max) max = n3;

        System.out.println("�ִ��� " + max + "�Դϴ�.");
    }
}
