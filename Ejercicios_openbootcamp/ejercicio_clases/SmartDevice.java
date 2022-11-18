package ejercicio_clases;

public class SmartDevice {
	
	//Atributos
	
	protected String fabricante;
	protected String modelo;
	protected int year;
	protected boolean watch;
	protected boolean phone;
	
	//Constructor vacio
	
	public SmartDevice() {
		
	}
	public SmartDevice(String fabricante, String modelo, int year, boolean watch, boolean phone) {
	
		this.fabricante = fabricante;
		this.modelo= modelo;
		this.year = year;
		this.watch = watch;
		this.phone= phone;
		}

}
