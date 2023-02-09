package com.example.Comicsapp;

import com.example.Comicsapp.model.Comic;
import org.springframework.data.repository.CrudRepository;

public interface ComicRepository extends CrudRepository<Comic, Long> {
}
