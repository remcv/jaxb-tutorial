package remcv.com.github.jaxbtutorial.model;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "buyer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Buyer {

    // fields
    @XmlAttribute
    private Long id;
    @XmlElement
    private String firstName;
    private String lastName;
    private Book book;

    // constructor
    public Buyer(long id, String firstName, String lastName, Book book) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.book = book;
    }

    public Buyer() {
        // leave empty
    }

    // methods
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    // methods - toString
    @Override
    public String toString() {
        return "Buyer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", book=" + book +
                '}';
    }

}
