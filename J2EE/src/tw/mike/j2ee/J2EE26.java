package tw.mike.j2ee;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class J2EE26
 */
@WebServlet("/J2EE26")
public class J2EE26 extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("image/jpeg");
			
			String imgPath = getServletContext().getInitParameter("upload-path");
			
			File imgfile = new File(imgPath,"3.jpg");
			
			BufferedImage bimg = ImageIO.read(imgfile);
			Graphics2D g2d = bimg.createGraphics();
			
			
			//作畫
			
			Font font = new Font(null,Font.BOLD+Font.ITALIC, 40);
			
			AffineTransform tran = new AffineTransform();
			tran.rotate(Math.toRadians(45),100,0);
			Font newfont = font.deriveFont(tran);
			
			
			g2d.setFont(newfont);
			g2d.setColor(Color.BLUE);
			g2d.drawString("資策會", 100, 100);
			
			//Output 輸出到upload 會有一個圖片的產生
			OutputStream out = response.getOutputStream();
			File outfile = new File(imgPath,"test.jpg");
			ImageIO.write(bimg, "jpg", out);
			
			ImageIO.write(bimg, "jpg", outfile);
			
			out.flush();
			out.close();
	}

}
