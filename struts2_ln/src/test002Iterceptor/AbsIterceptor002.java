package test002Iterceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import test002.PreResultListenerAction;

/**
 * Created by yanglc on 2017/2/1.
 * 继承AbstractInterceptor抽象类，重写String intercept(ActionInvocation invocation)方法实现一个拦截器
 */
public class AbsIterceptor002 extends AbstractInterceptor{
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        actionInvocation.addPreResultListener(new PreResultListenerAction(){});   //这里调用了定义好的result监听器，则配置了此拦截器的action在发送result前，会调用监听器中的beforeResult()方法！
        System.out.println("AbstractIntorceptor开始拦截");
        String result = actionInvocation.invoke();
        System.out.println("AbstractIntorceptor结束拦截");
        return result;
    }
}
