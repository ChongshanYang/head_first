package test002;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by yanglc on 2017/1/17.
 */
public class CRUDAction extends ActionSupport{
    public String add(){
        System.out.println("add!");
        return SUCCESS;
    }
    public String delete(){
        return SUCCESS;
    }
    public String update(){
        return SUCCESS;
    }
    public String query(){
        return SUCCESS;
    }
}
