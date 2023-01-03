package ie.atu.productv2;

public class BookDB {

    public static Book getBook(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or datamyBookase
        // For now, this code just uses if/else statements
        // to return the correct product data

      
            Book myBook = new Book();
            if (productCode.equalsIgnoreCase("java")) {
                myBook.setCode(productCode);
                myBook.setDescription("GMIT Java Programming");
                myBook.setPrice(57.50);
                myBook.setAuthor("Joe Brown");
            } else if (productCode.equalsIgnoreCase("jsp")) {
                myBook.setCode(productCode);
                myBook.setDescription("Java Servlets and JSP");
                myBook.setPrice(57.50);
                myBook.setAuthor("Mike White");
            } else if (productCode.equalsIgnoreCase("mysql")) {
                myBook.setCode(productCode);
                myBook.setDescription("Lennon's MySQL");
                myBook.setPrice(54.50);
                myBook.setAuthor("Jim Lennon");
            }
          
        return myBook;
    }
}
