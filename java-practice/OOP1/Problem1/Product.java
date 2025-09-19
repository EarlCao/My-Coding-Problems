public class Product {
    
    String productName;
    String productId;
    double price;
    String category;
    boolean inStock;

    // Master_Constructor
    public Product(String productName, String productId, double price, String category, boolean inStock){
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.category = category;
        this.inStock = inStock;
    }

    public Product(String productName, String productId, double price, String category){
        this(productName, productId, price, category, true);
    }

    public Product(String productName, String productId, double price){
        this(productName, productId, price, "General");
    }

    public Product(String productName, String productId){
        this(productName, productId, 0.0);
    }

    public Product(String productName){
        this(productName, "UNASSIGNED");
    }

    public void  displayInfo(){
        System.out.println("==== DISPLAY INFO ====");
        System.out.println("Product Name  : " + this.productName);
        System.out.println("Product Id    : " + this.productId);
        System.out.println("Product Price : " + this.price);
        System.out.println("Category      : " + this.category);
        System.out.println("In-Stock      : " + this.inStock);
    }

}
