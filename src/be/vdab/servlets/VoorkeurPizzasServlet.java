package be.vdab.servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import be.vdab.repositories.PizzaRepository;

@WebServlet("/pizzas/voorkeuren.htm")
public class VoorkeurPizzasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW="/WEB-INF/JSP/voorkeurpizzas.jsp";
	private final transient PizzaRepository pizzaRepository = new PizzaRepository();
	
	@Resource(name = PizzaRepository.JNDI_NAME) 
	void setDataSource(DataSource dataSource) {
		pizzaRepository.setDataSource(dataSource); 
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("pizzas", pizzaRepository.findAll());
		if(request.getParameterValues("id") != null) {
			request.setAttribute("voorkeurPizzas", 
					Arrays.stream(request.getParameterValues("id"))
					.map(strId -> pizzaRepository.read(Long.parseLong(strId)))
					.filter(optionalPizza -> optionalPizza.isPresent())
					.map(optionalPizza -> optionalPizza.get())
					.collect(Collectors.toList()));
		}
		request.getRequestDispatcher(VIEW).forward(request, response);
	}

}
