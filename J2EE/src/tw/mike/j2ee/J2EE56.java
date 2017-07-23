package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.Response;



@WebServlet(urlPatterns="/J2EE56",asyncSupported=true)
public class J2EE56 extends HttpServlet {
	private ExecutorService execute=Executors.newFixedThreadPool(10);
	AsyncContext asyconContext;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		 asyconContext = request.startAsync();
		execute.submit(new AsyncRequest());
	}
	
	
	@Override
	public void destroy() {
		execute.shutdown();
		super.destroy();
	}
	
	private class AsyncRequest implements Runnable{
		@Override
		public void run() {
			try {
				Thread.sleep(2*1000);
				PrintWriter out =asyconContext.getResponse().getWriter();
				out.print("ok");
				asyconContext.complete();
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
	}
}
