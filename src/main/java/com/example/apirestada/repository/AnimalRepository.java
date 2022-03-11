package com.example.apirestada.repository;

import com.example.apirestada.entity.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {
}
