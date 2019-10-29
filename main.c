# include <stdio.h>
# include <malloc.h>

typedef struct node
{
    int coef;							//系数
    int exp;							//指数
    struct node *next;					//指针域
}PolyNode,*Linklist;

PolyNode *head_a,*head_b,*head_c;

Linklist In_poly(Linklist R)				//输入多项式
{
    int e,c;
    PolyNode *p,*q;
    p = (PolyNode *)malloc(sizeof(PolyNode));
    R = p;
    while(scanf("%d%d",&c,&e) == 2)			//输入处理
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

Linklist Add_poly(Linklist A,Linklist B)		//多项式相加
{
    PolyNode *p,*q,*R,*r,*c;
    p = A;
    q = B;
    r = (PolyNode *)malloc(sizeof(PolyNode));
    R = r;
    while(p != NULL && q != NULL)				//核心算法
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
    while(p != NULL)							//当head_a 不为空
    {
        c = r;
        r -> coef = p -> coef;
        r -> exp = p -> exp;
        p = p -> next;
        r = (PolyNode *)malloc(sizeof(PolyNode));
        c -> next = r;
    }
    while(q != NULL)							//当head_b不为空
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

void Show_poly(Linklist R)						//输出处理
{
    PolyNode *r;
    r = R;
    printf("系数 -- 指数对\n");
    while(r != NULL)
    {
        printf("%d -- %d\n",r -> coef,r -> exp);
        r = r -> next;
    }
}

int main()
{
    printf("请输入第一个多项式，按照“系数，指数”的形式输入每一个子项.\n");
    head_a = In_poly(head_a);
    printf("请输入第二个多项式，按照“系数，指数”的形式输入每一个子项.\n");
    head_b = In_poly(head_b);
    head_c = Add_poly(head_a,head_b);
    Show_poly(head_c);
    return 0;
}