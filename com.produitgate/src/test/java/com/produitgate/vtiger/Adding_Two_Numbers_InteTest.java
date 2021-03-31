package com.produitgate.vtiger;

public class Adding_Two_Numbers_InteTest {
public static void main(String[] args){
int no = 456;
int sum = 0;
int result = 0;

while(no!=0){
	int rem = no % 10;
	sum = sum + rem;
	no = no/10;
}

System.out.println(sum);
while(sum!=0){
	int rem1 = sum % 10;
	result = result + rem1;
	sum = sum/10;
	
}

if(result<10){
System.out.println(result);
}


}
}
 