package test001Listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import test001Model.Dog;

public class DogContextListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext sc = event.getServletContext();  //通过event获取上下文
		String breed = sc.getInitParameter("breed");  //获取上下文初始化参数
		System.out.println("breed is :"+breed);
		Dog d= new Dog(breed);    //将上下文参数传递给实体类创建实例
		sc.setAttribute("dog", d);  //将实例对象放置到上下文属性中，servlet将可以获取这一属性	（属性可以使用set方法设置，但是参数parameter是不能这样设置的，必须在DD中配置）	
	}
	@Override
	public void contextDestroyed(ServletContextEvent event) {

	}



}
