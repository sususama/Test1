#include <stdio.h>
#include <stdlib.h>
#define LENGTH 6
typedef int ElemType;

typedef struct HuffmanTreeNode{
    ElemType data;//节点的权值
    struct HuffmanTreeNode* left;
    struct HuffmanTreeNode* right;
}HuffmanTreeNode,*PtrHuffman;
//创建哈夫曼树
PtrHuffman createHuffmanTree(ElemType arr[]){
    PtrHuffman ptrArr[LENGTH];
    PtrHuffman ptr,pRoot=NULL;
    for (int i = 0; i < LENGTH; ++i) {//初始化结构体指针数组，数组中每一个元素为一个结构体指针类型
        ptr=(PtrHuffman)malloc(sizeof(HuffmanTreeNode));
        ptr->data=arr[i];//把节点的全指存入
        ptr->left=ptr->right=NULL;//将每个数的左右孩子都置空
        ptrArr[i]=ptr;//将树挨个放入一个数组
    }
    //进行循环，创建哈夫曼树
    for (int i = 1; i <LENGTH ; ++i) {
        //k1表示森林中权最小的树根节点的下标，k2为次最小的下标
        int k1=-1,k2;
        for (int j = 0; j < LENGTH; ++j) {
            if (ptrArr[j] != NULL && k1 == -1){//表示第一次创建
                k1 = j;
                continue;
        }
            if (ptrArr[j]!=NULL){
                k2=j;
                break;
            }
        }
        //将指针数组中最小的值的赋值给索引为k1的，次小的赋值给索引为k2的
        for (int j = k2; j < LENGTH; ++j) {
            if(ptrArr[j]!=NULL){
                if(ptrArr[j]->data<ptrArr[k1]->data){
                    k2=k1;
                    k1=j;
                } else if(ptrArr[j]->data<ptrArr[k2]->data)
                    k2=j;
            }
            //由最小权和次小权建立一颗新树，pRoot指向树根节点
            pRoot=(PtrHuffman)malloc(sizeof(PtrHuffman));
            pRoot->data=ptrArr[k1]->data+ptrArr[k2]->data;
            pRoot->left=ptrArr[k1];
            pRoot->right=ptrArr[k2];

            ptrArr[k1]=pRoot;
            ptrArr[k2]=NULL;
        }
        return pRoot;
    }
}
//计算哈夫曼树带权路径长度WPL
ElemType calculateWeightLength(PtrHuffman ptrTree,int len){
    if(ptrTree==NULL)
        return 0;
    else{
        if(ptrTree->left==NULL&&ptrTree->right==NULL){
            return ptrTree->data*len;
        } else{
            return calculateWeightLength(ptrTree->left,len+1)+calculateWeightLength(ptrTree->right,len+1);
        }
    }
}
//赫夫曼编码
void HuffmanCoding(PtrHuffman ptrTree,int len){
    static int arr[20];
    if(ptrTree!=NULL){
        if(ptrTree->left==NULL&&ptrTree->right==NULL){
            printf("节点权值%d的编码：",ptrTree->data);
            for (int i = 0; i < len; ++i) {
                printf("%d",arr[i]);
            }
            printf("\n");
        } else{
            arr[len]=0;
            HuffmanCoding(ptrTree->left,len+1);
            arr[len]=1;
            HuffmanCoding(ptrTree->right,len+1);
        }
    }
}
//打印孩子节点
void printHuffmanTreeChildNode(PtrHuffman node){
    if(node->left == NULL && node->right == NULL){
        printf("x=%d是哈夫曼树中的叶子节点",node->data);
        printf("\n\n");
        return;
    }
    if(node->left != NULL){
        printf("x=%d在哈夫曼树中的左孩子节点是lChild=%d",node->data,node->left->data);
        printf("\n");
    }
    if(node->right != NULL){
        printf("x=%d在哈夫曼树中的右孩子节点是rChild=%d",node->data,node->right->data);
        printf("\n");
    }
    printf("\n");
}
//中序打印
void midOrderPrintHuffmanTreeNode(PtrHuffman pRoot){
    if(pRoot==NULL){
        return;
    }else{
        midOrderPrintHuffmanTreeNode(pRoot->left);
        printf("%d ",pRoot->data);
        midOrderPrintHuffmanTreeNode(pRoot->right);
    }
}

//先序打印
void PreOrderPrintHuffmanTreeNode(PtrHuffman pRoot){
    if(pRoot==NULL){
        return;
    }else{
        printHuffmanTreeChildNode(pRoot); //依次打印哈夫曼树中各个节点的孩子节点
        PreOrderPrintHuffmanTreeNode(pRoot->left);
        PreOrderPrintHuffmanTreeNode(pRoot->right);
    }
}


int main() {
//    ElemType arr[] = {3,9,5,12,6,15};
//    PtrHuffman pRoot = createHuffmanTree(arr);  //返回指向哈夫曼树根节点的指针
//
//    printf("==========中序打印哈夫曼树节点数据==========\n");
//    midOrderPrintHuffmanTreeNode(pRoot);
//    printf("\n\n");
//
//    printf("==========先序打印哈夫曼树节点关系==========\n");
//    PreOrderPrintHuffmanTreeNode(pRoot);
//
//    printf("==========计算带权路径长度==========\n");
//    printf("WeightLength=%d\n",calculateWeightLength(pRoot,0));
//    printf("\n");
//
//    printf("==========各节点的哈夫曼树编码==========\n");
//    HuffmanCoding(pRoot,0);
while (5){
    printf("无效");
}
    return 0;
}
