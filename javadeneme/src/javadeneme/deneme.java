package javadeneme;

import java.util.Scanner;


public class deneme {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int row,column;
		System.out.println("MAyin tarlasina hos geldiniz");
		System.out.println("Lutfen boyut giriniz");
//		System.out.println("Satir Sayisi:");
//		row=scan.nextInt();
//		System.out.println("sutun sayisi");
//		column=scan.nextInt();
		
		//mayintarlasi mayin=new mayintarlasi(row, column);
		
		mayintarlasi mayin=new mayintarlasi(5, 5);
		mayin.run();
		

				

	}

}
