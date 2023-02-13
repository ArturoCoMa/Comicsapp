package com.example.Comicsapp.controller;

import com.example.Comicsapp.ComicRepository;
import com.example.Comicsapp.ComicServiceImp;
import com.example.Comicsapp.model.Comic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class WebController {
    @Autowired
    private ComicServiceImp csi;

    @PostMapping("/saveComic")
    public String saveComic(Comic comic) {
        csi.saveComic(comic);
        return "Creado con exito";
    }

    @GetMapping("/findAll")
    public ArrayList<Comic> findAll() {
        return csi.findAll();
    }

    @GetMapping("/findById/{id}")
    public Optional<Comic> findById(Long id) {
        return csi.findById(id);
    }

    @PutMapping("/updateComic/{id}")
    public Comic updateComic(@PathVariable Long id, Comic comic) {
        return csi.updateComic(id, comic);
    }

    @DeleteMapping("/deleteComic/{id}")
    public String deleteComic(@PathVariable Long id) {
        csi.deleteComic(id);
        return "Borrado con exito.";
    }
}
