
package ra.exercise.exercise05.servlet;

import ra.exercise.exercise05.entity.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //set request hỗ trợ UTF-8
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        List<Customer> listCustomers = new ArrayList<>();
        Customer cus1 = new Customer("Khách hàng 1", "1998-04-23", "Hà Nội", "images/avartar1.jpg");
        Customer cus2 = new Customer("Khách hàng 2", "1988-04-23", "Hồ Chí Minh", "images/avartar2.jpg");
        listCustomers.add(cus1);
        listCustomers.add(cus2);
        //set listCustomers vào request
        request.setAttribute("listCustomers",listCustomers);
        //Chuyển trang jsp để hiển thị
        request.getRequestDispatcher("views/exercise05/display_customer.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
