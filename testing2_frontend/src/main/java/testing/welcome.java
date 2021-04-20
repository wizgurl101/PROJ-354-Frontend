/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import POJO.Customer;
import POJO.Order;
import POJO.Product;
import POJO.Report;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 612600
 */
@WebServlet(name = "welcome", urlPatterns = {"/welcome"})
public class welcome extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String page = request.getParameter("page");

        if (page == null || page.isBlank()) {
            // report daily screen testing 
//            ArrayList<Order> ol = new ArrayList<>();
//            Order order1 = new Order("Tuesday Feb 24, 2021", "One white", "Dairy-free", 0001);
//            ol.add(order1);
//            Order order2 = new Order("Tuesday Feb 24, 2021", "One salt", "", 0002);
//            ol.add(order2);
//            
//            request.setAttribute("dailyReportProductionList", ol);  
//            request.setAttribute("reportDate", "Tuesday February 23, 2021");
//            
//            request.getRequestDispatcher("WEB-INF/reportDailyScreen.jsp").forward(request, response);

            // report weekly screen testing
//            ArrayList<Report> weekList = new ArrayList<>();
//            Report report1 = new Report("2021-03-01", 10);
//            weekList.add(report1);
//            Report report2 = new Report("2021-03-01", 0);
//            weekList.add(report2);
//            Report report3 = new Report("2021-03-01", 5);
//            weekList.add(report3);
//            Report report4 = new Report("2021-03-01", 0);
//            weekList.add(report4);
//            Report report5 = new Report("2021-03-01", 8);
//            weekList.add(report5);
//            Report report6 = new Report("2021-03-01", 20);
//            weekList.add(report6);
//            Report report7 = new Report("2021-03-01", 20);
//            weekList.add(report7);
//            
//            request.setAttribute("reportDate", "Wednesday February 24, 2021");
//            request.setAttribute("startDate", "Monday Feb 22, 2021");
//            request.setAttribute("endDate", "Sunday Feb 28, 2021");
//            request.setAttribute("weekReportProductionList", weekList);
//            request.getRequestDispatcher("WEB-INF/reportWeeklyScreen.jsp").forward(request, response);
            //request.getRequestDispatcher("WEB-INF/deliveryScheduleScreen.jsp").forward(request, response);
            //request.getRequestDispatcher("WEB-INF/LoginScreen.jsp").forward(request, response);
            // monthly report screen testing
            ArrayList<Report> monthList = new ArrayList<>();
            
            Report report1 = new Report("mon", "2021-02-01", 5);
            monthList.add(report1);
            
            Report report2 = new Report("tues", "2021-02-02", 10);
            monthList.add(report2);
            
            Report report3 = new Report("wed", "2021-02-03", 5);
            monthList.add(report3);
            
            Report report4 = new Report("thurs", "2021-02-04", 5);
            monthList.add(report4);
            
            Report report5 = new Report("fri", "2021-02-05", 8);
            monthList.add(report5);
            
            Report report6 = new Report("sat", "2021-02-06", 15);
            monthList.add(report6);
            
            Report report7 = new Report("sun", "2021-02-07", 8);
            monthList.add(report7);
            
            Report report8 = new Report("mon", "2021-02-08", 5);
            monthList.add(report8);
            
            Report report9 = new Report("tues", "2021-02-09", 10);
            monthList.add(report9);
            
            Report report10 = new Report("wed", "2021-02-10", 5);
            monthList.add(report10);
            
            Report report11 = new Report("thurs", "2021-02-11", 5);
            monthList.add(report11);
            
            Report report12 = new Report("fri", "2021-02-12", 8);
            monthList.add(report12);
            
            Report report13 = new Report("sat", "2021-02-13", 15);
            monthList.add(report13);
            
            Report report14 = new Report("sun", "2021-02-14", 8);
            monthList.add(report14);
            
            Report report15 = new Report("mon", "2021-02-15", 0);
            monthList.add(report15);
            
            Report report16 = new Report("tues", "2021-02-16", 10);
            monthList.add(report16);
            
            Report report17 = new Report("wed", "2021-02-17", 5);
            monthList.add(report17);
            
            request.setAttribute("reportMonthDate", "March, 2021");
            request.setAttribute("monthReportProductionList", monthList);
            request.getRequestDispatcher("WEB-INF/reportMonthlyScreen.jsp").forward(request, response);
            // product screen testing
//            ArrayList<Product> productList = new ArrayList<>();
//            Product product1 = new Product(123, "White", 7.00, "1 white per week", "resources/images/noImage.jpg");
//            productList.add(product1);
//            
//            Product product2 = new Product(456, "Salt", 9.00, "2 salt alternating", "resources/images/noImage.jpg");
//            productList.add(product2);
//            
//            request.setAttribute("breadProductList", productList);
//            request.setAttribute("subscriptionProductList", productList);
//            request.getRequestDispatcher("WEB-INF/productScreen.jsp").forward(request, response);
            // product details screen
//            Product product1 = new Product(123, "White", 7.00, "1 white per week", "resources/images/noImage.jpg");
//            
//            request.setAttribute("product", product1);
//            request.getRequestDispatcher("WEB-INF/productDetailsScreen.jsp").forward(request, response);
            // client screen
//            ArrayList<Customer> customerList = new ArrayList<>();
//            Customer customer1 = new Customer(123, "Jelly", "Bean", "101 Fake Street", "1N1 A2A", "candy@land.com", "1234", 1111111111, "", 'A', 'S');
//            customerList.add(customer1);
//
//            Customer customer2 = new Customer(123, "Jelly", "Bean", "101 Fake Street", "1N1 A2A", "candy@land.com", "1234", 1111111111, "", 'A', 'S');
//            customerList.add(customer2);
//
//            request.setAttribute("customerList", customerList);
//            request.getRequestDispatcher("WEB-INF/clientScreen.jsp").forward(request, response);

            // customer details testing
//            Customer customer1 = new Customer(123, "Jelly", "Bean", "101 Fake Street", "1N1 A2A", "candy@land.com", "1234", 1111111111, "", 'A', 'S');
//            
//            request.setAttribute("customer", customer1);
//            request.getRequestDispatcher("WEB-INF/clientDetailsScreen.jsp").forward(request, response);
            
//            request.getRequestDispatcher("WEB-INF/orderDetailsScreen.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
