package edu;
import java.util.Objects;
public class Student implements Comparable {
    private int id;
    private String name;
    private char sex;
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
    public Student(int id, String name, char sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                sex == student.sex &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, sex);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student){
            Student s=(Student)o;
            if (this.id>s.id){
                return -1;
            }else if (this.id<s.id){
                return 1;
            }else
                return 0;
        }throw new RuntimeException("类型不匹配，无法比较大小！");
//return 0  我自己等于传进来的对象
    }
}
//    public  boolean equals(Object o){
//        if(o instanceof  Student){
//            Student s=(Student) o;
//            if(s.id==this.id&&s.name.equals(this.name)&&s.sex==this.sex)
//                return true;
//        }
//        return false;
//    }
//    public int hashCode(){
//        new Integer(id).hashCode()+name.hashCode()+new Character(sex).charValue();
//    }
//}
