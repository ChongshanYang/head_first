package test002;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by yanglc on 2017/1/19.
 * 与servlet耦合的情况下使用IOC获取scope对象
 */
public class ScopeAction04 extends ActionSupport implements ServletRequestAware,ServletContextAware{
    HttpServletRequest request;
    HttpSession session;
    ServletContext application;

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        request = httpServletRequest;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        application = servletContext;
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
        request.setAttribute("req",req);
        session = request.getSession();
        session.setAttribute("sess",sess);
        application.setAttribute("app",app);
        return SUCCESS;
    }
}
