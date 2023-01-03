package ie.atu.productv3;

public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = new Product();


        if (productCode.equalsIgnoreCase("java")) {
            p.setCode(productCode);
            p.setDescription("GMIT Java Programming");
            p.setPrice(57.50);
            //       p.setAuthor("Joe Brown");
        } else if (productCode.equalsIgnoreCase("jsp")) {
            p.setCode(productCode);
            p.setDescription("Java Servlets and JSP");
            p.setPrice(57.50);
            //       p.setAuthor("Mike White");
        } else if (productCode.equalsIgnoreCase("mysql")) {
            p.setCode(productCode);
            p.setDescription("Lennon's MySQL");
            p.setPrice(54.50);
            //         p.setAuthor("Jim Lennon");

        } else if (productCode.equalsIgnoreCase("studios")) {
            p.setCode(productCode);
            p.setDescription("Visual Studios");
            p.setPrice(57.50);
            //   p.setVersion("Microsoft 1.1");
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            p.setCode(productCode);
            p.setDescription("Build Java apps");
            p.setPrice(57.50);
            //  p.setVersion("Eclipse Neon");
        } else if (productCode.equalsIgnoreCase("oracle")) {
            p.setCode(productCode);
            p.setDescription("Latest MySQL");
            p.setPrice(54.50);
            // p.setVersion("Oracle 3.0");
        }


        return p;
    }
}

