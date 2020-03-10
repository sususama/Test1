package edu;
public class Shixain1 implements Animals,Person,Shengwu{
    @Override
    public void eat(String s) {
        System.out.println("动物吃"+s);
    }
    @Override
    public void sex(String s) {
        System.out.println("性别为"+s);
    }
    @Override
    public void huxi() {
    }
    @Override
    public void sikao(String s) {
        System.out.println("人思考"+s);
    }
    @Override
    public void study(String s) {
        System.out.println("人学习"+s);
    }
}
