package test002;

import Dao.Person;
import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

import java.util.Map;

/**
 * Created by yanglc on 2017/2/6.
 * 自定义的类型转换器，继承DefaultTypeConverter类，实现convertValue()方法
 */
public class TypeConvert01 extends DefaultTypeConverter{
    @Override
    public Object convertValue(Map<String, Object> context, Object value, Class toType) {     //这是一个双向转换的方法
        if(toType==String.class){                    //将person类型转换成字符串
            Person p = (Person) value;
            return p.getSalary()+","+p.getAge();
        }
        else if(toType==Person.class){         //将字符串转化成person类型
            String params[] = (String[])value;//必须是字符串数组
            String[] values = params[0].split("//,");
            Person p = new Person();
            p.setAge(Integer.parseInt(values[1]));
            p.setSalary(Integer.parseInt(values[0]));
            return p;
        }
        return null;
    }
}
