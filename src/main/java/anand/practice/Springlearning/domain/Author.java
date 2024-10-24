package anand.practice.Springlearning.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Author {


    @Id
    @GeneratedValue
    private Long id;

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    private String  firstName;
    private String  lastName;
    @ManyToMany(mappedBy = "books")
    private Set<Book> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
