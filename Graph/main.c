#include <stdio.h>

#define INFINITY 100        //最大值
#define MAX_VERTEX_NUM 20//最大顶点数
typedef enum {DG,DN,UDG,UDN} GraphKind;//有向图，有网图，无向图，无网图
typedef int VRType,InfoType;
typedef char VertexType;
typedef int Status;
int IncInfo;
typedef struct ArcCell{
    VRType adj;//是顶点关系类型。对无权图用0，1表示是否相邻；对带权图，则为权值类型

    InfoType *info; //
}ArcCell,AdjMatrix[MAX_VERTEX_NUM][MAX_VERTEX_NUM];
typedef struct {
    VertexType vexs[MAX_VERTEX_NUM];//顶点向量
    AdjMatrix arcs;//邻接矩阵
    int vexNum,arcNum;//当前顶点数和弧数
    GraphKind kind;//图的种类标记
}MGraph;

Status CreateUDN(MGraph *g) {
    return 0;
}

Status CreateUDG(MGraph *g) {
    scanf(&g->vexNum,&g->arcNum,&g->arcs);
    for (int i = 0; i < g->vexNum; ++i) {
        scanf(&g->vexs[i]);
    }
    return 0;
}
Status CreateGraph(MGraph *G){
    scanf(&G->kind);
    switch (G->kind){
        case DG:
            return NULL;//构建有向图
        case DN:
            return NULL;//构建有向网
        case UDG:
            return CreateUDG(G);//构建无向图
        case UDN:
            return CreateUDN(G);//构建无向网
        default:
            return 0;
    }
}


int main() {

    printf("%d",INFINITY);
    return 0;
}
