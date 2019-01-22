package Assignments;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class twoDArrayFindMax {

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
}//end for rows
	    
	    
	  int max[][]= {{0},{0}};
	  
	  for(int i=0; i< arr.length ; i++) {
	    
		  for(int j=0; j<arr[i][j] ; j++){
	      
	      max= arr[i][j];
	  }
	    
	  } 
	  System.out.println(max);
	  }

}// end main
