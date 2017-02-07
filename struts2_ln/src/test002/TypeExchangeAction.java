package test002;

import Dao.Person;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by yanglc on 2017/2/6.
 * 使用struts2自带类型转换器转换类型示例action
 */
public class TypeExchangeAction extends ActionSupport{
    private String name;
    private int password;
    private Person p;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public String execute(){
        System.out.println(name);
        System.out.println(password);
        System.out.println(p.getAge());
        System.out.println(p.getSalary());
        return SUCCESS;
    }


}
