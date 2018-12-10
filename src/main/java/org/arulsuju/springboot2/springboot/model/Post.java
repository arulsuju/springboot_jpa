package org.arulsuju.springboot2.springboot.model;

import javax.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long Id;
    @Column(name="postTitle")
    private String postTitle;
    @Column(name="postContent")
    private String postContent;
    @Column(name="postedBy")
    private String postedBy;

    @ManyToOne
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Post() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public Post(String postTitle, String postContent, String postedBy) {
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.postedBy = postedBy;
    }

    @Override
    public String toString() {
        return "Post{" +
                "Id=" + Id +
                ", postTitle='" + postTitle + '\'' +
                ", postContent='" + postContent + '\'' +
                ", postedBy='" + postedBy + '\'' +
                '}';
    }
}
