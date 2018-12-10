package org.arulsuju.springboot2.springboot.repo;

import org.arulsuju.springboot2.springboot.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post,Long> {
}
