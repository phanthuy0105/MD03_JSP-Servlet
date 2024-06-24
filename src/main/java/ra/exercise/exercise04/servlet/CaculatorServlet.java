package ra.exercise.exercise04.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CaculatorServlet", value = "/CaculatorServlet")
public class CaculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //set request hỗ trợ UTF-8
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        //1. Lấy dữ liệu trên form
        float firstOperand = Float.parseFloat(request.getParameter("firstOperand"));
        float secondOrerand = Float.parseFloat(request.getParameter("secondOperand"));
        String operator = request.getParameter("operator");
        //2. Tính toán ra kết quả
        float result;
        String operatorStr;
        switch (operator) {
            case "Addition":
                result = firstOperand + secondOrerand;
                operatorStr = "+";
                break;
            case "Subtraction":
                result = firstOperand - secondOrerand;
                operatorStr = "-";
                break;
            case "Multiplication":
                result = firstOperand * secondOrerand;
                operatorStr = "x";
                break;
            case "Division":
                result = firstOperand / secondOrerand;
                operatorStr = ":";
                break;
            default:
                result = firstOperand % secondOrerand;
                operatorStr = "%";
                break;
        }

        //3. add result vào request
        request.setAttribute("result", result);
        request.setAttribute("firstOperand",firstOperand);
        request.setAttribute("secondOperand",secondOrerand);
        request.setAttribute("operator",operatorStr);
        //4. Chuyển sang trang hiển thị kết quả
        request.getRequestDispatcher("views/exercise04/display_calculate.jsp").forward(request, response);


    }
}