package tech.itpark.avito.controller;

import org.springframework.web.bind.annotation.*;
import tech.itpark.avito.domain.Flat;
import tech.itpark.avito.domain.FlatCreate;
import tech.itpark.avito.domain.FlatUpdate;
import tech.itpark.avito.manager.FlatManager;

import java.util.ArrayList;

@RestController
public class FlatController {
    private FlatManager manager = new FlatManager();

    @GetMapping("/flats")
    public ArrayList<Flat> getAll() {
        return manager.getAll();
    }

    @GetMapping("/flats/{id}")
    public Flat getById(@PathVariable long id) {
        return manager.getById(id);
    }

    @GetMapping("/flats/filter")
    public ArrayList<Flat> searchByPrice(@RequestParam int minPrice, @RequestParam int maxPrice) {
        return manager.searchByPrice(minPrice, maxPrice);
    }


    @PostMapping("/flats")
    public Flat create(@RequestBody FlatCreate dto) {
        return manager.register(dto);
    }

    @PutMapping("/flats/{id}")
    public Flat updateById(@PathVariable long id, @RequestBody FlatUpdate dto) {
        return manager.updateById(id, dto);
    }

    @DeleteMapping("/flats/{id}")
    public void removeById(@PathVariable long id) {
        manager.removeById(id);
    }

}


