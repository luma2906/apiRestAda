package com.example.apirestada.service;

import com.example.apirestada.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.apirestada.repository.AnimalRepository;

import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService{
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public Iterable<Animal> getAll() {
        return animalRepository.findAll();
    }

    @Override
    public Optional<Animal> getById(Long id) {
        return animalRepository.findById(id);
    }

    @Override
    public Animal update(Long id, Animal saveAnimal) {
        return animalRepository.findById(id).map(animal -> {
                animal.setName(saveAnimal.getName());
                return animalRepository.save(animal);
            }).orElseGet(() -> {
                saveAnimal.setId(id);
                return animalRepository.save(saveAnimal);
            });
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
