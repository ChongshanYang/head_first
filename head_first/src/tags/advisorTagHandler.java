package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class advisorTagHandler extends SimpleTagSupport{    //这里需要继承simpleTagSupport类并重写doTag()方法才能成为一个标签类
	private String user;
	
	public void setUser(String user){
		this.user = user;
	}
	
	
	@Override
	public void doTag()throws JspException,IOException{
		getJspContext().getOut().write("你好"+user+"<br>");
		getJspContext().getOut().write("你的advice是"+getAdvice());
	}
	
	
	private String getAdvice(){       //自己的内部方法
		String[] advice = {"advice001","advice002","advice003"};
		int random = (int) (Math.random() * advice.length);
		return advice[random];
	}
}
