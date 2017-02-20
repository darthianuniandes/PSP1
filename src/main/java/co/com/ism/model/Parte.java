package co.com.ism.model;

import java.util.List;

/**
 * @author ian
 * Clase que encapsula la información de las partes de los programas
 * Para este ejercicio las partes seran Clases debido a que el lenguaje 
 * de los programas que se van a analizar es Java
 * @param nombre
 * @param tamanio
 * @param listaItems
 * @param direccion
 */
public class Parte {

	private String nombre;
	private int tamanio;
	private List<Item> listaItems;
	private String direccion;
	
	/**
	 * @author ian
	 * El constructor de la clase solicita los parametros necesarios para calcular el tamño de cada Parte
	 * @param nombre
	 * @param listaItems
	 */
	public Parte(String nombre, String direccion, List<Item> listaItems) {
		super();
		this.nombre = nombre;
		this.listaItems = listaItems;
		this.direccion = direccion;
	}
	
	/**
	 * @author ian
	 * Metodo que calcula el tamaño de la parte segun el tamaño de sus items
	 */
	public void contarTamanio(){
		int count = 0;
		for(Item iterator : listaItems){
			count = count + iterator.getTamanio();
		}
		tamanio = count;
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

	public List<Item> getListaItems() {
		return listaItems;
	}

	public void setListaItems(List<Item> listaItems) {
		this.listaItems = listaItems;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
