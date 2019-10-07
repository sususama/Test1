//
// Created by 10236 on 2019/10/6.
//

#include <stdio.h>
#include <stdlib.h>
#define S1 4
#define S2 7
typedef struct LinkList {
    int score;
    struct LinkList *next;
} List;

List *creat(int n){

   List *head, *node, *end;//定义头节点，普通节点，尾部节点；

    head = (List*)malloc(sizeof(List));//分配地址

    end = head;         //若是空链表则头尾节点一样

    for (int i = 0; i < n; i++) {

        node = (List*)malloc(sizeof(List));
        //输入链表的数
        printf("请输入链表的数字");
        scanf("%d", &node->score);

        end->next = node;

        end = node;

    }

    end->next = NULL;//结束创建

    return head;

}

List* merge(List *l1,List *l2){
    int i=0,j=0;
    List *next,*head,*end;
    head= (List*)malloc(sizeof(List));
    end=head;
    for (; i <S1 ; i++) {
        for (;j<S2;j++){
            if (l1->score<=l2->score){
                next->score=l1->score;
            } else{
                next->score=l2->score;
            }
            end->next=next;
            end=next;
        }
    }
    end->next=NULL;
    return head;

}
void ergodic(List *l3){
    while (l3->next!=NULL){
        l3=l3->next;
        printf("%d",l3->score);
    }
}
int main(){
    List *l1,*l2,*l3;
    l1=creat(S1);
    l2=creat(S2);
    l3=merge(l1,l2);
    ergodic(l3);

    return 0;
}
