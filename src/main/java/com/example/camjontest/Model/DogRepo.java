package com.example.camjontest.Model;

import org.springframework.data.repository.CrudRepository;

public interface DogRepo extends CrudRepository<Dog, Long> {
}
