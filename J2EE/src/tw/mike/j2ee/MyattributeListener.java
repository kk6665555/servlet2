package tw.mike.j2ee;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class MyattributeListener implements ServletContextAttributeListener{

	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		String attributeName = arg0.getName();
		//String attributevalue = (String) arg0.getValue();
		System.out.println("add:"+ attributeName );
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		String attributeName = arg0.getName();
		//String attributevalue = (String) arg0.getValue();
		System.out.println("Removed:"+ attributeName );
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		String attributeName = arg0.getName();
		//String attributevalue = (String) arg0.getValue();
		System.out.println("Replaced:"+ attributeName );
	}

}
