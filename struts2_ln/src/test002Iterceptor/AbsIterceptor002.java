package test002Iterceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by yanglc on 2017/2/1.
 * 继承AbstractInterceptor抽象类，重写String intercept(ActionInvocation invocation)方法实现一个拦截器
 */
public class AbsIterceptor002 extends AbstractInterceptor{
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("AbstractIntorceptor开始拦截");
        String result = actionInvocation.invoke();
        System.out.println("AbstractIntorceptor结束拦截");
        return result;
    }
}
