# include <stdio.h>
# include <malloc.h>

typedef struct node
{
    int coef;							//ϵ��
    int exp;							//ָ��
    struct node *next;					//ָ����
}PolyNode,*Linklist;

PolyNode *head_a,*head_b,*head_c;

Linklist In_poly(Linklist R)				//�������ʽ
{
    int e,c;
    PolyNode *p,*q;
    p = (PolyNode *)malloc(sizeof(PolyNode));
    R = p;
    while(scanf("%d%d",&c,&e) == 2)			//���봦��
    {
        if(!c && !e) break;
        q = p;
        p -> coef = c;
        p -> exp  = e;
        p = (PolyNode *)malloc(sizeof(PolyNode));
        q -> next = p;

    }
    q ->next = NULL;
    return R;
}

Linklist Add_poly(Linklist A,Linklist B)		//����ʽ���
{
    PolyNode *p,*q,*R,*r,*c;
    p = A;
    q = B;
    r = (PolyNode *)malloc(sizeof(PolyNode));
    R = r;
    while(p != NULL && q != NULL)				//�����㷨
    {
        c = r;

        if(p -> exp == q ->exp)
        {
            r -> coef = p -> coef +q -> coef;
            r -> exp = p -> exp;
            p = p -> next;
            q = q -> next;
        }
        else
        if(p -> exp < q ->exp)
        {
            r -> coef = p -> coef;
            r -> exp = p -> exp;
            p = p -> next;
        }
        else
        {
            r -> coef = q -> coef;
            r -> exp = q -> exp;
            q = q -> next;
        }
        r = (PolyNode *)malloc(sizeof(PolyNode));
        c -> next = r;
    }
    while(p != NULL)							//��head_a ��Ϊ��
    {
        c = r;
        r -> coef = p -> coef;
        r -> exp = p -> exp;
        p = p -> next;
        r = (PolyNode *)malloc(sizeof(PolyNode));
        c -> next = r;
    }
    while(q != NULL)							//��head_b��Ϊ��
    {
        c = r;
        r -> coef = q -> coef;
        r -> exp = q -> exp;
        q = q -> next;
        r = (PolyNode *)malloc(sizeof(PolyNode));
        c -> next = r;
    }
    c -> next = NULL;
    return R;
}

void Show_poly(Linklist R)						//�������
{
    PolyNode *r;
    r = R;
    printf("ϵ�� -- ָ����\n");
    while(r != NULL)
    {
        printf("%d -- %d\n",r -> coef,r -> exp);
        r = r -> next;
    }
}

int main()
{
    printf("�������һ������ʽ�����ա�ϵ����ָ��������ʽ����ÿһ������.\n");
    head_a = In_poly(head_a);
    printf("������ڶ�������ʽ�����ա�ϵ����ָ��������ʽ����ÿһ������.\n");
    head_b = In_poly(head_b);
    head_c = Add_poly(head_a,head_b);
    Show_poly(head_c);
    return 0;
}