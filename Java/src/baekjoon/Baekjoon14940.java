package baekjoon;

import java.util.Scanner;

public class Baekjoon14940 {
    static int[][] cost;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];
        cost = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] != 0) {
                    if (i > 0 && j > 0 && i + 1 < m && j + 1 < n) {
                        if (cost[i][j - 1] == 0 && cost[i][j + 1] == 0) {
                            insertCost(i, j, i - 1, j);
                            /*cost[i][j] = cost[i][j - 1] + 1;//�¿� �翷�� ���� ��,���� ���� �ִٸ� �� �Ʒ� ���. �Ը� �� + 1�� �Ѵ�*/
                        }
                        if (cost[i - 1][j] == 0 && cost[i + 1][j] == 0) {
                            insertCost(i, j, i, j - 1);
                        }
                    }
                    cost[i][j] = i + j;
                } else {
                    cost[i][j] = 0;
                }
            }
        }

        // �ϴ� Ư�� ��ġ������ �Ÿ��� ã�Ƴ��� �˰����� �ۼ�

        for (
                int i = 0;
                i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d ", cost[i][j]);
            }
            System.out.println();
        }

    }

    public static void insertCost(int n, int m, int row, int col) {
        cost[n][m] = cost[col][row] + 1;
    }
}
