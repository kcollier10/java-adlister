import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="OrderConfirmedServlet", urlPatterns = "/order-confirmed")
public class OrderConfirmedServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String address = req.getParameter("deliveryAddress");
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String size = req.getParameter("size");

        req.setAttribute("deliveryAddress", address);
        req.setAttribute("crust", crust);
        req.setAttribute("sauce", sauce);
        req.setAttribute("size", size);

        req.getRequestDispatcher("/pizza-app/confirm.jsp").forward(req, res);
    }
}
