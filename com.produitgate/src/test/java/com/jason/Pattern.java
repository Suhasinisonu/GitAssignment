package com.jason;

public class Pattern {
public static void main(String[] args){
	int space = 1;
	int star = 3;
	for(int j=0; j<3; j++){
	
		for(int i=1; i<=star; i++){
		System.out.print("*");
	}
	
	    System.out.println();
	
	for(int k=0; k<space; k++){
		System.out.print(" ");
	}
	
	
	space++;
	star--;
	}
	
}
}
