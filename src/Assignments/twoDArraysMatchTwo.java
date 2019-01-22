package Assignments;

import java.util.Scanner;

public class twoDArraysMatchTwo {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	   
		int rows = inp.nextInt();
		
		int cols = inp.nextInt();
	    
	    int[][] arr = new int[rows][cols];
	  
	    for(int i=0 ; i<=rows-1 ; i++)
	    {
	      for(int j=0 ; j<=cols-1 ; j++)
	      {
	        arr[i][j]=inp.nextInt();
	      }
	    }
	    
	    
	    
	    int matches = 0;
	    
	    System.out.print("matches: "+matches);

	}

}
