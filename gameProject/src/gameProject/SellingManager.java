package gameProject;

public class SellingManager implements SellingService {

	private CampaignService campaign;
	
	public SellingManager(CampaignService campaign) {
		
		this.campaign = campaign;
	}

	@Override
	public void buy(User user,Game game,Campaign campa) {
		campaign.use(campa);
		System.out.println(game.getName()+" baþarýyla "+campa.getName()+" Kampanyasýyla alýndý // "+game.getPriceAfterDiscount()+" tl hesabýnýzdan düþüldü "+user.getFirstName() +" iyi oyunlar ");
		
		
	}

	@Override
	public void iade(User user,Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getName()+" - isimli oyun iade edildi / "+user.getFirstName() +" iyi günler ");
	}

}
