package baekjoon;

import java.io.*;
import java.util.Stack;

public class Baekjoon17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(bufferedReader.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        int[] nums = new int[num];
        int[] result = new int[num];
        String[] input = bufferedReader.readLine().split(" ");
        for (int i = 0; i < num; i++)
            nums[i] = Integer.parseInt(input[i]);

        stack.push(0);
        for (int i = 1; i < num; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) // ������ ������� �ʰ� ������ ���� �ε����� ������ ������ ������ ���� ��
                result[stack.pop()] = nums[i];
            stack.push(i);
        }

        while (!stack.empty()) { // ������� ���� �� ����
            result[stack.peek()] = -1; // ��� ����
            stack.pop();
        }

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i] + " ");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
