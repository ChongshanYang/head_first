package test002;

import Dao.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by yanglc on 2017/1/13.
 */
public class LoginAction001 implements Action ,ModelDriven<User> ,RequestAware,SessionAware {
    public LoginAction001() {
    }
    User user = new User();    //使用对象参数必须实现ModelDriven接口
    private Map request;
    private Map session;
    @Override
    public void setRequest(Map<String, Object> map) {
        request = map;
    }
    @Override
    public void setSession(Map<String, Object> map) {session = map;}   //获取session对象
    @Override
    public String execute() throws Exception {
        if(user.getPassword().equals("123")){
            session.put("user", user);     //只有在这里把用户信息保存到session对象中，之后的访问才能通过过滤器的验证
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
