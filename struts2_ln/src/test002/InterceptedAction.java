package test002;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by yanglc on 2017/2/1.
 * 这个action被设置了拦截器interceptor04，拦截器通过继承MethodFilterInterceptor类来实现，可以通过配置来灵活地拦截这个action中的不同方法
 */
public class InterceptedAction  extends ActionSupport{
    public String m1(){return "SUCCESS";}
    public String m2(){return "SUCCESS";}
    public String m3(){return "SUCCESS";}
}
