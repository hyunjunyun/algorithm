#include <stdio.h>
#include <stdlib.h>
#define MAX_SIZE 3

typedef int element;

typedef struct {
	int front;
	int rear;
	element queue[MAX_SIZE];
}QueueType;

void error(const char* message) {
	printf("%s\n", message);
	exit(1);
}

void init(QueueType* q) {
	q->rear = 0, q->front = 0;
}

void enqueue(QueueType* q, element item) {
	if ((q->rear + 1) % MAX_SIZE == q->front) {
		error("ť�� ��ȭ �����Դϴ�");
		return;
	}
	q->rear = (q->rear + 1) % MAX_SIZE;
	q->queue[q->rear] = item;
}

element dequeue(QueueType* q) {
	if (q->front == q->rear) {
		printf("%d %d", q->front, q->rear);
		error("ť�� �����Դϴ�");
		return 0;
	}
	q->front = (q->front + 1) % MAX_SIZE;
	return q->queue[q->front];
}

int main() {

	QueueType* queue = {0};
	int key;
	element no;

	init(queue);

	while (1) {
		printf("1:ENQUEUE\n");
		printf("2:DEQUEUE\n");
		printf("Q:quit\n");

		key = getchar();
		if (key == 'Q' || key == 'q')
			return 0;
		else if (key == '1') {
			printf("ENQUEUE �� �� �Է� : ");
			scanf_s("%d", &no);
			enqueue(queue, no);
		}
		else if (key == '2') {
			printf("DEQUEUE �� �� : %d\n", dequeue(queue));
		}

	}

}