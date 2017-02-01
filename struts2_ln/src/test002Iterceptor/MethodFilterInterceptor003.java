package test002Iterceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * Created by yanglc on 2017/2/1.
 * 继承MethodFilterInteceptor类，重写String doIntercept(ActionInvocation invocation) 方法实现一个拦截器
 */
public class MethodFilterInterceptor003 extends MethodFilterInterceptor{
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("MethodFilterInterceptor开始拦截");
        String result = actionInvocation.invoke();
        System.out.println("MethodFilterInterceptor结束拦截");
        return result;
    }
}
