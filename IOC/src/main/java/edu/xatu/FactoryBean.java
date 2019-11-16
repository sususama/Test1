package edu.xatu;

public class FactoryBean {
    public User createUser(){
        return new User();
    }
    public static User createStaticUser(){
        return new User();
    }
}
