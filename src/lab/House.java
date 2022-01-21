package lab;

import java.util.ArrayList;

public class House {

	private int sqrft;
	private double baths;
	private int bedrooms;
	private int price;
	private String address;
	private double lotSize;
	private boolean hasPool;
	private String image;

	// Constructer
	public House(int sqrft, double baths, int bedrooms, int price, String address, double lotSize, boolean hasPool,
			String image) {
		this.sqrft = sqrft;
		this.baths = baths;
		this.bedrooms = bedrooms;
		this.price = price;
		this.address = address;
		this.lotSize = lotSize;
		this.hasPool = hasPool;
		this.image = image;

	}


		// TODO Auto-generated constructor stub
	

	// Getter Methods
	public int sqrft() {
		return sqrft;
	}

	public double baths() {
		return baths;
	}

	public int bedrooms() {
		return bedrooms;
	}

	public int price() {
		return price;
	}

	public String address() {
		return address;
	}

	public double lotSize() {
		return lotSize;
	}

	public boolean hasPool() {
		return hasPool;
	}

	public String image() {
		return image;
	}

	@Override

	// Override toString
	public String toString() {

		return sqrft + "\n" + baths + "\n" + bedrooms + "\n" + price + "\n" + address + "\n" + lotSize + "\n" + hasPool + "\n" + image + "\n";
	}
}