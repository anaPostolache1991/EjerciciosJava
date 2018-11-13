package ejerciciosCadena;

import java.util.Scanner;

public class ejercicios {
public ejercicios() {
	
}
public static void vocales1() {
	String palabra;
	int contA=0,contO=0,contU=0,contI=0,contE=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("introduce  palabra");
	palabra=sc.nextLine().toLowerCase();
	for(int i=0;i<palabra.length();i++) {
		char c=palabra.charAt(i);
	if(c==('a')||c=='á') {
		contA++;
	}else if(c==('o')||c=='ó') {
		contO++;
	}else if(c==('e')||c=='è') {
		contE++;
	}else if(c==('i')||c=='ì') {
		contI++;
	}else if(c==('u')||c=='ù') {
		contU++;
	}
	System.out.println();
	}
	
	
	
}
public static void vocales2() {
	String palabra=" ";
	int contU=0;
	int contA=0;
	int contE=0;
	int contO=0;
	int contI=0;
	for(int i=0;i<palabra.length();i++) {
	switch(palabra.charAt(i)) {
	case 'u':
	case 'ù' :
		contU++;
		break;
	
	case 'a':
	case 'à':
		contA++;
		break;
	case 'e':
	case 'è':
		contE++;
		break;
	case 'o':
	case 'ó':
		contO++;
		break;
	case 'i':
	case 'ì':
		contI++;
		break;
	}
	}
}
public static void vocales(String str) {
	int cont=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==('o')||str.charAt(i)==('a')||str.charAt(i)==('e')||str.charAt(i)==('i')) {
			cont++;
		}
		
	}
	System.out.println("la cadena tiene :"+cont+" vocales");
}
public static void cadenaInversa(String str) {
	
	for(int i=str.length()-1;i>=0;i--) {
		
		System.out.println(str.charAt(i));
		
	}
	
}


public static void ejer3() {
	
	Scanner sc=new Scanner(System.in);
	String s,s2;
	do{
		
	System.out.println(" introdice 1 cadena");
	s=sc.nextLine();
	}while(s.length()==0);
	do{
		System.out.println(" introdice 2 cadena");
	  s2=sc.nextLine();

	}while(s2.length()==0 || s2.length()>s.length());
	
   int i=-1,cont=0;
do {
	i=s.indexOf(s2,i+1);
	if(i>=0)
	cont++;

}while(i>=0);
System.err.println(" la segunda esta contenida "+cont+" veces en");
}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
vocales("aaad");
cadenaInversa("abc");
	}

}
