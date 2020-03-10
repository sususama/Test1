package edu.xatu.test;

import edu.xatu.MyArrayListStack;
import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class DatasTest {
    public static void main(String[] args) {
        MyArrayListStack<String> list=new MyArrayListStack<>();
        Scanner in=new Scanner(System.in);
        System.out.println("请输入要输入的个数");
        int i=in.nextInt();
        boolean flag=true;
        for (int j=0;j<i;j++){
            String content=in.next();
            switch (content){
                case "(":
                    list.pop(content);
                    break;
                case "{":
                    list.pop(content);
                    break;
                case "[":
                    list.pop(content);
                    break;
                case ")":
                    if (list.inquire().equals("("))
                        list.push();
                    else
                        flag=false;
                    break;
                case "}":
                    if (list.inquire().equals("{"))
                        list.push();
                    else
                        flag=false;
                    break;
                case "]":
                    if (list.inquire().equals("["))
                        list.push();
                    else
                        flag=false;
                    break;
            }
            if (!flag) {
                System.out.println("匹配错误");
                break;
            }
        }
        if (flag)
            System.out.println("匹配成功");
    }
    @Test
    public void Test1(){
        MyArrayListStack<String> list=new MyArrayListStack<>();
        List<String> list1=new LinkedList<String>();
        list1.contains("");
        ArrayList<String> list2=new ArrayList<>();
        TreeSet<String> tree=new TreeSet<>();
    }

}
