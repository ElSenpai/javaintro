package odevler.odev2;

public class Method2 {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		String yeniMesaj=sehirVer();
		int topla=topla(5,2);
		System.out.println(yeniMesaj);
		System.out.println(topla);
		mesaj.substring(0,2);
		System.out.println(mesaj.substring(0,2));
		int toplam=topla2(2,3,4,5,6);
		System.out.println(toplam);
		
		

	}
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void guncelle() {
		System.out.println("Guncellendi");
	}
	public static String sehirVer() {
	return "Kocaeli";	
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;	
		}
	public static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}

}
