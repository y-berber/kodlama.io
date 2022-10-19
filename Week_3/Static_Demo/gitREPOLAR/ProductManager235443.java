
public class ProductManager235443 {
    public void add(Product89898 product){
        if(ProductValidator3214.isValid(product)){
            System.out.println("Eklendi.");
        }else{
            System.out.println("Ürün bilgileri geçersizdir.");
        }
    }
}