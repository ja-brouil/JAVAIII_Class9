package hello.repositories;

import org.springframework.data.repository.CrudRepository;

import hello.models.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}