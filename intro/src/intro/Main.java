package intro;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String internetSubeButonu="internet �ubeye Gir";
		double dolarDun=8.15;
		double dolarBugun=8.19;
		//int vade =36;
		//boolean dustuMu=false;
		
	  System.out.println(internetSubeButonu);
	  
	  if(dolarBugun<dolarDun) {
		  System.out.println("Dolar art�� g�stermedi");
	  }else if(dolarBugun>dolarDun) {
		  System.out.println("Dolar d���� g�sterdi");
		  
	  }else {
		System.out.println("Dolar sabit");
	}
	  
	  String [] krediler = {"H�zl� Kredi",
			  "Mutlu emekli kredisi",
			  "Konut kredisi",
			  "�ift�i kredisi",
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
	 // sayi1 ka�t�r?
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
		
	 // �dev 3  ; 5-23 aras� uygulama
	 
	 int ogrenciSayisi=10;
	 String mesage="��renci Say�s� : ";
	 
	 System.out.println("ogrenci say�s� : "+ ogrenciSayisi);
	 System.out.println(mesage+ ogrenciSayisi);
	 
	 
	int number=30;
	if (number<20) {
		System.out.println("Say� 20 den k���kt�r");
	}else if(number==20){
		System.out.println("Say� 20 ye e�ittir");
	}else {
		System.out.println("Say� 20 den b�y�kt�r");
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
	
	System.out.println("En B�y�k Say� : " +enBuyuk);
	
	
	char grade = 'B';
	
	switch (grade) {
	case 'A': 
	case 'B':	
		System.out.println("M�kemmel Ge�tiniz");
		break;
	case'C':
		System.out.println("ge�tiniz");
		break;
	case'D':
	case'F':
		System.out.println("D Kald�n�z");
		break;
		default:
			System.out.println("ge�ersiz not girdiniz");
	
	}
	
	
	
	for (int i = 1; i <10; i++) {
	  System.out.println(i);
	}
	System.out.println("For D�ng�s� bitti");
	int i =2;
	while (i<10) {
		System.out.println(i);
		i+=2;
	}
	System.out.println("while D�ng�s� bitti");
	 
	
	
	
	
	}

}
