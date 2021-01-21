import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name="OrderConfirmedServlet", urlPatterns = "/order-confirmed")
public class OrderConfirmedServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String address = req.getParameter("deliveryAddress");
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String size = req.getParameter("size");
        List<String> meats;
        if (req.getParameterValues("meats") != null){
            meats = Arrays.asList(req.getParameterValues("meats"));
        } else {
            meats = Arrays.asList("n/a");
        }
        List<String> veggies;
        if (req.getParameterValues("veggies") != null){
            veggies = Arrays.asList(req.getParameterValues("veggies"));
        } else {
            veggies = Arrays.asList("n/a");
        }

        req.setAttribute("deliveryAddress", address);
        req.setAttribute("crust", crust);
        req.setAttribute("sauce", sauce);
        req.setAttribute("size", size);
        req.setAttribute("meats", meats);
        req.setAttribute("veggies", veggies);

        req.getRequestDispatcher("/pizza-app/confirm.jsp").forward(req, res);
    }
}
