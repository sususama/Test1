package edu.xatu;

import org.springframework.stereotype.Component;


@Component
public class PersonService {
    private PersonInterface person = (PersonInterface) new DynaProxy(new Person()).createProxy();

    public void service(){
        person.tanqin();

        person.lvyou();

        person.shangban();

    }
}
