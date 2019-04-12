package dao;

import java.util.List;

import model.Book;

//data base crud operations
public interface BookDao {

    long save(Book book);

    Book get(long id);

    List<Book> list();

    void update(long id, Book book);

    void delete(long id);

}
