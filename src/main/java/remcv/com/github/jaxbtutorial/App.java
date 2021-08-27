package remcv.com.github.jaxbtutorial;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import remcv.com.github.jaxbtutorial.model.Book;
import remcv.com.github.jaxbtutorial.model.Buyer;

import java.io.File;
import java.io.OutputStream;
import java.util.Date;

public class App {

    // methods
    public static void main(String[] args) throws JAXBException {
        Book book1 = new Book(1L, "Elementary statistics", "Mario Triola", new Date());
        Book book2 = new Book(2L, "Fundamentals of Neurology", "Mattle Mumenthaler", new Date());

        // marshal Book instances
        marshalObject(book1, new File("./book1.xml"));
        marshalObject(book2, System.out);

        // unmarshall a book xml
        Book unmarshalledBook = unmarshallBook(new File("./book1.xml"));
        System.out.println("\n" + unmarshalledBook);

        // marshal a Buyer instance
        marshalObject(new Buyer(32, "John", "Doe", book1), new File("./buyer.xml"));
    }

    // marshal an object to a file
    private static <T> void marshalObject(T object, File outputXmlFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(object, outputXmlFile);
    }

    // marshal an object to a Java IO output stream
    private static <T> void marshalObject(T object, OutputStream out) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(object, out);
    }

    // unmarshall XML -> Book
    private static Book unmarshallBook(File xmlFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Book book = (Book) unmarshaller.unmarshal(xmlFile);
        return book;
    }

}
