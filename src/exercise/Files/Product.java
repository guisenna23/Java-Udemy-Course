package exercise.Files;

public class Product {
	private String name;
	private Double price;
	private Integer quantity;
	private Double payValue;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Product(String name, Double price, Integer quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.payValue = quantity*price;
	}
	@Override
	public String toString() {
		return name + ","+ payValue.toString();
	}

	
	
}
