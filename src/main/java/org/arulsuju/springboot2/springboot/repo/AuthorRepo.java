package org.arulsuju.springboot2.springboot.repo;

import org.arulsuju.springboot2.springboot.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author,Long> {
}
