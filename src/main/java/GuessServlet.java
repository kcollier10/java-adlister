import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/guess/guessing.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int random = (int) Math.ceil(Math.random() * 5);
        int userEntry = Integer.parseInt(req.getParameter("entry"));
        if (userEntry == random) {
            res.sendRedirect("/correct");
        } else {
            res.sendRedirect("/incorrect");
        }
    }
}
