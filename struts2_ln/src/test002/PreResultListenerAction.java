package test002;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;

/**
 * Created by yanglc on 2017/2/1.
 * 实现返回结果监听接口并给相应的自定义拦截器中调用其实现（invocation.addPreResultListener(new MyPreResultListener());），
 * 在action执行完excute()方法后，将result转发到前台结果页面之前，程序将会执行这里的beforeResult()方法
 */
public class PreResultListenerAction implements PreResultListener {
    @Override
    public void beforeResult(ActionInvocation actionInvocation, String s) {
        // System.out.println(invocation.getAction());
        // System.out.println(invocation.getResultCode());
        /**回调Action中的方法：
         * LoginAction lg = (LoginAction) invocation.getAction(); try {
         * lg.execute(); } catch (Exception e) { e.printStackTrace(); }
         */

        System.out.println("检验到PreResultListener被执行");

    }
}
