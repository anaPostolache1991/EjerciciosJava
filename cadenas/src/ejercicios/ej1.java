package ejercicios;

import java.util.Scanner;

public class ej1 {

	public ej1() {
		
	}
	public static int  cadena(String str,char caracter) {
		int posision; int cont=0;
		///se busca la primera vez que aparece
		posision=str.indexOf(caracter);
		
		while(posision!=-1) {
			cont++;
			//se sigue buscando apartir de la pocicion siguente encontrada
			posision=str.indexOf(caracter,posision+1);
			
		}
		System.out.println(cont);
		return cont;
		
	}

	
	public static void vocales(String str) {
		int contA =0;
		
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'|| (str.charAt(i)=='o') || (str.charAt(i)=='u') || (str.charAt(i)=='i') ||(str.charAt(i)=='e')  ) {
				contA++;
				
		
			}
			
		}
		System.out.println(" la cadena tiene "+contA+ " vocales");
		//System.out.println(posision);
		//return posision;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//cadena("hala",'a');
vocales("iaalo");
	}

}
