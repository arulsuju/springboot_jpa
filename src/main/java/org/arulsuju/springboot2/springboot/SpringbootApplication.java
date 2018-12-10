package org.arulsuju.springboot2.springboot;

import org.arulsuju.springboot2.springboot.model.Author;
import org.arulsuju.springboot2.springboot.model.Post;
import org.arulsuju.springboot2.springboot.repo.AuthorRepo;
import org.arulsuju.springboot2.springboot.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootApplication {
    @Autowired
    AuthorRepo authorRepo;
    @Autowired
    PostRepo postRepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    @PostConstruct
    public void loadData()
    {
        Author author=new Author("arul","suju","arulsuju@gmail.com");
        Post post=new Post("java","Welcome to Java","technical");

        authorRepo.save(author);
        post.setAuthor(author);
        postRepo.save(post);


        for(Post post1:postRepo.findAll())
        {
            System.out.println(post1.toString());
        }
    }
}
