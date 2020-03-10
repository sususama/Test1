package 归并排序法;
import edu.Student;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class TestCollection {
//    @归并排序法
//    public void test1(){
//        List<Student> list=new ArrayList<>();
//
//        Collections已提交.sort(list,
//                (o1,o2)->{
//            if(o1 instanceof Student&&o2 instanceof Student){
//                Student s1=(Student)o1;
//                Student s2=(Student)o2;
//                if(s1.getId()>s2.getId()) return 1;
//                if(s1.getId()<s2.getId()) return -1;
//            }throw new RuntimeException("比较类型必须为Student类");
//        });
//    }
//    @归并排序法
//    public void test2(){
//        List<Integer> s=new ArrayList<>();
//        s.add(23);
//        s.add(27);
//        s.add(63);
//        s.add(43);
//        System.out.println(s);
//        Collections已提交.reverse(s);//倒叙
//        System.out.println(s);
//
//        Collections已提交.sort(s);//从小到大输出
//        System.out.println(s);
//        Collections已提交.shuffle(s);//随机打乱
//        System.out.println(s);
//        Collections已提交 .rotate(s,2);//将后面的n个旋转到前面去
//        System.out.println(s);
////        Collections已提交.binarySearch(s)
//// 二分查找
////        Collections已提交.disjoint()//判断两个集合有没有交集
//    }
    /**
     * 测试Collections
     * void reverse(List list)：反转
     *
     * void shuffle(List list),随机排序
     *
     * void sort(List list),按自然排序的升序排序
     *
     * void sort(List list, Comparator c);定制排序，由Comparator控制排序逻辑
     *
     * void swap(List list, int i , int j),交换两个索引位置的元素
     *
     * void rotate(List list, int distance),旋转。当distance为正数时，将list后distance个元素整体移到前面。当distance为负数时，将 list的前distance个元素整体移到后面。
     */
    @Test
    public void test3(){
        List s=new ArrayList();
        s.add(new Student(10001,"zhangsan",'M'));
        s.add(new Student(10006,"lisi",'M'));
        s.add(new Student(10003,"wangmazi",'M'));
        s.add(new Student(10056,"wangsi",'M'));
        s.add(new Student(10076,"liergou",'M'));
        s.add(new Student(100098,"wangxiaoming",'M'));
        Collections.sort(s);
        System.out.println(s);
    }

}
