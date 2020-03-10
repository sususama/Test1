package Collections;

public class Student /*implements Comparable*/{
    private int code;
    private  String name;
    private char sex;

    public Student(int code, String name, char sex) {
        this.code = code;
        this.name = name;
        this.sex = sex;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        if(o instanceof Student){
//            Student s=(Student)o;
//            if(this.code<s.code) return -1;
//            if (this.code>s.code) return 0;
//        }throw new RuntimeException("只能和学生类行的对象比较大小");
//    }
}
