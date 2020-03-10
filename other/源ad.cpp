#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<Windows.h>
typedef struct _student//定义自己需要的数据类型
{
	long int num;//学号
	int gaoshu;//高数成绩
	int daying;//大英成绩
	char Name[20];//名字
	char xingbie;//性别，W女，M男
}Student;
Student students[10];
int n;
/*
void table1(int n)//表格函数 
{
	int i;
	printf("\n");
	printf("\t   +**********************************************************************************************************+\n"); 
	printf("\t    \t学号      姓名        性别      班级      高数      英语         C语言         思修           平均分\n");
	printf("\t   +----------------------------------------------------------------------------------------------------------+\n");
	for(i=0;i<n;i++)
	{
		stu[i].score=(stu[i].score1+stu[i].score2+stu[i].score3+stu[i].score4)/4;
		printf("\t    %-13I64d%-13s%-10s%-9d%-12f%-12f%-12f%-12f%-12f\n",stu[i].num,stu[i].name,stu[i].sex,stu[i].clas,stu[i].score1,stu[i].score2,stu[i].score3,stu[i].score4,stu[i].score);
 
	}
}
*/
void shuru (Student(*students)[10],int *n)//输入函数，区块1
{
	system("cls");//清屏
	char s;
	do {
		printf("请输入学生:学号 姓名 性别 高数成绩 大英成绩，数据间用空格分开\n");
		scanf("%ld %s %c %d %d", &(*students)[*n].num, (*students)[*n].Name, &(*students)[*n].xingbie, &(*students)[*n].gaoshu, &(*students)[*n].daying);
		getchar(); 
		(*n)++;
		printf("添加成功！是否继续？Y是|N否\n");
		scanf("%c", &s);
		getchar();
	} while (s == 'Y' || s == 'y');
	system("pause");//暂停
}
void chaxun(Student(*students)[10], int *n)//查询，模块二
{
	system("cls");//清屏
	printf("请输入姓名\n");
	char name[20];
	scanf("%s", name);
	int flag = 1;
	for (int i = 0; i < *n; i++)
	{
		if (strcmp((*students)[i].Name, name) == 0)
		{
			printf("查询成功\n");
			printf("学号:%ld\n姓名：%s\n性别：%c\n高数成绩：%d\n大英成绩：%d\n", (*students)[i].num, (*students)[i].Name, (*students)[i].xingbie, (*students)[i].gaoshu, (*students)[i].daying);
			flag = 0;
		}
	}
	if (flag) {
		printf("查无此人\n");
	}
	getchar();
	system("pause");//暂停清屏
}
void shanchu(Student(*students)[10], int *n)//删除学生信息
{
	system("cls");
	char chaxun1[20];
	int  k, i;
	printf("请输入需要删除信息的学生姓名\n");
	scanf("%s", chaxun1);
	getchar();
	int flag = 1;
	for (k = 0; k < *n; k++)//将后一个数据把需要删除的数据覆盖
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
			printf("删除成功\n");
			flag = 0;
		}
	}
	if (flag)
	{
		printf("查无此人\n");
	}
	system("pause");
}
void pingjun(Student(*students)[10], int *n)//计算学生的平均成绩
{
	system("cls");
	char chaxun1[20];
	int  k;
	float t;
	printf("请输入需要查询平均成绩的学生姓名\n");
	scanf("%s", chaxun1);
	for (k = 0; k < *n; ++k)
	{
			if (strcmp(chaxun1, (*students)[k].Name) == 0)
				t = (*students)[k].gaoshu + (*students)[k].daying;
	}
	t = t / 2;
	printf("你所查询的学生的平均成绩为%.2f\n", t);
	system("pause");
}
void charu(Student(*students)[10], int *n)//插入一个学生的信息
{
	system("cls");
	(*n)++;
	printf("请输入学生:学号 姓名 性别 高数成绩 大英成绩，数据间用空格分开\n");
	scanf("%ld %s %c %d %d", &(*students)[*n-1].num, (*students)[*n-1].Name, &(*students)[*n-1].xingbie, &(*students)[*n-1].gaoshu, &(*students)[*n-1].daying);
	getchar();
	system("pause");
}
void gengxin(Student(*students)[10], int *n)//更新模块，三
{
	int i,j,k,h;
	char s;
	do {
		system("cls");
		printf("\t\t\t\t\t\t             请 选 择          \n");//菜单
		printf("\t\t\t\t\t\t  --------------------------------   \n");
		printf("\t\t\t\t\t\t ||                           ||    \n");
		printf("\t\t\t\t\t\t ||     1. 学生的平均成绩     ||    \n");
		printf("\t\t\t\t\t\t ||     2. 删除学生信息       ||    \n");
		printf("\t\t\t\t\t\t ||     3. 插入学生信息       ||    \n");
		printf("\t\t\t\t\t\t ||     4. 退出               ||    \n");
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
			printf("只能输入1-4，请重新输入");
			break;

		}
		printf("还要继续更新学生信息吗？(Y/N)\n");
		scanf("%c", &s);
		system("pause");
	} while ((s == 'Y' || s == 'y'));
}
void tongji(Student(*students)[10], int *n)//统计模块
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
		if ((*students)[i].gaoshu < 60)//z为高数，k为大英
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
	printf("\t\t\t\t\t\t高数的最高得分为%d\n", mgaoshu);
	printf("\t\t\t\t\t\t大英的最高得分为%d\n", mdaying);
	printf("\t\t\t\t\t\t高数的不及格人数为%d\n",z);
	printf("\t\t\t\t\t\t大英的不及格人数为%d\n", k);
	system("pause");
}
void shuchu(Student(*students)[10], int *n)//输出模块
{
	system("cls");
	int i, j, k,z;
	Student t;
	char s;
	do
	{
		printf("请输入需要查询的成绩\n");
		printf("1.高数\n");
		printf("2.大英\n");
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
			printf("\t    \t学号      姓名        性别      高数         大英\n");
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
			printf("\t    \t学号      姓名        性别      高数         大英\n");
			printf("\t   +----------------------------------------------------------------------------------------------------------+\n");
			for (i = 0; i < *n; i++)
				printf("\t\    %ld      %10s      %5c      %d            %d\n", (*students)[i].num, (*students)[i].Name, (*students)[i].xingbie, (*students)[i].gaoshu, (*students)[i].daying);
		}
			break;
		default:printf("您的输入有误，只能输入1-2\n");
			break;
		}
		printf("还要继续输出排名吗？(Y/N)\n");
		scanf("%c", &s);
		getchar();
		system("pause");
	} while (s == 'Y' || s == 'y');
}
void main() //主函数
{
	//自带数据，方便调试
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
	int n = 4;//集合中保存的学生个数
	printf("\t\t\t\t\t\t\t欢迎使用学生管理系统\n");//主页
	printf("\t\t\t\t  ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n");
	printf("\t\t\t\t  ┃********************************************************┃\n");
	printf("\t\t\t\t  ┃***┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓***┃\n");
	printf("\t\t\t\t  ┃***┃************************************************┃***┃\n");
	printf("\t\t\t\t  ┃***┃***                                         ****┃***┃\n");
	printf("\t\t\t\t  ┃***┃***       欢迎使用学院学生信息管理系统      ****┃***┃\n");
	printf("\t\t\t\t  ┃***┃***                                         ****┃***┃\n");
	printf("\t\t\t\t  ┃***┃***                                         ****┃***┃\n");
	printf("\t\t\t\t  ┃***┃***                                         ****┃***┃\n");
	printf("\t\t\t\t  ┃***┃***                                         ****┃***┃\n");
	printf("\t\t\t\t  ┃***┃***                2019.01.07               ****┃***┃\n");
	printf("\t\t\t\t  ┃***┃***                                         ****┃***┃\n");
	printf("\t\t\t\t  ┃***┃************************************************┃***┃\n");
	printf("\t\t\t\t  ┃***┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛***┃\n");
	printf("\t\t\t\t  ┃********************************************************┃\n");
	printf("\t\t\t\t  ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n");
	printf("按回车键进入系统");
	getchar();
	int i;
	char a;
	do
	{
		system("cls");//主菜单
		printf(" \t\t\t\t\t\t            请 选 择          \n");
		printf("  \t\t\t\t\t\t ------------------------------   \n");
		printf("  \t\t\t\t\t\t ||                         ||    \n");
		printf("  \t\t\t\t\t\t ||     1. 学生信息录入     ||    \n");
		printf("  \t\t\t\t\t\t ||     2. 学生信息查询     ||    \n");
		printf("  \t\t\t\t\t\t ||     3. 学生信息更新     ||    \n");
		printf("  \t\t\t\t\t\t ||     4. 学生信息统计     ||    \n");
		printf("  \t\t\t\t\t\t ||     5. 学生信息输出     ||    \n");
		printf("  \t\t\t\t\t\t ||     6. 退出             ||    \n");
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
		default:printf("您的输入有误，只能输入1-6");
			break;
		}
		printf("还要继续操作学生信息吗？(Y/N)\n");
		scanf("%c", &a);
		system("pause");
	} while (a == 'Y' || a == 'y');
}
