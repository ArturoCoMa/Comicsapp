package com.example.Comicsapp;

import com.example.Comicsapp.model.Comic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ComicServiceImp implements ComicService{

    @Autowired
    private ComicRepository cr;

    @Override
    public void saveComic(Comic comic) {
        cr.save(comic);
    }

    @Override
    public ArrayList<Comic> findAll() {
        return (ArrayList<Comic>) cr.findAll();
    }

    @Override
    public Optional<Comic> findById(Long id) {
        return cr.findById(id);
    }

    @Override
    public Comic updateComic(Long id, Comic comic) {
        if(cr.findById(id)==null){
            cr.save(comic);
            return comic;
        }
        return null;
    }

    @Override
    public void deleteComic(Long id) {
        cr.deleteById(id);
    }
}
