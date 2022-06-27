package javadeneme;

public class siniflar {      
public String name;
public int id,point;
private static int counter=0;

siniflar(String name,int id, int point){
	this.name=name;
	this.id=id;
	this.point=point;
	siniflar.counter++;
}

public void exit() {
	siniflar.counter--;
}

public static int howstudent() {
	return siniflar.counter;
}

public static double calcoverall(int[] arr) {
	double overall=0;
	for(int i =0; i<arr.length;i++) {
		overall+=arr[i];
			} return overall/arr.length;
}

}
