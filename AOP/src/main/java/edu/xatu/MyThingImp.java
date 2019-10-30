package edu.xatu;

import org.springframework.stereotype.Component;

@Component("myThing")
public class MyThingImp implements MyThing {

    @Override
    public void lvyou() {
        System.out.println("旅游");
    }
}
