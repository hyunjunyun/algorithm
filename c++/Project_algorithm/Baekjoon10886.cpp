#include <stdio.h>
#include <string.h>

int main() {

    char a[20];

    // 1����Ʈ���� ��� 65�� �ʱ�ȭ
    // �迭�� ä�� ���� sizeof()�Լ��� ����ϸ� �˴ϴ�.
    // sizeof �Լ� - �迭�� ��ü ����Ʈ ũ�⸦ ��ȯ�մϴ�.
    memset(a, 65, sizeof(a));

    // ����� ���� Ȯ��
    for (int i = 0; i < (sizeof(a) / sizeof(char)); i++) {
        printf("%c\n", a[i]);
    }

}