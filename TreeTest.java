package edu.xatu.test;

import edu.xatu.MyArrayListStack;

import java.util.Scanner;

public class TreeTest {
    static class BinaryNode{
        Object element;
        BinaryNode left;
        BinaryNode right;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        MyArrayListStack<BinaryNode> lists=new MyArrayListStack<>();
        String rule="/+/-/*//+";
        for (int i=0;i<9;i++){
            String temp=in.nextLine();
            BinaryNode binaryNode=new BinaryNode();
            binaryNode.element=temp;
            if (temp.matches(rule)){
                //当输入符合正则表达式，将两棵树弹出，形成新的树
                binaryNode.right=lists.push();
                binaryNode.left=lists.push();
            }else {
                //当不符合正则表达式，将此字符当作新树压入栈中
                lists.pop(binaryNode);
            }
        }
        //遍历二叉树
    }

}
