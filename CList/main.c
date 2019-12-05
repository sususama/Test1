#include <stdio.h>
#include <stdlib.h>
#define STACK_INIT_SIZE 100
#define OK 1
#define  ERROR 0
typedef struct inn{
    int data[STACK_INIT_SIZE];
    int topIdx;
}SeqStack;
int InitStack(SeqStack *s){
    s->topIdx=-1;
    return OK;
}//创建一个空栈
int DestroyStack(SeqStack *s){
    if(s->topIdx==0)return OK;
    free(s->topIdx);
    return OK;
}//销毁栈
int ClearStack(SeqStack *s){
    s->topIdx=-1;
    return OK;
}//清空栈
int StackEmpty(SeqStack s){
    if(s.topIdx!=-1)
        return OK;
    else
        return ERROR;
}//判断是否为空栈
int StackLength(SeqStack s){
    return sizeof(s.data);
}//返回栈的长度
int GetTop(SeqStack s,int *e){
    if(s.topIdx!=0){
        e=s.data[sizeof(s.data)-1];
        return OK;
    } else//栈空
        return ERROR;
}//若栈不空啧用e返回栈顶元素和1
int Push(SeqStack *s, int e){
    if(s->topIdx>=(STACK_INIT_SIZE)){//超出容量
        return ERROR;
    }
    s->topIdx++;
    s->data[s->topIdx]=e;
}//将e放入栈顶
int POp(SeqStack *s,int *e){
    if(s->topIdx!=-1){
        e=s->data[s->topIdx];
        s->data[s->topIdx]=0;
        s->topIdx--;
        return OK;
    }
    return ERROR;
}//返回栈顶值并删除栈顶值
int StackTraverse(SeqStack s){
    for (int i=s.topIdx;i>=0;i--){
        printf("%d",s.data[i]);
    }
    return OK;
}//遍历每个节点
void LineEdit(){
    SeqStack *s;
    InitStack(s);
    char ch=getchar();
    int *c;
    while (ch!=EOF) {
        while (ch != EOF && ch != '\n') {
            switch (ch) {
                case '#':
                    POp(s, c);
                    break;
                case '@':
                    ClearStack(s);
                    break;
                default:
                    Push(s, ch);
                    break;
            }
            ch = getchar();
        }
        ClearStack(s);
        if(ch!=EOF)
            ch=getchar();
    }
    DestroyStack(s);

}
int main(){

    return 0;
}