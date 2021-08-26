package remcv.com.github.jaxbtutorial;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import remcv.com.github.jaxbtutorial.model.Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

public class App {

    // methods
    public static void main(String[] args) throws JAXBException {
        Book book1 = new Book(1L, "Morometii", "Marin Preda", null);
        Book book2 = new Book(2L, "Fundamentals of Neurology", "Mattle Mumenthaler", new Date());


        // marshal a Book instance
        marshalObject(book1, "./book1.xml");
        marshalObject(book2, "./book2.xml");
    }

    private static <T> void marshalObject(T object, String filePath) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(object, new File(filePath));
    }

}
