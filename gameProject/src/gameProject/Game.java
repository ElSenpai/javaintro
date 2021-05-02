package gameProject;

public class Game {
	private int id;	
	private String name;
	private int price;
	private int discount;
	
	
	public Game() {
	
	}

	public Game(int id, String name, int price, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
		
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

	public int getPrice() {
		
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getPriceAfterDiscount() {
		return this.price-(this.price*this.discount/100);
	}
	
	

}
