#include <stdio.h>
#include <stdlib.h>

#define STACK_SIZE 5

typedef int element;
element stack[STACK_SIZE];
int top = -1;

void push(element item) {
	if (top >= STACK_SIZE - 1) {
		printf("Stack is Full!\n");
		return;
	}
	else stack[++top] = item;
}

element pop() {
	if (top == -1) {
		printf("Stack is Empty!!\n");
		return 0;
	}
	else return stack[top--];
}

element peek() {
	if (top == -1) {
		printf("Stack is Empty!!\n");
		return 0;
	}
	else return stack[top];
}



int main() {

	char key;
	element no;
	printf("1:PUSH\n");
	printf("2:POP\n");
	printf("3:PEEK\n");
	printf("Q:quit\n");

	while (true) {
		key = getchar();
		if (key == 'Q' || key == 'q')
			return 0;
		else if (key == '1') {
			printf("PUSH �� �� �Է� :");
			scanf_s("%d", &no);
			push(no);
		}
		else if (key == '2') {
			printf("POP �� �� : %d\n", pop());
		}
		else if (key == '3') {
			printf("PEEK �� �� : %d\n", peek());
		}
	}

}