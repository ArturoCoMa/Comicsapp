package com.example.Comicsapp;


import com.example.Comicsapp.model.Comic;

import java.util.ArrayList;
import java.util.Optional;

public interface ComicService {
    void saveComic(Comic comic);
    ArrayList<Comic> findAll();
    Optional<Comic> findById(Long id);
    Comic updateComic(Long id, Comic comic);
    void deleteComic(Long id);
}
