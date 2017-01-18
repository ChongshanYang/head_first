package test002;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by yanglc on 2017/1/18.
 */
public class ExceptionAction  extends ActionSupport{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    @Override
    public String execute() throws Exception{
        if(name.equals("exception")){
           throw new ClassNotFoundException("类未被找到");
        }else if(name.equals("global")){
            throw new Exception("全局异常");
        }else {
            return SUCCESS;
        }
    }
}
