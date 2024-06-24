package ra.exercise.exercise01.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "TimeServlet", value = "/TimeServlet")
public class TimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //set request hỗ trợ UTF-8
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //Lấy ngày giờ hiện tại của hệ thống
        LocalDate now = LocalDate.now();
        //add dữ liệu now vào request
        request.setAttribute("now",now);
        //Chuyển sang trang time.jsp
        request.getRequestDispatcher("views/exercise01/time.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}