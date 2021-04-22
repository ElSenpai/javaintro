package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String internetSubeButonu="internet Þubeye Gir";
		double dolarDun=8.15;
		double dolarBugun=8.19;
		int vade =36;
		boolean dustuMu=false;
		
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
		
	}

}
