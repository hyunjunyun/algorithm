package baekjoon;

import java.util.Scanner;

public class Baekjoon10250 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int H= scanner.nextInt(), W=scanner.nextInt(),N =scanner.nextInt();
            System.out.println(String.format("%d0%d", N%H,N/H +1));
        }//���ڸ� ���ڸ� ���� ��� �� ��ģ
        scanner.close();
    }
}
