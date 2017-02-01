package test002;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.annotations.After;
import com.opensymphony.xwork2.interceptor.annotations.Before;
import com.opensymphony.xwork2.interceptor.annotations.BeforeResult;

/**
 * Created by yanglc on 2017/2/1.
 */
public class AnnotationInterceptorAction extends ActionSupport {
    @Before
    public String myBefore() {
        System.out.println("调用myBefore方法");
        //return LOGIN;              //如果@Before方法的返回值不为空的话，其返回结果就是最后的结果，excute()方法将不会执行！
        return null;
    }
    @After
    public void myAfter() throws InterruptedException {
        Thread.sleep(5000);   //这里添加了延迟效果
        System.out.println("----调用myAfter方法");
    }
    @BeforeResult
    public void myBeforeResult() {
        System.out.println("----调用myBeforeResult方法");
    }
    public String execute() throws Exception {
        System.out.println("调用execute方法");
        return SUCCESS;
    }


}
