#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<Windows.h>
typedef struct _student//�����Լ���Ҫ����������
{
	long int num;//ѧ��
	int gaoshu;//�����ɼ�
	int daying;//��Ӣ�ɼ�
	char Name[20];//����
	char xingbie;//�Ա�WŮ��M��
}Student;
Student students[10];
int n;
/*
void table1(int n)//����� 
{
	int i;
	printf("\n");
	printf("\t   +**********************************************************************************************************+\n"); 
	printf("\t    \tѧ��      ����        �Ա�      �༶      ����      Ӣ��         C����         ˼��           ƽ����\n");
	printf("\t   +----------------------------------------------------------------------------------------------------------+\n");
	for(i=0;i<n;i++)
	{
		stu[i].score=(stu[i].score1+stu[i].score2+stu[i].score3+stu[i].score4)/4;
		printf("\t    %-13I64d%-13s%-10s%-9d%-12f%-12f%-12f%-12f%-12f\n",stu[i].num,stu[i].name,stu[i].sex,stu[i].clas,stu[i].score1,stu[i].score2,stu[i].score3,stu[i].score4,stu[i].score);
 
	}
}
*/
void shuru (Student(*students)[10],int *n)//���뺯��������1
{
	system("cls");//����
	char s;
	do {
		printf("������ѧ��:ѧ�� ���� �Ա� �����ɼ� ��Ӣ�ɼ������ݼ��ÿո�ֿ�\n");
		scanf("%ld %s %c %d %d", &(*students)[*n].num, (*students)[*n].Name, &(*students)[*n].xingbie, &(*students)[*n].gaoshu, &(*students)[*n].daying);
		getchar(); 
		(*n)++;
		printf("��ӳɹ����Ƿ������Y��|N��\n");
		scanf("%c", &s);
		getchar();
	} while (s == 'Y' || s == 'y');
	system("pause");//��ͣ
}
void chaxun(Student(*students)[10], int *n)//��ѯ��ģ���
{
	system("cls");//����
	printf("����������\n");
	char name[20];
	scanf("%s", name);
	int flag = 1;
	for (int i = 0; i < *n; i++)
	{
		if (strcmp((*students)[i].Name, name) == 0)
		{
			printf("��ѯ�ɹ�\n");
			printf("ѧ��:%ld\n������%s\n�Ա�%c\n�����ɼ���%d\n��Ӣ�ɼ���%d\n", (*students)[i].num, (*students)[i].Name, (*students)[i].xingbie, (*students)[i].gaoshu, (*students)[i].daying);
			flag = 0;
		}
	}
	if (flag) {
		printf("���޴���\n");
	}
	getchar();
	system("pause");//��ͣ����
}
void shanchu(Student(*students)[10], int *n)//ɾ��ѧ����Ϣ
{
	system("cls");
	char chaxun1[20];
	int  k, i;
	printf("��������Ҫɾ����Ϣ��ѧ������\n");
	scanf("%s", chaxun1);
	getchar();
	int flag = 1;
	for (k = 0; k < *n; k++)//����һ�����ݰ���Ҫɾ�������ݸ���
	{
		if (strcmp(chaxun1, (*students)[k].Name) == 0) {
			for (i = k - 1; i < *n; ++i)
			{
				strcpy((*students)[i].Name, (*students)[i + 1].Name);
				(*students)[i].xingbie = (*students)[i + 1].xingbie;
				(*students)[i].num = (*students)[i + 1].num;
				(*students)[i].gaoshu = (*students)[i + 1].gaoshu;
				(*students)[i].daying = (*students)[i + 1].daying;
			}
			(*n)--;
			printf("ɾ���ɹ�\n");
			flag = 0;
		}
	}
	if (flag)
	{
		printf("���޴���\n");
	}
	system("pause");
}
void pingjun(Student(*students)[10], int *n)//����ѧ����ƽ���ɼ�
{
	system("cls");
	char chaxun1[20];
	int  k;
	float t;
	printf("��������Ҫ��ѯƽ���ɼ���ѧ������\n");
	scanf("%s", chaxun1);
	for (k = 0; k < *n; ++k)
	{
			if (strcmp(chaxun1, (*students)[k].Name) == 0)
				t = (*students)[k].gaoshu + (*students)[k].daying;
	}
	t = t / 2;
	printf("������ѯ��ѧ����ƽ���ɼ�Ϊ%.2f\n", t);
	system("pause");
}
void charu(Student(*students)[10], int *n)//����һ��ѧ������Ϣ
{
	system("cls");
	(*n)++;
	printf("������ѧ��:ѧ�� ���� �Ա� �����ɼ� ��Ӣ�ɼ������ݼ��ÿո�ֿ�\n");
	scanf("%ld %s %c %d %d", &(*students)[*n-1].num, (*students)[*n-1].Name, &(*students)[*n-1].xingbie, &(*students)[*n-1].gaoshu, &(*students)[*n-1].daying);
	getchar();
	system("pause");
}
void gengxin(Student(*students)[10], int *n)//����ģ�飬��
{
	int i,j,k,h;
	char s;
	do {
		system("cls");
		printf("\t\t\t\t\t\t             �� ѡ ��          \n");//�˵�
		printf("\t\t\t\t\t\t  --------------------------------   \n");
		printf("\t\t\t\t\t\t ||                           ||    \n");
		printf("\t\t\t\t\t\t ||     1. ѧ����ƽ���ɼ�     ||    \n");
		printf("\t\t\t\t\t\t ||     2. ɾ��ѧ����Ϣ       ||    \n");
		printf("\t\t\t\t\t\t ||     3. ����ѧ����Ϣ       ||    \n");
		printf("\t\t\t\t\t\t ||     4. �˳�               ||    \n");
		printf("\t\t\t\t\t\t --------------------------------  \n");
		scanf("%d", &i);
		getchar();
		switch (i)
		{
		case 1:
		{
			pingjun(students, n);
			getchar();
		}
			break;
		case 2:
			shanchu(students, n);
			getchar();
			break;
		case 3:
			charu(students,n);
			getchar();
			break;
		case 4:
			break;
		default:
			printf("ֻ������1-4������������");
			break;

		}
		printf("��Ҫ��������ѧ����Ϣ��(Y/N)\n");
		scanf("%c", &s);
		system("pause");
	} while ((s == 'Y' || s == 'y'));
}
void tongji(Student(*students)[10], int *n)//ͳ��ģ��
{
	system("cls");
	int i,mgaoshu=0,mdaying=0,k=0,z=0;
	for (i = 0; i < *n; ++i)
	{
		if ((*students)[i].gaoshu > mgaoshu)
			mgaoshu = (*students)[i].gaoshu;
	}
	for (i = 0; i < *n; ++i)
	{
		if ((*students)[i].daying > mdaying)
			mdaying = (*students)[i].daying;
	}
	for (i = 0; i < *n; ++i)
	{
		if ((*students)[i].daying < 60)
			k++;
	}
	for (i = 0; i < *n; ++i)
	{
		if ((*students)[i].gaoshu < 60)//zΪ������kΪ��Ӣ
			z++;
	}
	printf("\n");
	printf("\n");
	printf("\n");
	printf("\n");
	printf("\n");
	printf("\n");
	printf("\n");
	printf("\n");
	printf("\n");
	printf("\t\t\t\t\t\t��������ߵ÷�Ϊ%d\n", mgaoshu);
	printf("\t\t\t\t\t\t��Ӣ����ߵ÷�Ϊ%d\n", mdaying);
	printf("\t\t\t\t\t\t�����Ĳ���������Ϊ%d\n",z);
	printf("\t\t\t\t\t\t��Ӣ�Ĳ���������Ϊ%d\n", k);
	system("pause");
}
void shuchu(Student(*students)[10], int *n)//���ģ��
{
	system("cls");
	int i, j, k,z;
	Student t;
	char s;
	do
	{
		printf("��������Ҫ��ѯ�ĳɼ�\n");
		printf("1.����\n");
		printf("2.��Ӣ\n");
		scanf("%d", &i);
		getchar();
		switch (i)
		{
		case 1:
		{
			for (i = 0; i < *n - 1; ++i)
			{
				for (j = 0; j < *n - i; j++)
				{
					if ((*students)[j].gaoshu < (*students)[j + 1].gaoshu)
					{t = (*students)[j]; (*students)[j] = (*students)[j + 1]; (*students)[j + 1] = t;
				}
				}
			}
			printf("\n");
			printf("\t   +**********************************************************************************************************+\n");
			printf("\t    \tѧ��      ����        �Ա�      ����         ��Ӣ\n");
			printf("\t   +----------------------------------------------------------------------------------------------------------+\n");
			for(i=0;i<*n;i++)
			printf("\t\    %ld      %10s      %5c      %d            %d\n", (*students)[i].num, (*students)[i].Name, (*students)[i].xingbie, (*students)[i].gaoshu, (*students)[i].daying);
		}
			break;
		case 2:
		{
			for (i = 0; i < *n - 1; ++i)
			{
				for (j = 0; j < *n - i; j++)
				{
					if ((*students)[j].daying < (*students)[j + 1].daying)
					{
						t = (*students)[j]; (*students)[j] = (*students)[j + 1]; (*students)[j + 1] = t;
					}
				}
			}
			printf("\n");
			printf("\t   +**********************************************************************************************************+\n");
			printf("\t    \tѧ��      ����        �Ա�      ����         ��Ӣ\n");
			printf("\t   +----------------------------------------------------------------------------------------------------------+\n");
			for (i = 0; i < *n; i++)
				printf("\t\    %ld      %10s      %5c      %d            %d\n", (*students)[i].num, (*students)[i].Name, (*students)[i].xingbie, (*students)[i].gaoshu, (*students)[i].daying);
		}
			break;
		default:printf("������������ֻ������1-2\n");
			break;
		}
		printf("��Ҫ�������������(Y/N)\n");
		scanf("%c", &s);
		getchar();
		system("pause");
	} while (s == 'Y' || s == 'y');
}
void main() //������
{
	//�Դ����ݣ��������
	students[0].num = 1001;
	strcpy(students[0].Name, "zhangsan");
	students[0].xingbie = 'M';
	students[0].gaoshu = 77;
	students[0].daying = 88;

	students[1].num = 1002;
	strcpy(students[1].Name, "lisi");
	students[1].xingbie = 'M';
	students[1].gaoshu = 97;
	students[1].daying = 88;

	students[2].num = 1003;
	strcpy(students[2].Name, "wangmazi");
	students[2].xingbie = 'M';
	students[2].gaoshu = 45;
	students[2].daying = 44;

	students[3].num = 1004;
	strcpy(students[3].Name, "limazi");
	students[3].xingbie = 'M';
	students[3].gaoshu = 45;
	students[3].daying = 44;
	int n = 4;//�����б����ѧ������
	printf("\t\t\t\t\t\t\t��ӭʹ��ѧ������ϵͳ\n");//��ҳ
	printf("\t\t\t\t  ��������������������������������������������������������������������������������������������������������������������\n");
	printf("\t\t\t\t  ��********************************************************��\n");
	printf("\t\t\t\t  ��***����������������������������������������������������������������������������������������������������***��\n");
	printf("\t\t\t\t  ��***��************************************************��***��\n");
	printf("\t\t\t\t  ��***��***                                         ****��***��\n");
	printf("\t\t\t\t  ��***��***       ��ӭʹ��ѧԺѧ����Ϣ����ϵͳ      ****��***��\n");
	printf("\t\t\t\t  ��***��***                                         ****��***��\n");
	printf("\t\t\t\t  ��***��***                                         ****��***��\n");
	printf("\t\t\t\t  ��***��***                                         ****��***��\n");
	printf("\t\t\t\t  ��***��***                                         ****��***��\n");
	printf("\t\t\t\t  ��***��***                2019.01.07               ****��***��\n");
	printf("\t\t\t\t  ��***��***                                         ****��***��\n");
	printf("\t\t\t\t  ��***��************************************************��***��\n");
	printf("\t\t\t\t  ��***����������������������������������������������������������������������������������������������������***��\n");
	printf("\t\t\t\t  ��********************************************************��\n");
	printf("\t\t\t\t  ��������������������������������������������������������������������������������������������������������������������\n");
	printf("���س�������ϵͳ");
	getchar();
	int i;
	char a;
	do
	{
		system("cls");//���˵�
		printf(" \t\t\t\t\t\t            �� ѡ ��          \n");
		printf("  \t\t\t\t\t\t ------------------------------   \n");
		printf("  \t\t\t\t\t\t ||                         ||    \n");
		printf("  \t\t\t\t\t\t ||     1. ѧ����Ϣ¼��     ||    \n");
		printf("  \t\t\t\t\t\t ||     2. ѧ����Ϣ��ѯ     ||    \n");
		printf("  \t\t\t\t\t\t ||     3. ѧ����Ϣ����     ||    \n");
		printf("  \t\t\t\t\t\t ||     4. ѧ����Ϣͳ��     ||    \n");
		printf("  \t\t\t\t\t\t ||     5. ѧ����Ϣ���     ||    \n");
		printf("  \t\t\t\t\t\t ||     6. �˳�             ||    \n");
		printf(" \t\t\t\t\t\t  -------------------------------  \n");
		scanf("%d", &i);
		getchar();
		switch (i)
		{
		case 1:shuru(&students,&n);
			break;
		case 2:chaxun(&students,&n);
			break;
		case 3:gengxin(&students,&n);
			break;
		case 4:tongji(&students,&n);
			break;
		case 5:shuchu(&students,&n);
			break;
		case 6:
			break;
		default:printf("������������ֻ������1-6");
			break;
		}
		printf("��Ҫ��������ѧ����Ϣ��(Y/N)\n");
		scanf("%c", &a);
		system("pause");
	} while (a == 'Y' || a == 'y');
}
