package first;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FirstServletServlet extends HttpServlet {
	int count=0;
	@Override
	public void init()
	{
		count++;
	}
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain,image/plain");
		resp.getWriter().println("Hello, world");
		resp.getWriter().println("total user="+count);
	}
}
