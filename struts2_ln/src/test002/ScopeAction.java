package test002;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by yanglc on 2017/1/19.
 * 通过与servlet解耦和的非IOC方式来获取scope对象
 */
public class ScopeAction extends ActionSupport{
    private String name;
    private String req;
    private String sess;

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

    private String app;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    ActionContext context;   //这个是解耦和的关键
    Map request;
    Map session;
    Map application;
    @Override
    public String execute(){
        context = ActionContext.getContext();
        request = (Map) context.get("request");
        session =context.getSession();
        application = context.getApplication();

        request.put("req",req);
        session.put("sess",sess);
        application.put("app",app);
        return SUCCESS;
    }
}
