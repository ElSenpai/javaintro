package gameProject;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Yeni Kampanya eklendi / " +campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi / " +campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("kampanya silindi / " +campaign.getName());
		
	}

	@Override
	public void use(Campaign campaign) {
		System.out.println(campaign.getName()+" : Kampanyas� kullan�ld�");
		
	}

	

}
