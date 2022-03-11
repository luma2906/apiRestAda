package com.example.apirestada.controllers;

import com.example.apirestada.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.apirestada.service.AnimalService;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping("/")
    public ResponseEntity<Iterable<Animal>> getAll() {
        return  ResponseEntity.status(HttpStatus.OK).body(animalService.getAll());
    }

    @PostMapping("/")
    public ResponseEntity<Animal> addAnimal(@RequestBody Animal animal) {
        return  ResponseEntity.status(HttpStatus.OK).body(animalService.save(animal));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Animal> updateAnimal(@PathVariable Long id,@RequestBody Animal animal) {
        return  ResponseEntity.status(HttpStatus.OK).body(animalService.update(id,animal));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteAnimal(@PathVariable Long id) {
        return  ResponseEntity.status(HttpStatus.OK).body(animalService.deleteById(id));
    }
}
