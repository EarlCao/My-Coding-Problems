public class Main {
    public static void main(String[] args) {
        
        Product p1 = new Product("Noodles");
        Product p2 = new Product("Noodles", "1234");
        Product p3 = new Product("Noodles", "1234", 15.0);
        Product p4 = new Product("Noodles", "1234", 15.0, "Food");
        Product p5 = new Product("Noodles", "1234", 15.0, "Food", true);

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
        p4.displayInfo();
        p5.displayInfo();

    }
}
