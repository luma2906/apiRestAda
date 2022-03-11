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

    @PostMapping("/")
    public ResponseEntity<Iterable<Animal>> getAll() {
        return  ResponseEntity.status(HttpStatus.OK).body(animalService.getAll());
    }

    @PostMapping("/create")
    public ResponseEntity<Animal> guardarAnimal(@RequestBody Animal animal) {
        return  ResponseEntity.status(HttpStatus.OK).body(animalService.save(animal));
    }

    @PostMapping("/update")
    public ResponseEntity<Animal> actualizarAnimal(@RequestBody Animal animal) {
        return  ResponseEntity.status(HttpStatus.OK).body(animalService.update(animal));
    }

    @PostMapping("/delete")
    public ResponseEntity<Boolean> eliminarAnimal(@RequestBody Animal animal) {
        return  ResponseEntity.status(HttpStatus.OK).body(animalService.deleteById(animal.getId()));
    }
}
