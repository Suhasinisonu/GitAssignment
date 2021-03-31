package com.produitgate.vtiger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Swapping_EveryCharacter_In_String_In_An_Array {
public static void main(String[] args){
	ArrayList<String>  list = new ArrayList<String>();
	list.add("abc");
	list.add("bcd");
	list.add("cde");
	
	for(int i=0; i<list.size(); i++){
		String value = list.get(i);
		String rev = "";
		for(int j=0; j<value.length(); j++){
		rev =  value.charAt(j) + rev;
        }
		System.out.println(rev);
	}
	
}
}
