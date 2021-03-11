package com.alijbara.anime;

import com.alijbara.anime.model.Book;
import com.alijbara.anime.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimeApplication {
	private static final Logger log = LoggerFactory.getLogger(AnimeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AnimeApplication.class, args);
	}
}
