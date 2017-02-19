package controllers;

import config.Config;
import models.viewModels.ViewBookModel;
import services.BookService;
import servicesImpl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/shelves")
public class ShelvesController extends HttpServlet{

    private BookService bookService;

    public ShelvesController() {
        this.bookService = new BookServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ViewBookModel> viewBookModels = this.bookService.getAllBooks();
        req.setAttribute(Config.VIEW_MODEL_LIST, viewBookModels);
        req.getRequestDispatcher("templates/shelves.jsp");
    }
}
