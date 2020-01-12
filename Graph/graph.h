//
// Created by 10236 on 2019/12/27.
//

#ifndef GRAPH_GRAPH_H
#define GRAPH_GRAPH_H

#endif //GRAPH_GRAPH_H
#include<stdio.h>
#include<malloc.h>
typedef char VertexType;        //顶点类型
typedef int EdgeType;            //权值类型
#define MAXVEX 100                //最大顶点数
#define INFINITY 65535            //无限大
#define TURE 1
#define FALSE 0
typedef int Boolean;
Boolean visited[MAXVEX];            //记录访问过的结点数组

#define MAXSIZE 100                            //队列最大空间
typedef int QElemType;                        //队列中元素类型
typedef int Status;                            //返回值类型
#define OK 1                                //操作成功
#define ERROR 0                                //操作失败

typedef struct                                //队列结点结构
{
    QElemType date[MAXSIZE];                //结点元素
    int front;                                //队头
    int rear;                                //队尾
}SqQueue;

/*队列的初始化*/
Status InitQue(SqQueue *Q)
{
    Q->front = 0;                            //队头指向0
    Q->rear = 0;                            //队尾指向0
    return OK;
}

/*队列的入队操作*/
Status EnQueue(SqQueue *Q, QElemType e)
{
    if((Q->rear + 1) % MAXSIZE == Q->front)                //判断队列是否已满
        return ERROR;
    Q->date[Q->rear] = e;                                //队尾赋值为e
    Q->rear = (Q->rear + 1) % MAXSIZE;                    //队尾后移
    return OK;
}

/*队列的出队操作*/
Status DeQueue(SqQueue *Q, QElemType *e)
{
    if(Q->front == Q->rear)                                //判断队列是否为空
        return ERROR;
    *e = Q->date[Q->front];                                //将队头元素取出
    Q->front = (Q->front + 1) % MAXSIZE;                //队头后移
    return OK;
}

/*获取队列的长度*/
int LengthQue(SqQueue Q)
{
    return (Q.rear - Q.front + MAXSIZE) % MAXSIZE;
}

//TODO 邻接矩阵结构体
typedef struct
{
    VertexType adList[MAXVEX];            //声明顶点数组
    EdgeType arc[MAXVEX][MAXVEX];        //声明权值数组
    int numVerexes,numEdges;            //顶点数，边数
}Graph;

//TODO 邻接表结构体
typedef struct EdgeNode{                //边表结构体
    int adjSub;                        //存储边表的下标
//    EdgeType weight;                //权重
    struct EdgeNode *next;            //指向下一个相邻顶点的指针
}EdgeNode;

typedef struct VertexNode{            //顶点结构体
    VertexType date;                //顶点内容
    EdgeNode *firstEdge;            //指向顶点第一个邻接点
}GraphList[MAXVEX];

typedef struct{                         //邻接表结构体
    GraphList graphList;                //顶点数组
    int numVerexes, numEdges;           //顶点数，边数
}AjaGraph;

//TODO 十字链表结构体
typedef struct Orthogonal            //边表结构体
{
    int tailVex;                    //当前顶点下标
    int headVex;                    //弧尾顶点下标
    struct Orthogonal *tailLink;    //指向入度弧的弧尾
    struct Orthogonal *headLink;    //指向出度弧的弧头
}Orthogonal;

typedef struct                        //顶点结构体
{
    VertexType date;                //顶点内容
    Orthogonal *firstIn;            //指向第一个弧头为自己的点
    Orthogonal *firstOut;            //指向第一个弧尾为自己的点
}Orthogonal_Node[MAXVEX];

typedef struct
{
    Orthogonal_Node orth_Node;        //声明结点数组
    int numVertexes,numEdges;        //顶点数量，边数量
}OrthGraph;                            //十字链表图结构

//TODO 边集数组结构体
typedef struct                        //边结构体
{
    int iVex;                        //顶点位置
    int jVex;                        //顶点位置
    EdgeType weight;                //权重
}EdgeArray[MAXVEX];

typedef struct                        //图结构体
{
    VertexType VexterList[MAXVEX];    //顶点数组
    EdgeArray EdgeList;                //边数组
    int numVexteres, numEdges;        //顶点数量，边数量
}EdgeListArray;                        //边集数组图结构

//TODO 邻接多重表
typedef struct EdgeList_multiple            //边表结点
{
    int iVex;                                    //当前顶点下标
    int jVex;                                    //终点下表
    struct EdgeList_multiple *iLink;                    //指向与顶点i有相同起点的结点
    struct EdgeList_multiple *jLink;                    //指向与顶点j有相同终点的结点
}EdgeList_multiple;

typedef struct
{
    VertexType date;                        //顶点数据
    EdgeList_multiple *firstEdge;            //指向顶点的第一个邻接点
}Vexs;

typedef struct
{
    Vexs vexs[MAXVEX];                                //建立顶点数组
    int numVexes;                            //顶点数量
    int numEdges;                            //边的数量
}MultipleGraph;

//TODO 邻接多重表创建图结构
int CreatGraphMultiple(MultipleGraph *G)
{
    int i,j,k;
    printf("请输入顶点数i与边的数量j：");
    scanf("%d,%d",&G->numVexes,&G->numEdges);
    EdgeList_multiple *em;
    getchar();
    for(i = 0; i < G->numVexes; i++)
    {
        printf("请输入第%d个顶点：",i);
        scanf("%c", &G->vexs[i].date);
        getchar();
    }
    for(k = 0; k < G->numEdges; k++)
    {
        printf("请输入边的起点i与终点j的下标：");
        scanf("%d,%d",&i,&j);
        em = (EdgeList_multiple *)malloc(sizeof(EdgeList_multiple));        //创建新结点空间
        em->iVex = i;
        em->jVex = j;
        em->iLink = G->vexs[i].firstEdge;
        G->vexs[i].firstEdge = em;
        em->jLink = G->vexs[j].firstEdge;
        G->vexs[j].firstEdge = em;
    }
    return 1;
}

//TODO 邻接矩阵创建图结构
int CreatGraph(Graph *G)
{
    int i,j,k,w;
    printf("请输入结点数i,边数j:");
    scanf("%d,%d",&G->numVerexes,&G->numEdges);        //写入顶点数和边数
    for(i = 0; i < G->numVerexes; i++)                    //初始化顶点数组
    {
        printf("请输入第%d个顶点：",i);
        scanf("%c",&G->adList[i]);
        getchar();
    }
    for(i = 0; i < G->numVerexes; i++)                    //初始化权值矩阵
        for(j = 0; j < G->numVerexes; j++)
            G->arc[i][j] = INFINITY;
    for(k = 0; k<G->numEdges; k++)                        //写入权值
    {
        printf("请输入需要添加权值的下标i和下标j,及其权值w：");
        scanf("%d,%d,%d", &i, &j, &w);
        G->arc[i][j] = w;
        G->arc[j][i] = G->arc[i][j];                    //无向图的对称性
    }
    return 1;
}

//TODO 邻接表创建图结构
int CreatAjaGraph(AjaGraph *G)
{
    int i, j, k;
    char a;
    EdgeNode *e;                                           //声明边表新结点
    printf("请输入顶点i和边数j：");
    scanf("%d, %d", &G->numVerexes, &G->numEdges);         //写入顶点数与边数
    getchar();
    for(i = 0; i < G->numVerexes; i++)                    //初始化顶点数组
    {
        printf("请输入第%d个结点：",i);
        scanf("%c",&G->graphList[i].date);
        getchar();
        printf("%c\n", a);
        G->graphList[i].firstEdge = NULL;                //顶点数组的指针域指向空
    }
    for(k = 0; k < G->numEdges; k++)                    //构建边表
    {
        printf("请输入邻接点Vi与Vj的下标：");
        scanf("%d,%d", &i, &j);
        e = (EdgeNode *)malloc(sizeof(EdgeNode));        //创建新结点空间
        e->adjSub = j;                                    //新结点的数据域为j
        e->next = G->graphList[i].firstEdge;            //新结点指针域指向顶点指针域
        G->graphList[i].firstEdge = e;                    //顶点指针域指向新结点

        e = (EdgeNode *)malloc(sizeof(EdgeNode));        //因为是无向图
        e->adjSub = i;                                    //同时为i操作
        e->next = G->graphList[j].firstEdge;
        G->graphList[j].firstEdge = e;
    }

    return 1;
}

//TODO 十字链表结构创建图结构
int CreatOrthGraph(OrthGraph *G)
{
    int i,j,k;
    Orthogonal *e;
    printf("请输入顶点数量i和边数量j：");
    scanf("%d,%d", &G->numVertexes, &G->numEdges);        //写入顶点数和边数
    for(i = 0; i < G->numVertexes; i++)                    //对顶点数组初始化
    {
        printf("请输入第%d个结点：",i);
        scanf("%c",&G->orth_Node[i].date);                    //输入顶点内容
        getchar();
        G->orth_Node[i].firstIn = NULL;                    //将入边表指向空
        G->orth_Node[i].firstOut = NULL;                //将出边表指向空
    }
    for(k = 0; k < G->numEdges; k++)                    //构建边表
    {
        printf("请输入起点i与终点j的下标：");
        scanf("%d,%d", &i, &j);
        e = (Orthogonal *)malloc(sizeof(Orthogonal));    //创建新结点空间
        e->tailVex = i;                                    //当前结点等于i
        e->headVex = j;                                    //弧尾等于j
        e->tailLink = G->orth_Node[i].firstOut;            //入度指针等于顶点入度指针
        G->orth_Node[i].firstOut = e;                    //顶点位置i的firstOut指向e
        e->headLink = G->orth_Node[j].firstIn;            //出度指针等于顶点出度指针
        G->orth_Node[j].firstIn = e;                    //顶点位置j的firstOut指向e
    }
    return 1;
}

//TODO 边集数组创建图结构
int CreatGraph1(EdgeListArray *G)
{
    int i, j, w;
    printf("请输入顶点数量i与边的数量j：");
    scanf("%d,%d", &G->numVexteres, &G->numEdges);        //写入顶点数量与边数量
    for(i = 0; i < G->numVexteres; i++)                    //构建顶点数组
    {
        printf("请输入第%d个结点：",i);
        scanf("%c",&G->VexterList[i]);
    }
    for(i = 0; i < G->numEdges; i++)                    //构建边数组
    {
        printf("请输入顶点i与顶点j及其权重w：");
        scanf("%d,%d", &i, &j, &w);
        G->EdgeList[i].iVex = i;                        //这里的i只是边数组的下标，与顶点数组无关
        G->EdgeList[i].jVex = j;
        G->EdgeList[i].weight = w;
    }
    return 1;
}

//TODO 遍历邻接矩阵结构
void PrintfGraph(Graph G)
{
    int i,j;
    for(i = 0; i < G.numVerexes; i++)
        for(j = 0; j < G.numVerexes; j++)
            if(G.arc[i][j] != INFINITY && i < j)
                printf("顶点：    %d    ，    %d,     权重：    %d\n", i, j, G.arc[i][j]);
}

//邻接表深度优先遍历
void PrintDeepthAjaGraph(AjaGraph G, int i)            //递归函数
{
    visited[i] = TURE;                                //将此顶点记为访问过
    printf("%c\n", G.graphList[i].date);            //打印当前顶点
    EdgeNode *ag;                                    //创建顶点指针
    ag = G.graphList[i].firstEdge;                    //将此指针赋值为当前顶点的边表第一个结点
    while(ag)                                        //只要ag不为空
    {
        if(!visited[ag->adjSub])                    //如果当前边表第一个结点不为空
            PrintDeepthAjaGraph(G, ag->adjSub);        //递归
        ag = ag->next;                                //否则ag赋值为ag的下一临结点
    }
}

void Depth_first(AjaGraph G)                //深度优先遍历函数
{
    int j;
    for(j = 0; j < G.numVerexes; j++)        //初始化记录数组
        visited[j] = FALSE;
    for(j = 0; j < G.numVerexes; j++)        //遍历顶点数组中的每一个顶点
    {
//        printf("当前结点是：%d, 其是否遍历过 %d\n", j, visited[j]);
        if(!visited[j])                        //如果当前结点没被访问过
            PrintDeepthAjaGraph(G, j);        //调用递归函数
    }
}

//TODO 邻接表广度优先搜索
void BFs(AjaGraph G)
{
    int j;
    SqQueue Q;            //创建队Q
    InitQue(&Q);        //初始化队列
    for(j = 0; j < G.numVerexes; j++)            //初始化记录数组
        visited[j] = FALSE;
    EdgeNode *ag;                                //创建边表指针
    visited[0] = TURE;                            //将第一个顶点记为访问过
    printf("%c\n", G.graphList[0].date);        //打印第一个顶点
    EnQueue(&Q, 0);                                //将第一个顶点入队
    while(Q.front != Q.rear)                    //只要队列不为空
    {
        DeQueue(&Q, &j);                        //将当前顶点出队
        ag = G.graphList[j].firstEdge;            //ag赋值为当前结点的第一个边表结点
        while(ag && !visited[ag->adjSub])        //ag不为空且ag未被访问过
        {
            visited[ag->adjSub] = TURE;            //将ag记为访问过
            printf("%c\n", G.graphList[ag->adjSub].date);    //打印ag
            EnQueue(&Q, ag->adjSub);            //将ag入队
            ag = ag->next;                        //ag赋值为ag的下一邻接表结点
        }
    }
}

void main()
{
    Graph G1;
    AjaGraph G2;
    OrthGraph G3;
    MultipleGraph G4;
    EdgeListArray G5;
    while(1)
    {
        int flag = 0;
        printf("请选择对图的操作：\n");
        printf("1.邻接矩阵存储创建\n");
        printf("2.邻接表存储创建\n");
        printf("3.十字链表存储创建\n");
        printf("4.邻接多重表创建\n");
        printf("5.边集数组创建\n");
        printf("6.遍历邻接矩阵图结构\n");
        printf("7.邻接表深度优先遍历\n");
        printf("8.遍历线索化二叉树\n");
        printf("9.退出\n");
        int a;
        scanf("%d", &a);
        switch(a)
        {
            case 1:
                flag = 0;
                flag = CreatGraph(&G1);
                if(flag)
                    printf("创建成功\n");
                else
                    printf("创建失败\n");
                break;
            case 2:
                flag = 0;
                flag = CreatAjaGraph(&G2);
                if(flag)
                    printf("创建成功\n");
                else
                    printf("创建失败\n");
                break;
            case 3:
                flag = 0;
                flag = CreatOrthGraph(&G3);
                if(flag)
                    printf("创建成功\n");
                else
                    printf("创建失败\n");
                break;
            case 4:
                flag = 0;
                flag = CreatGraphMultiple(&G4);
                if(flag)
                    printf("创建成功\n");
                else
                    printf("创建失败\n");
                break;
            case 5:
                flag = 0;
                CreatGraph1(&G5);
                if(flag)
                    printf("创建成功\n");
                else
                    printf("创建失败\n");
                break;
            case 6:
                PrintfGraph(G1);
                break;
            case 7:
                Depth_first(G2);
                break;
            case 8:
                BFs(G2);
                break;
            case 9:
                return;
            default:
                printf("选择错误\n");
                break;
        }
    }
}