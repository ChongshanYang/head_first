package test002;

import Dao.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by yanglc on 2017/1/13.
 */
public class LoginAction001 implements Action ,ModelDriven<User> {
    public LoginAction001() {
    }
    User user = new User();    //使用对象参数必须实现ModelDriven接口
    @Override
    public String execute() throws Exception {
        if(user.getPassword().equals("123")){
            return "SUCCESS";
        }else{
            return "FAILURE";
        }
    }

    @Override
    public User getModel() {
        return user;
    }
}
