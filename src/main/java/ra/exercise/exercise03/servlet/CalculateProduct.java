package ra.exercise.exercise03.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalculateProduct", value = "/CalculateProduct")
public class CalculateProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //set request hỗ trợ UTF-8
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //1. Lấy dữ liệu từ client chuyển lên trong body của request
        String productName = request.getParameter("productName");
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));
        //2. Xử lý dữ liệu để tính tiền chiết khấu và giá sau khi chiết khấu
        float discountAmount = price * discountPercent / 100;
        float discountPrice = price - discountAmount;
        //3. set thông tin hiển thị vào request
        request.setAttribute("productName", productName);
        request.setAttribute("discountAmount", discountAmount);
        request.setAttribute("discountPrice", discountPrice);
        //4. Chuyển sang trang display-discount.jsp để hiển thị các thông tin
        request.getRequestDispatcher("views/exercise03/display_discount.jsp").forward(request, response);

    }
}