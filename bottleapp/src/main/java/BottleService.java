package com.example.bottleapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BottleService {

    @Autowired
    private BottleRepository repo;

    public List<Bottle> getAll() {
        return repo.findAll();
    }

    public Bottle save(Bottle bottle) {
        return repo.save(bottle);
    }

    public Bottle update(Long id, Bottle bottle) {
        bottle.setId(id);
        return repo.save(bottle);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}