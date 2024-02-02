package ie.atu.productv4;

public class ProductDB {

    //  public static Book or Software getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data
    public static Product getProduct(String productCode) {

       Product myProduct = null;
        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct = myBook;
        }
        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }
        if (productCode.equalsIgnoreCase("pop")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Blinding Lights");
            myMusic.setPrice(30.00);
            myMusic.setLabel("Republic Records");
            myMusic.setArtist("the Weeknd");
            myProduct = myMusic;

        } else if (productCode.equalsIgnoreCase("HipHop")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Flashing Lights");
            myMusic.setPrice(40.00);
            myMusic.setLabel("Rock-A-Fella");
            myMusic.setArtist("Kanye West");
            myProduct = myMusic;
        } else if (productCode.equalsIgnoreCase("country")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("You Win Again");
            myMusic.setPrice(30.00);
            myMusic.setLabel("Castle Studio");
            myMusic.setArtist("Hank Williams");
            myProduct = myMusic;
        }
        if (productCode.equalsIgnoreCase("kdL43")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("SONY BRAVIA SMART TV KDL43WF663");
            myTv.setPrice(900.00);
            myTv.setManufacture("Sony");
            myTv.setScreenSize(55);
            myProduct = myTv;

        } else if (productCode.equalsIgnoreCase("LG")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("LG 32LM630BPLA");
            myTv.setPrice(200.00);
            myTv.setManufacture("LG");
            myTv.setScreenSize(32);
            myProduct = myTv;
        }

        return myProduct;

    }

}

