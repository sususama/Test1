package due;

import org.junit.Test;

public class 正则表达式2 {
    /*
    * 测试电子邮件规则
    * 1.包含@符号
    * 2.@前有一个以上的单词
    * 3.@符号后有一个.
    * 4.@和.之间要有一个或多个字母   这里用()分类
    * 例子:12345434@qq.com.cc.cn   aa@asf.com.cn
    * */
    @Test
    public void test1(){
        String regx="\\w+\\@?\\w(\\.?\\w)+";
        String str="1234asd5@qq.com";
        System.out.println(str.matches(regx));
    }

}
