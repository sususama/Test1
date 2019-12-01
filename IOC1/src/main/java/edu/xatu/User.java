package edu.xatu;

import javafx.beans.property.Property;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@AllArgsConstructor/*构造函数*/
@EqualsAndHashCode
@NoArgsConstructor
@Component("user")//放在数据类层
public class User {
    private int id;
    private String name;
    private int age;
    private String sex;
    private List<String> photos;
    private String[] friends;
    private Set<String> money;
    private Map<String,String> map;
    private Property<String> prop;
}
