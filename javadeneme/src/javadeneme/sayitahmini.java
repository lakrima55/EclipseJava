package javadeneme;


import java.util.Random;
import java.util.Scanner;

public class sayitahmini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int tahmin ,can=5,i=0;
Random rand=new Random();
Scanner scanner=new Scanner(System.in);
int sayi=rand.nextInt(100);
boolean oyundurum=false,hata=false;
int[] tahminler=new int[5];
System.out.println(sayi);
System.out.println("Sayı Tahmin Oyununa Hoşgeldiniz...");
System.out.println("0-99 arası bir sayı tutunuz");
while(can>0) {
	System.out.print("Tahmininiz:");	
	tahmin=scanner.nextInt();
	tahminler[i++]=tahmin;
	if((tahmin<0)||(tahmin>99)) {
	
		if (hata) {
			System.out.println("Çok fazla can kaybettiniz");
			System.out.println("kalan can"+ --can);
		}else {
			hata=true;
			System.out.println("Lütfen 0-99 arası sayı giriniz");
		}
		continue;
	}
	if (tahmin==sayi) {
		oyundurum=true;
		break;
	}else {
		System.out.println("Yanlış giriş "+ --can);
	}
	
}
	
if (oyundurum) {
	System.out.println("tebrikler");
	System.out.println("tebrikler"+sayi);
	System.out.println("tebrikler"+can);
	
}else {
	System.out.println("başaramadınız");
}
System.out.println("tahminleriniz:");
for(int value:tahminler) {
	if(value != 0)

System.out.println(value+" ,");}
	
}
}
