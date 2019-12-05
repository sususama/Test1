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
}//����һ����ջ
int DestroyStack(SeqStack *s){
    if(s->topIdx==0)return OK;
    free(s->topIdx);
    return OK;
}//����ջ
int ClearStack(SeqStack *s){
    s->topIdx=-1;
    return OK;
}//���ջ
int StackEmpty(SeqStack s){
    if(s.topIdx!=-1)
        return OK;
    else
        return ERROR;
}//�ж��Ƿ�Ϊ��ջ
int StackLength(SeqStack s){
    return sizeof(s.data);
}//����ջ�ĳ���
int GetTop(SeqStack s,int *e){
    if(s.topIdx!=0){
        e=s.data[sizeof(s.data)-1];
        return OK;
    } else//ջ��
        return ERROR;
}//��ջ��������e����ջ��Ԫ�غ�1
int Push(SeqStack *s, int e){
    if(s->topIdx>=(STACK_INIT_SIZE)){//��������
        return ERROR;
    }
    s->topIdx++;
    s->data[s->topIdx]=e;
}//��e����ջ��
int POp(SeqStack *s,int *e){
    if(s->topIdx!=-1){
        e=s->data[s->topIdx];
        s->data[s->topIdx]=0;
        s->topIdx--;
        return OK;
    }
    return ERROR;
}//����ջ��ֵ��ɾ��ջ��ֵ
int StackTraverse(SeqStack s){
    for (int i=s.topIdx;i>=0;i--){
        printf("%d",s.data[i]);
    }
    return OK;
}//����ÿ���ڵ�
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