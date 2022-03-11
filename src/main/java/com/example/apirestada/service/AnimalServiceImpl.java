package com.example.apirestada.service;

import com.example.apirestada.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.apirestada.repository.AnimalRepository;

@Service
public class AnimalServiceImpl implements AnimalService{
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public Iterable<Animal> getAll() {
        return animalRepository.findAll();
    }

    @Override
    public Animal update(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public Animal save(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public boolean deleteById(Long id) {
        animalRepository.deleteById(id);
        return true;
    }
}
