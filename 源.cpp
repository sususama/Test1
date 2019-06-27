#include<stdio.h>
#include<math.h>

int IsPrime(int n)//ÅĞ¶ÏËØÊıµÄº¯Êı
{
	int i;
	for (i = 2; i <n; i++)
	{
		if (n%i == 0)
			return 0;
	}
	return 1;
}
int main()
{
	int N;
	scanf("%d", &N);
	int i, count = 0;
	for (i = 3; i <= N - 2; i += 2)
	{
		if (IsPrime(i) && IsPrime(i + 2))
			count++;
	}
	printf("%d\n", count);
	return 0;
}
