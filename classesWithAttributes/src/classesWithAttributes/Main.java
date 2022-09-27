package classesWithAttributes;

public class Main {

	public static void main(String[] args, int stockAmount, int id, String name, String description, String renk, int price) {
		Product product = new Product();
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());		
		

	}

}
