package ra.exercise.exercise06.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Dictionary", value = "/Dictionary")
public class Dictionary extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //set request hỗ trợ UTF-8
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        Map<String, String> map = new HashMap<>();
        map.put("Hello", "Xin chào");
        map.put("Good Bye", "Chào tạm biệt");
        map.put("Thanks", "Cảm ơn");
        request.setAttribute("map", map);
        String search = request.getParameter("search");
        if (map.containsKey(search)) {
            String value = map.get(search);
            request.setAttribute("value", value);
            request.setAttribute("search", search);
            request.getRequestDispatcher("views/exercise06/display_dictionary.jsp").forward(request, response);
        } else {
            request.setAttribute("search", "error");
            request.getRequestDispatcher("views/exercise06/dictionary.jsp").forward(request, response);
        }
    }
}