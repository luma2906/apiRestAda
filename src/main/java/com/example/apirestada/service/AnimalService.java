package com.example.apirestada.service;

import com.example.apirestada.entity.Animal;

public interface AnimalService {
    public Iterable<Animal> getAll();
    public Animal update(Animal animal);
    public Animal save(Animal animal);
    public boolean deleteById(Long id);
}
