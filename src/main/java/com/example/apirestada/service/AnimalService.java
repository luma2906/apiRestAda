package com.example.apirestada.service;

import com.example.apirestada.entity.Animal;

import java.util.Optional;

public interface AnimalService {
    public Iterable<Animal> getAll();
    public Optional<Animal> getById(Long id);
    public Animal update(Long id, Animal animal);
    public Animal save(Animal animal);
    public boolean deleteById(Long id);
}
