package test002;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by yanglc on 2017/1/19.
 * 与servlet解耦和的IOC方式（依赖于struts框架来实现对象的实例化，依赖注入、控制反转）获取scope对象
 */
public class ScopeAction02 extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{
    private Map request;
    private Map session;
    private Map application;
    @Override
    public void setApplication(Map<String, Object> map) {
        application = map;
    }

    @Override
    public void setRequest(Map<String, Object> map) {
        request = map;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        session = map;
    }
    private String req;
    private String sess;
    private String app;

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }

    public String getSess() {
        return sess;
    }

    public void setSess(String sess) {
        this.sess = sess;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    @Override
    public String execute(){
        request.put("req",req);
        session.put("sess",sess);
        application.put("app",app);
        System.out.println("reqMap为："+request);
        return "success";
    }
}
