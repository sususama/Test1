package due;

import org.junit.Test;

public class 正则表达式 {
    @Test
    public void test1(){
        String regx="\\d{11}";//代表一个11位的数字
        String str="12324579831";//d为数字，D为非数字
        System.out.println(str.matches(regx));
        //matches就是验证str是否符合regx的正则表达式
    }
    @Test
    public void test2(){
        String regx="hello";//该规则代表仅匹配hello
        String str="hello";
        System.out.println(str.matches(regx));
    }
    @Test
    public void test3(){
        String regx="[a-zA-z0-9]ello";//[]代表只匹配方括号中的一个字符
        String str="6ello";
        System.out.println(str.matches(regx));
    }
    /*
    * //+为将前面的条件匹配一次到多次
    * //*为匹配0到多次
    *  //?是匹配0-1次
    * */
    @Test
    public void test4(){
//        String regx="[a-zA-z0-9]+";
        String regx="[a-zA-z0-9]*";
        String str="hello";
        System.out.println(str.matches(regx));
    }
    /*
    *{3}表示匹配三次
    *{3,}匹配三次以上
    * {3,5}匹配三到五次
    * */
    @Test
    public void test5(){
        String regx="[a-zA-z0-9]{3,5}";
        String str="heosdfb";
        System.out.println(str.matches(regx));
    }
    /*
     *排除符号^
     * */
    @Test
    public void test6(){
        String regx="[^0-9]{3}";
        String str="hel";
        System.out.println(str.matches(regx));
    }
    /*
 *简写
 * \d代表所有数字
 *\w代表所有字符[a-zA-Z0-9]
 * \s代表匹配任何空白字符，包括制表符，分页字符
 *    .表示任意字符
 * 大写即为不匹配
 *  */
    @Test
    public void test7(){
        String regx="\\d{3}";
        String str="234";
        System.out.println(str.matches(regx));
        regx=".{3}";
        str="s@3";
        System.out.println(str.matches(regx));
    }
    /*
     *转义符
     * \\代表一个\
     *\/代表一个/
     *  */
    @Test
    public void test8(){
        String regx="\\[\\]\\/\\.";//代表一个\
        String str="[]/.";
        System.out.println(str.matches(regx));
//        regx=".{3}";
//        str="s@3";
//        System.out.println(str.matches(regx));
    }
    /*
     *分组和或
     *()分组的意思
     * */
    @Test
    public void test9(){
        String regx="(\\(0\\d{2}\\)|0\\d{2})( |\\-|\\_)\\d{10,11}";//代表一个\
        String str="(029)-23413594832";
        System.out.println(str.matches(regx));
    }
}
