package lesson_practice;

public class Laptop {
	
	private String name;
	
	private double price;
	
	public Laptop() {
		
	}

	public Laptop(String name, double price) {

		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String LaptopInfo() {
		
		return "Laptop: " + name + "\nprice: "+price;
		
	}
	
	

}
