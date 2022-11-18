package ejercicio_clases;
import ejercicio_clases.SmartDevice;


public class Main {

	public static void main(String[] args) {
		
		
		SmartDevice SamsungA20 = new SmartDevice("Samsung", "A20", 2019, false, true);
		System.out.println(SamsungA20.fabricante);
		System.out.println(SamsungA20.modelo);
		System.out.println(SamsungA20.year);
		System.out.println(SamsungA20.watch);
		System.out.println(SamsungA20.phone);
		SmartDevice NotebookHP = new SmartDevice("HP", "G7", 2018, false, false);
		System.out.println(NotebookHP.fabricante);
		System.out.println(NotebookHP.modelo);
		System.out.println(NotebookHP.year);
		System.out.println(NotebookHP.watch);
		System.out.println(NotebookHP.phone);
		
	}

}
