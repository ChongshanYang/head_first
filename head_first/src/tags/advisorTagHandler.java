package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class advisorTagHandler extends SimpleTagSupport{
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
