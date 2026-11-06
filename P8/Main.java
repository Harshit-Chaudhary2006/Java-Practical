class Product{
    String name;
    double price;
    int quantity;
    Product(){
        name = "Unknown";
        price = 0.0;
        quantity = 0;
    }
    Product(String name){
        this.name = name;
        price = 0.0;
        quantity = 0;
    }
    Product(String name, double price){
        this.name = name;
        this.price = price;
        quantity = 1;
    }
    Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    double calculateTotalCost(){
        return price * quantity;
    }
    void display(){
        System.out.println("Product Name: " + name);
        System.out.println("Price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: Rs. " + calculateTotalCost());
        System.out.println("--------------------------------");
    }
}
public class Construtor {
     public static void main(String[] args) {
        System.out.println("Construtor Overloading ");
        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mouse", 500);
        Product p4 = new Product("Keyboard", 1000, 2);
        System.out.println("Product 1:");
        p1.display();
        System.out.println("Product 2:");
        p2.display();
        System.out.println("Product 3:");
        p3.display();
        System.out.println("Product 4:");
        p4.display();
    }
}

