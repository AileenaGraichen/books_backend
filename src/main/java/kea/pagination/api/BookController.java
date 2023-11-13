package kea.pagination.api;

import kea.pagination.entity.Book;
import kea.pagination.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public Page<Book> getAllBooks(Pageable pageable, @RequestParam(name = "author", required = false) String author) {
        System.out.println("pageable = " + pageable); //Add a breakpoint here, and investigate the pageable instance
        return bookService.getAllBooks(pageable, author);
    }

@GetMapping("/all")
public List<Book> getAllBooks() {
        return bookService.getBooks();
    }
}

