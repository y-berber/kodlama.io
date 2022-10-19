
public class ProductValidator3214 {
    static {
        System.out.println("Statik Yapıcı Çalıştı");
    }
    public static boolean isValid(Product89898 product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}