package com.example.bottleapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BottleController {

    @Autowired
    private BottleService service;

    // ✅ TEST
    @GetMapping("/test")
    public String test() {
        return "Spring Boot is working ✅";
    }

    // ✅ GET all bottles
    @GetMapping("/bottles")
    public List<Bottle> getAll() {
        return service.getAll();
    }

    // ✅ POST create bottle
    @PostMapping("/bottle")
    public Bottle add(@RequestBody Bottle bottle) {
        return service.save(bottle);
    }

    // ✅ PUT update bottle
    @PutMapping("/bottle/{id}")
    public Bottle update(@PathVariable Long id, @RequestBody Bottle bottle) {
        return service.update(id, bottle);
    }

    // ✅ DELETE bottle
    @DeleteMapping("/bottle/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted successfully";
    }
}
