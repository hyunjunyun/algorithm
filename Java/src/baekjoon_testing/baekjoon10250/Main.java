package baekjoon_testing.baekjoon10250;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int H = scanner.nextInt(); // ȣ���� �� ��
            int W = scanner.nextInt(); // �� ���� �� ��
            int N = scanner.nextInt(); // �� ��° �մ�

            if (N % H == 0) {
                System.out.println((H * 100) + (N / H));
            } else {
                System.out.println(((N % H) * 100) + ((N / H) + 1));
            }
        }
        scanner.close();
    }
}
