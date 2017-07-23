package tw.mike.j2ee;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter(filterName="test",urlPatterns= {"/iii/*"})//  "/*"斜線 全部
public class MyFilter implements Filter{

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init");
	}
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("dofilter:befor");
		
		String user = arg0.getParameter("user");
		if (user != null && user.equals("brad")) {
			chain.doFilter(arg0, arg1);
		}
		System.out.println("dofilter:after");
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
		
	}

	

	

}
