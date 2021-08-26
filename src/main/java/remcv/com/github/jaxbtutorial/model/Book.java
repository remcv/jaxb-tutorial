package remcv.com.github.jaxbtutorial.model;

import jakarta.xml.bind.annotation.*;

import java.util.Date;

@XmlRootElement(name = "book")
@XmlType(propOrder = {"id", "name", "date"})
public class Book {

    // fields
    private Long id;
    private String name;
    private String author;
    private Date date;

    // constructors
    public Book(Long id, String name, String author, Date date) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.date = date;
    }

    public Book() {
        // leave empty
    }

    // methods - getters & setters
    public Long getId() {
        return id;
    }

    @XmlAttribute
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "title")
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    @XmlTransient
    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // methods - toString

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", date=" + date +
                '}';
    }

}
