package gameProject;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		
		Campaign indirim1 = new Campaign();
		indirim1.setId(1);
		indirim1.setName("Yaz Sonu");
		indirim1.setDiscount(20);
		Campaign indirim2 = new Campaign();
		indirim2.setId(2);
		indirim2.setName("Hafta Sonu");
		indirim2.setDiscount(10);
		Game game1=new Game();
		game1.setId(1);
		game1.setName("hades");
		game1.setPrice(100);
		game1.setDiscount(indirim2.getDiscount());		
		User user1=new User();
		user1.setId(1);
		user1.setFirstName("Ahmet Salih");
		user1.setLastName("Uçar");
		user1.setBirthDate(LocalDate.parse("1990-03-12"));
		user1.setTcNo("12345");
		User user2=new User();
		user2.setId(2);
		user2.setFirstName("Engin");
		user2.setLastName("Demiroð");
		user2.setBirthDate(LocalDate.parse("1985-11-12"));
		user2.setTcNo("456");
		UserManager userManager=new UserManager(new CheckUserManager());
		SellingManager selling=new SellingManager(new CampaignManager());
		CampaignManager campaingManager=new CampaignManager();
		campaingManager.add(indirim2);
		selling.buy(user1, game1, indirim2);
		userManager.add(user2);
		userManager.add(user1);
		
		
		
				

	}

}
