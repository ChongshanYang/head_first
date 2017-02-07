package test002;

import Dao.Person;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by yanglc on 2017/2/6.
 */
public class TypeExchangeAction03 extends ActionSupport{
    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    private Person p;
    @Override
    public String execute() throws Exception{
        System.out.println("age: "+p.getAge());
        System.out.println("password: "+ p.getSalary());
        return SUCCESS;
    }
}
