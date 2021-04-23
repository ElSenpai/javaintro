package intro;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String internetSubeButonu="internet Þubeye Gir";
		double dolarDun=8.15;
		double dolarBugun=8.19;
		//int vade =36;
		//boolean dustuMu=false;
		
	  System.out.println(internetSubeButonu);
	  
	  if(dolarBugun<dolarDun) {
		  System.out.println("Dolar artýþ göstermedi");
	  }else if(dolarBugun>dolarDun) {
		  System.out.println("Dolar düþüþ gösterdi");
		  
	  }else {
		System.out.println("Dolar sabit");
	}
	  
	  String [] krediler = {"Hýzlý Kredi",
			  "Mutlu emekli kredisi",
			  "Konut kredisi",
			  "Çiftçi kredisi",
			  "Msb kredisi",
			  "Meb kredisi"};
	 for (int i = 0; i < krediler.length; i++) {
		System.out.println(krediler[i]);
	}
	 for (String kredi : krediler) {
		System.out.println(kredi);
	}
	 
	 int sayi1=10;
	 int sayi2=20;
	 sayi1=sayi2;
	 sayi2=200;
	 // sayi1 kaçtýr?
	 System.out.println(sayi1);
	  
	 int [] sayilar1= {1,2,3,4,5};
	 int [] sayilar2= {10,20,30,40,50};
	 sayilar1=sayilar2;
	 sayilar2[0]=300;
	 System.out.println(sayilar1[0]);
	 
	 String sehir1="Ankara";
	 String sehir2 ="Istanbul";
	 sehir1=sehir2;
	 sehir2="izmir";
	 System.out.println(sehir1);
		
	 // Ödev 3  ; 5-23 arasý uygulama
	 
	 int ogrenciSayisi=10;
	 String mesage="Öðrenci Sayýsý : ";
	 
	 System.out.println("ogrenci sayýsý : "+ ogrenciSayisi);
	 System.out.println(mesage+ ogrenciSayisi);
	 
	 
	int number=30;
	if (number<20) {
		System.out.println("Sayý 20 den küçüktür");
	}else if(number==20){
		System.out.println("Sayý 20 ye eþittir");
	}else {
		System.out.println("Sayý 20 den büyüktür");
	}
	
	int number1=30;
	int number2=235;
	int number3=555;
	int enBuyuk=number1;
	
	if (enBuyuk<number2) {
		enBuyuk=number2;
		
	}
	
	if (enBuyuk<number3) {
		enBuyuk=number3;
	}
	
	System.out.println("En Büyük Sayý : " +enBuyuk);
	
	
	char grade = 'B';
	
	switch (grade) {
	case 'A': 
	case 'B':	
		System.out.println("Mükemmel Geçtiniz");
		break;
	case'C':
		System.out.println("geçtiniz");
		break;
	case'D':
	case'F':
		System.out.println("D Kaldýnýz");
		break;
		default:
			System.out.println("geçersiz not girdiniz");
	
	}
	
	
	
	for (int i = 1; i <10; i++) {
	  System.out.println(i);
	}
	System.out.println("For Döngüsü bitti");
	int i =2;
	while (i<10) {
		System.out.println(i);
		i+=2;
	}
	System.out.println("while Döngüsü bitti");
	 
	
	
	
	
	}

}
