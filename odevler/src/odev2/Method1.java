package odev2;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        sayiBulmaca();
	}
	
	public static void sayiBulmaca() {
		
		int[] sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=6;
		boolean varMi=false;
		
		for (int i : sayilar) {
			if (i==aranacak) {
				varMi=true;
				break;
			}
		}
		String mesaj="";
		if(varMi) {
			mesaj="Sayý Mevcuttur"+aranacak;
			mesajVer(mesaj);
		}else {
			mesajVer("Sayý mevcut Deðildir : "+aranacak);
		}
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}