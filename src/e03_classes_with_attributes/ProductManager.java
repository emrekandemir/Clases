package e03_classes_with_attributes;

public class ProductManager {

    // metot Opereasyon barındıran class
    public void add(Product product){
        System.out.println("ProductManager'den geliyorum " + product.name);
    }
}
