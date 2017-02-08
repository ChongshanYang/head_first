package test002;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

/**
 * Created by yanglc on 2017/2/8.
 * 这个action用于struts2校验器示例
 */
public class Validation01Action extends ActionSupport{
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String execute() throws Exception{
        return SUCCESS;
    }

}
