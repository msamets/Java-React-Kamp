package Entitites;

import java.util.ArrayList;
//86-93 arasýndan emin deðilim çalýþabilirliðini kontrol et.
public class Game {
	private int id;
	private String name;
	private String category;
	private String description;
	private double unitPrice;
	private int ageLimiter;
	private double rating;
	private ArrayList<String> platforms = new ArrayList<String>();
	
	public Game() {
		
	}

	public Game(int id, String name, String category, String description, double unitPrice, int ageLimiter,
			double rating, ArrayList<String> platforms) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.description = description;
		this.unitPrice = unitPrice;
		this.ageLimiter = ageLimiter;
		this.rating = rating;
		this.platforms = platforms;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getAgeLimiter() {
		return ageLimiter;
	}

	public void setAgeLimiter(int ageLimiter) {
		this.ageLimiter = ageLimiter;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public ArrayList<String> getPlatforms() {
		return platforms;
	}

	public void setPlatforms(ArrayList<String> platforms) {
		this.platforms = platforms;
	}

	
	
	
	
}
