import java.io.*;
import javax.servlet.*;

public class hello extends GenericServlet {
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<html><body><h2>Call from servlet</h2><p>this is a paragraph</p></body></html>");
        pw.close();
    }


    
}