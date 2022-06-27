package javadeneme;

public class sinifmain {
	
public static void main(String[] args) {

System.out.println("online ogrenci :" + siniflar.howstudent());	
siniflar s1=new siniflar("ali", 30, 30);
siniflar s2=new siniflar("veli", 30, 30);
siniflar s3=new siniflar("deli", 30, 30);
System.out.println("online ogrenci :" + siniflar.howstudent());	
s1.exit();
System.out.println("online ogrenci :" + siniflar.howstudent());	

int[] notlar=new int[3];
notlar[0]=s1.point;
notlar[1]=s2.point;
notlar[2]=s3.point;
System.out.println(siniflar.calcoverall(notlar));

}

}
