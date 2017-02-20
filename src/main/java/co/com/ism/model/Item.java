package co.com.ism.model;

/**
 * @author ian
 * Clase que encapsula la informacion de items de las partes de los programas
 * @param nombre
 * @param begin
 * @param end
 * @param tamanio
 */
public class Item {
	
	private String nombre;
	private int tamanio;
	
	/**
	 * @author ian
	 * El constructor de la clase solicita los parametros necesarios para calcular el tamño del Item
	 * @param nombre
	 * @param begin
	 * @param end
	 */
	public Item(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Item(){
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTamanio() {
		return tamanio;
	}
	
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}	
}
