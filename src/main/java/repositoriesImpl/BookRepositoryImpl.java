package repositoriesImpl;

import entities.Book;
import repositories.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository{

    private static BookRepositoryImpl bookRepository;

    private List<Book> books;

    private BookRepositoryImpl() {
        this.books = new ArrayList<>();
    }

    public static BookRepository getInstance() {
        if(bookRepository == null) {
            bookRepository = new BookRepositoryImpl();
        }

        return bookRepository;
    }

    //TODO: override methods below

    @Override
    public void saveBook(Book book) {
        this.bookRepository.saveBook(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public void deleteBookByTitle(String title) {
        this.bookRepository.deleteBookByTitle(title);
    }

    @Override
    public Book findBookByTitle(String title) {
        return null;
    }
}
