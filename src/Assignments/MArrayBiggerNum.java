package Assignments;

import java.util.Scanner;

public class MArrayBiggerNum {
	public static void main(String[] args) {
		
		int biggest = arr[0][0];
	     //your code here 

	    return biggest ;
	  }//end bigger
	  
	  public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rwos
	    
	    //test bigger
	    int tbigger = bigger( arr);
	    System.out.println(tbigger);
	  }//end main

}
