#include <stdio.h>
#include <stdlib.h>
typedef unsigned int TElemType;
typedef struct BiTNode{
    TElemType data;
    struct BiTNode *lchild,*rchild;//���Һ���ָ��
}BiTNode,*BiTree;
void CreateBiTree(BiTree *t){
    TElemType temp;
    printf("������һ������\n");
    scanf("%d",&temp);
    if (temp<=0){
        t=NULL;
        printf("�������\n");
        return;
    } else {
            *t = (BiTNode*) malloc(sizeof(BiTNode));
            (*t)->data = temp;
            printf("����������\n");
            (*t)->lchild = NULL;
            (*t)->rchild = NULL;
            CreateBiTree(&((*t)->lchild));//����������
            printf("����������\n");
            CreateBiTree(&((*t)->rchild));//����������
    }
    return;
}
//ǰ�����
void PreOrderTree(BiTree root) {
    if (root == NULL) {
        return;
    }
    printf("%d ", root->data);
    PreOrderTree(root->lchild);
    PreOrderTree(root->rchild);
}
//�������
void InOrderTree(BiTree root) {
    if (root == NULL) {
        return;
    }
    InOrderTree(root->lchild);
    printf("%d ", root->data);
    InOrderTree(root->rchild);
}
//�������
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
    printf("������������ֵ\n");
    CreateBiTree(&t);
    //ǰ�����
    printf("ǰ�����\n");
    PreOrderTree(t);
    printf("\n�������\n");
    InOrderTree(t);
    printf("\n�������\n");
    PostOrderTree(t);
    return 0;
}