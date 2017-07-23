package tw.mike.j2ee;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Mytag2 extends SimpleTagSupport{
	StringWriter sw = new StringWriter();
	
@Override
public void doTag() throws JspException, IOException {
	super.doTag();
	
	JspContext js = getJspContext();
	JspWriter out = js.getOut();
	
	JspFragment body = getJspBody();
	body.invoke(sw);
	
	
	String messing = sw.toString();
	out.print("Hellow" +"," + messing.toUpperCase());//toUpperCase≈‹§jºg
}
}
