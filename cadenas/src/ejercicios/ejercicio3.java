package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	
	public ejercicio3() {
		
	}


	
	public static void cadena2() {
		String a="sveta";
		String b="sv ";
		char l=' ';
		char l2=' ';
		int cont=0;
		
		for(int i=0;i<a.length();i++) {
		l=a.charAt(i);	
		for(int j=0;j<b.length();j++) {
			l2=b.charAt(j);
			if(l==l2) {
				cont++;
			}	
		}
				
		}
		System.out.println(cont);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
cadena2();

}
	
}