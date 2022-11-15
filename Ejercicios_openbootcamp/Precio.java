package paquete_1;

public class Precio {

	public static void main(String[] args) {
		
		int resultado = precio(80);
		System.out.println(resultado);

	}
	static int precio(int a) {
	int iva = a % 21;
		return a + iva;
		
	}
	
	
}


