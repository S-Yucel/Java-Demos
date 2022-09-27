package classesWithAttributes;

public class Product {
	int id;
	String name;
	String description;
	double price;
	int stockAmount;
	String renk;
	String kod;

	
	//getter
	public int getId() {
	return id;
	}
	
	//setter
	public void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getKod() {
		return this.name.substring(0,1) + id;
	}

}
