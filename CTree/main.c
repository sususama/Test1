#include <stdio.h>
#include <stdlib.h>
typedef unsigned int TElemType;
typedef struct BiTNode{
    TElemType data;
    struct BiTNode *lchild,*rchild;//左右孩子指针
}BiTNode,*BiTree;
void CreateBiTree(BiTree *t){
    TElemType temp;
    printf("请输入一个数：\n");
    scanf("%d",&temp);
    if (temp<=0){
        t=NULL;
        printf("创建完成\n");
        return;
    } else {
            *t = (BiTNode*) malloc(sizeof(BiTNode));
            (*t)->data = temp;
            printf("建立左子树\n");
            (*t)->lchild = NULL;
            (*t)->rchild = NULL;
            CreateBiTree(&((*t)->lchild));//建立左子树
            printf("建立右子树\n");
            CreateBiTree(&((*t)->rchild));//建立右子树
    }
    return;
}
//前序输出
void PreOrderTree(BiTree root) {
    if (root == NULL) {
        return;
    }
    printf("%d ", root->data);
    PreOrderTree(root->lchild);
    PreOrderTree(root->rchild);
}
//中序输出
void InOrderTree(BiTree root) {
    if (root == NULL) {
        return;
    }
    InOrderTree(root->lchild);
    printf("%d ", root->data);
    InOrderTree(root->rchild);
}
//后序输出
void PostOrderTree(BiTree root) {
    if (root == NULL) {
        return;
    }
    PostOrderTree(root->lchild);
    PostOrderTree(root->rchild);
    printf("%d ", root->data);
}
int main() {
    BiTree t;
    printf("请输入树的数值\n");
    CreateBiTree(&t);
    //前序输出
    printf("前序输出\n");
    PreOrderTree(t);
    printf("\n中序输出\n");
    InOrderTree(t);
    printf("\n后序输出\n");
    PostOrderTree(t);
    return 0;
}