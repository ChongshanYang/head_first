package test002Iterceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created by yanglc on 2017/2/1.
 * 通过实现Interceptor接口，重写String intercept(ActionInvocation invocation)方法自定义一个拦截器
 */
public class Iterceptor001 implements Interceptor{
    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("开始拦截");
        String result = actionInvocation.invoke();  //invoke()方法会把请求传递到下一个拦截器或者最终的action中
        System.out.println("结束拦截");
        return result;
    }
}
