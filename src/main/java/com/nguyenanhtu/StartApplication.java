package com.nguyenanhtu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nguyenanhtu.Book;
import com.nguyenanhtu.BookRepository;


@SpringBootApplication
public class StartApplication { 

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabase(BookRepository repository) {
		return args -> {  
			repository.save(new Book("A Guide to the Bodhisattva Way of Life", "Santideva", new Long(12345)));
			repository.save(new Book("The Life-Changing Magic of Tidying Up", "Marie Kondo", new Long(6789)));
			repository.save(new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler", new Long(5555)));
		};
	}
}

