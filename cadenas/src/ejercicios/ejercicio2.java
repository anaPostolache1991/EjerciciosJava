package ejercicios;

public class ejercicio2 {
public ejercicio2() {
	
}
public static void cadenaInvertid(String str) {
	//String cadena="hola";
	String cadenaIn=" ";
	for(int i=str.length()-1;i>=0;i--) {
		cadenaIn=cadenaIn+str.charAt(i);
		
	}
	System.out.println(cadenaIn);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cadenaInvertid("hola");
	}

}
