package Assignments;

import java.util.Scanner;

public class MethodsSimpleCalc {

	 public static void main(String[] args) {
		
		 int n1=0;
		 
		 int n2=0;
		 
		 plus(n1, n2);
	}
	  
	  public static void plus(int n1,int n2){
		  
		Scanner input = new Scanner(System.in);
	     
	    n1=input.nextInt();
	    
	    System.out.println("enter second number:");
	    n2=input.nextInt();
	    
	    int result=n1+n2;
	  
	    System.out.println("result: "+result);
	    
	    input.close();
	  }
	  
	}