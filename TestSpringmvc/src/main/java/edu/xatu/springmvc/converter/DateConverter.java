package edu.xatu.springmvc.converter;


import org.springframework.core.convert.converter.Converter;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateConverter implements Converter<String, Date> {
    public Date convert(String o) {
        SimpleDateFormat df=new SimpleDateFormat("yyyy年MM月dd日");
        Date d=null;
        try {
            d=df.parse(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return d;
    }
}
