package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> findAll() {
		List<Book> books = bookRepository.findAll();
		return books;
	}

	@Override
	public Book findById(int theId) {
		return bookRepository.findById(theId).get();
	}

	@Override
	public void save(Book theBook) {
		bookRepository.save(theBook);

	}

	@Override
	public void deleteById(int theId) {
		bookRepository.deleteById(theId);

	}

	@Override
	public List<Book> searchBy(String name, String author) {
		List<Book> books = bookRepository.findByNameContainsAndAuthorContainsAllIgnoreCase(name, author);
		return books;
	}

}
