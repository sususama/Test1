package Collections;
interface T{
    void t();
}
interface T1{
    int t(int a);
}
interface T2{
    int t(int a ,int b);
}
public class Test2 {
    public static void main(String[] args) {
//        T a=new T(){
//
//            @Override
//            public void t() {
//                System.put.p
//            }
//        };
        T a =()-> {
            System.out.println("Word");
            System.out.println("Hello");
        };
        a.t();
        T1 b=aa->{aa*=22;return aa;};
        System.out.println(b.t(33));
        T2 c=(ab,bb)->ab+bb;
        System.out.println(c.t(20,30));
    }


}
