package javadeneme;

import java.util.Random;
import java.util.Scanner;

public class mayintarlasi {

	int rownumber,colnumber,size;
	int[][] map;
	int[][] board;
	Random rand=new Random();
	Scanner scan=new Scanner(System.in);
	
	mayintarlasi(int rownumber,int  colnumber){
		this.colnumber=colnumber;
		this.rownumber=rownumber;
		this.map=new int[rownumber][colnumber];
		this.board=new int[rownumber][colnumber];
		this.size=rownumber*colnumber;
	}
	
	public void run() {
		preparegame();
		print(map);
		System.out.println("Oyun basladi");
	
	}
	
	public void preparegame() {
		int randrow,randcol,count=0;
		while(count!=(size/4)) {
			randrow=rand.nextInt(rownumber);
			randcol=rand.nextInt(colnumber);
			if (map[randrow][randcol]!=-1) {
				map[randrow][randcol]=-1;
				count++;
			}
		}
	}
	
	public void print(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]>=0) 
					System.out.print(" ");
					System.out.print(arr[i][j]+" ");
				
			
			}System.out.println();
		}	
	}
	
}
