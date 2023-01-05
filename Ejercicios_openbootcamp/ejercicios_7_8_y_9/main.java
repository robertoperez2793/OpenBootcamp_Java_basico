package ejercicios_7_8_y_9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("Esto es una cadena");
		String Arreglo [] = new String [5];
		Arreglo [0] = "Roberto";
		Arreglo [1] = "Jose";
		Arreglo [2] = "Patricio";
		Arreglo [3] = "Jazmin";
		Arreglo [4] = "Jesica";
		
		for(String nombres:Arreglo) {
			System.out.println(nombres);
		}
	int arrayBi [] [] = new int [2] [5];
		
		arrayBi [0] [0] = 10;
		arrayBi [0] [1] = 20;
		arrayBi [0] [2] = 30;
		arrayBi [0] [3] = 40;
		arrayBi [0] [4] = 50;
		
		
		arrayBi [1] [0] = 100;
		arrayBi [1] [1] = 200;
		arrayBi [1] [2] = 300;
		arrayBi [1] [3] = 400;
		arrayBi [1] [4] = 500;
		
		for (int i = 0; i < arrayBi.length; i++) {
			for (int j = 0; j <arrayBi[1].length; j++) {
				System.out.println("Estoy en I: " +i+"Estoy en J: "+j);
				System.out.println(arrayBi[i][j]);
			}
		}
		Vector <Integer> vector = new Vector();
		vector.add(50);
		vector.add(69);
		vector.add(88);
		vector.add(74);
		vector.add(63);
		vector.remove(2);
		vector.remove(3);
		
		System.out.println(vector);
		
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Mario");
		lista.add("Roberto");
		lista.add("Priscilla");
		lista.add("Alberto");
		
		LinkedList<String> listaEnlazada = new LinkedList<String>(lista);
		
		for(String nombres:lista) {
			System.out.println(nombres);
		}
		for(String nombres:listaEnlazada) {
			System.out.println(nombres);
		}
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		for(int i = 0; i < 11; i++) {
			
			
			listaNumeros.add(i);
			
		}
		for (int i = 0; i < listaNumeros.size(); i++) {
			listaNumeros.get(i);
			if(listaNumeros.get(i) % 2 == 0) {
				listaNumeros.remove(i);
			}
		}
		
		
	
		
		System.out.println(listaNumeros);
		DividirPorCero(10, 0);
	}
	
	public static String reverse(String texto) {
		String cadenaInvertida = "";
		for(int x = texto.length() - 1; x >= 0; x--) {
			cadenaInvertida = cadenaInvertida + texto.charAt(x);
		}
		return cadenaInvertida;
	}
	public static int DividirPorCero(int a, int b) {
		if(a == 0 || b == 0) {
			throw new ArithmeticException("Esto no puede hacerse");
		}
		else
			return a / b;
	}
	

}
