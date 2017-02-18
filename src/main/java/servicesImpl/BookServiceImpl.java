package servicesImpl;

import models.bindingModels.AddBookModel;
import models.viewModels.ViewBookModel;
import services.BookService;

import java.util.List;

public class BookServiceImpl implements BookService{
    @Override
    public void saveBook(AddBookModel addBookModel) {

    }

    @Override
    public List<ViewBookModel> getAllBooks() {
        return null;
    }

    @Override
    public ViewBookModel findBookByTitle(String title) {
        return null;
    }

    @Override
    public void deleteBookByTitle(String title) {

    }
}
