# jaxb-tutorial

Learning resources and practice examples of Java Architecture for XML Binding (JAXB).

## Important notes

1. JAXB in `Java 11` vs `Java 8`  
   With Java releases <= 11, JAXB was part of the JDK and you could use it directly without any 
   additional libraries. As of Java 11, JAXB is not part of the JDK anymore, and you need to 
   add the relevant libraries via your dependency management system.
   
    *pom.xml*
    ```xml
    <dependency>
        <groupId>com.sun.xml.bind</groupId>
        <artifactId>jaxb-impl</artifactId>
        <version>2.3.3</version>
    </dependency>
    ```

## Resources

1. GitHub page of the `JAXB reference implementation` https://github.com/eclipse-ee4j/jaxb-api/.
2. JAXB `Oracle` tutorial https://docs.oracle.com/javase/tutorial/jaxb/intro/index.html.
3. JAXB with Java 11 tutorial by `vogella` https://www.vogella.com/tutorials/JAXB/article.html.
4. Simple JAXB tutorial by `javaguides.net` https://www.javaguides.net/2018/10/jaxb-tutorial.html.