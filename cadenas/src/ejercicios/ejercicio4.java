package ejercicios;

public class ejercicio4 {
	String dni="12345678L";
	public ejercicio4() {
		
	}
	public  void separar() {
		String digitos;
		String letra;
		if(dni.length()==9) {
		digitos=dni.substring(0,8);
		letra=dni.substring(dni.length()-1);
			System.out.println(digitos);
			System.out.println(letra);
		}else {
			System.out.println("dni incorecto");
		}
	}
	public void validar() {
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		String numero=dni.substring(0,8);
		char letra=dni.substring(dni.length()-1).charAt(0);
		int resto=Integer.parseInt(numero)%23;
		char letraCorecta=letras.charAt(resto);
		if(letra==letraCorecta) {
			System.err.println("corecto");
			
		}else {
			System.err.println("incorecto");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ejercicio4 e=new ejercicio4();
e.separar();

e.validar();
	}

}
