package test002;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by yanglc on 2017/1/19.
 * 与servlet相耦合的非IOC方式获取scope对象
 * 这种方式获取的为纯粹的Scope对象，它与容器相关，这些Scope对象操作性更强
 */
public class ScopeAction03 extends ActionSupport{
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
    HttpServletRequest request;
    HttpSession session;
    ServletContext application;
    @Override
    public String execute(){
        request = ServletActionContext.getRequest();     //这里，就是耦合了servlet了
        session = request.getSession();
        application = ServletActionContext.getServletContext();
        request.setAttribute("req",req);
        session.setAttribute("sess",sess);
        application.setAttribute("app",app);
        return SUCCESS;
    }
}
