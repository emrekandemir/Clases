package e03_classes_with_attributes;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(); // product class'ını cağırıyoruz
        product.id = 1;
        product.name = "Laptop";
        product.description = "Lenovo";
        product.price = 1500.00;
        product.stockAmount = 3;

        System.out.println(product.name);

        ProductManager productManager = new ProductManager();
        productManager.add(product);

    }
}
