package remcv.com.github.jaxbtutorial;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import remcv.com.github.jaxbtutorial.model.Book;

import java.io.File;
import java.io.OutputStream;
import java.util.Date;

public class App {

    // methods
    public static void main(String[] args) throws JAXBException {
        Book book1 = new Book(1L, "Elementary statistics", "Mario Triola", new Date());
        Book book2 = new Book(2L, "Fundamentals of Neurology", "Mattle Mumenthaler", new Date());

        // marshal Book instances
        marshalObject(book1, "./book1.xml");
        marshalObject(book2, System.out);
    }

    // marshal an object to a file
    private static <T> void marshalObject(T object, String filePath) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(object, new File(filePath));
    }

    // marshal an object to a Java IO output stream
    private static <T> void marshalObject(T object, OutputStream out) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(object, out);
    }

}
