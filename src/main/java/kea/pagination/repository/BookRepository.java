package kea.pagination.repository;

import kea.pagination.entity.Book;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

    //Page<Book> findByAuthorContainingIgnoreCase(String title, Pageable pageable);
    //Page<Book> findByAuthorLikeIgnoreCase(String title,Pageable pageable);

    Page<Book> findByAuthorContainingIgnoreCase(String title, Pageable pageable);


}
