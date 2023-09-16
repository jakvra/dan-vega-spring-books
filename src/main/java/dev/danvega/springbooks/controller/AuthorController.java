package dev.danvega.springbooks.controller;

import dev.danvega.springbooks.model.Author;
import dev.danvega.springbooks.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorRepository authorRepository;

    @QueryMapping
    public List<Author> allAuthors() {
        return authorRepository.findAll();
    }

}
