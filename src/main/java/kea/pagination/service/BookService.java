package kea.pagination.service;

import kea.pagination.entity.Book;
import kea.pagination.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Page<Book> getAllBooks(Pageable pageable, String author) {
        if(author!=null) {
            Page<Book> page = bookRepository.findByAuthorContainingIgnoreCase(author, pageable);
            return page;
        } else{
            Page<Book> book = bookRepository.findAll(pageable);
            return book;
        }
    }
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
}

