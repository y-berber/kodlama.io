public class Main465 {
    public static void main(String[] args) {
        Product465 product = new Product465();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager465 productManager = new ProductManager465();
        productManager.add(product);
        System.out.println(product.getCode());
    }
}