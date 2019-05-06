package firstWeb;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;

public class HelloServlet implements Servlet{

	public void destroy() {
		System.out.println("destroy");
	}

	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig");
		return null;
	}

	public String getServletInfo() {
		System.out.println("getServletInfo");
		return null;
	}
	
	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("Init");
		
		String user = servletConfig.getInitParameter("user");
		System.out.println("user:" + user);
		Enumeration<String> names = servletConfig.getInitParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = servletConfig.getInitParameter(name);
			System.out.println("^^" + name + ":" + value );
		}
		String serlvetName = servletConfig.getServletName();
		System.out.println(serlvetName);
		
		
	}

		
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service");
	}
	public HelloServlet() {
		System.out.println("HelloServlet`s constructor");
	
	}
	
}