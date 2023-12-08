package lk.ijse;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    static {
        System.out.println("MyServlet class is loaded");
    }
    public MyServlet(){
        System.out.println("MyServlet() : constructor");
    }
    @Override
    public void init() throws ServletException {
        System.out.println("init() : method");
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init(ServeletConfig) : method");
        super.init(config);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet() : method");
    }
    @Override
    public void destroy(){
        System.out.println("destroy() : method");
    }
}
