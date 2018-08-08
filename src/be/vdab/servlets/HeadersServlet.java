package be.vdab.servlets;

import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/headers.htm")
public class HeadersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW = "/WEB-INF/JSP/headers.jsp";
	//private static final Map<String, String> BROWSERS = new HashMap<>();
	
//	static {
//		BROWSERS.put("firefox", "Firefox");
//		BROWSERS.put("chrome", "Chrome");
//		BROWSERS.put("msie", "Internet Explorer");
//		BROWSERS.put("trident", "Internet Explorer");
//	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String userAgent = request.getHeader("user-agent").toLowerCase();
//		BROWSERS.entrySet().stream()
//			.filter(entry -> userAgent.contains(entry.getKey()))
//			.findFirst()
//			.ifPresent(browser -> request.setAttribute("browser", browser));
		
		Map<String, String> headers = new LinkedHashMap<>();
		Enumeration<String> headerNames = request.getHeaderNames();
		Collections.list(headerNames).forEach(name -> headers.put(name, request.getHeader(name)));
			
//		for (Enumeration<String> headerNames = request.getHeaderNames(); headerNames.hasMoreElements(); ) {
//			String headerName = headerNames.nextElement();
//			headers.put(headerName, request.getHeader(headerName));
//		}
		
		request.setAttribute("headers", headers);
		request.getRequestDispatcher(VIEW).forward(request, response);
	}

}
