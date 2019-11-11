#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define	SIZE	32	

struct stack {
	int sta[SIZE];
	int top;
};

void init_stack(struct stack* s)
{
	memset(s->sta, 0, sizeof(s->sta));
	s->top = -1;
}

int in_stack(struct stack* s, int data)
{
	if (s->top == SIZE - 1) {
		printf("the stack is full. \n");
		return 1;
	}

	(s->top)++;
	s->sta[s->top] = data;
	return 0;
}
int out_stack(struct stack* s)
{
	int tmp;
	if (s->top < 0) {
		//		printf("the stack is empty. \n");
		return -1;
	}
	else {
		tmp = (s->sta)[s->top];
		(s->top)--;
		return tmp;
	}
}
void destory(struct stack *s)
{
	s->top = -1;
	memset(s->sta, 0, sizeof(s->sta));
}

int ten_8_bin(struct stack* s, int ten)
{
	int tmp = ten;
	if (ten < 0) {	//将负数变成正数，同时前面加负号。
		ten = ~ten + 1;
		printf("-");
	}
	if (ten == 0)
		in_stack(s, tmp);
	else {
		while (ten) {
			tmp = ten % 8;
			in_stack(s, tmp);
			ten = ten / 8;
		}
	}
	return tmp;
}
int main()
{
	struct stack S;
	init_stack(&S);
	int i = 0,N;
	int  ret;
	scanf("%d", &N);
	ten_8_bin(&S, N);
	printf("N:%d=",N);
	while ((ret = out_stack(&S)) >= 0) {
		printf("%d", ret);
	}
	printf("\n");

	destory(&S);

	return 0;
}