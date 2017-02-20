package co.com.ism.model;

import java.util.List;

/**
 * @author ian
 * Clase que encapsula la informacion de los programas
 * @param nombre
 * @param direccion
 * @param listaPartes
 * @param tamanio
 */
public class Programa {
	
	private String nombre;
	private int tamanio;
	private String direccion;
	private List<Parte> listaPartes;
		
	/**
	 * @author ian
	 * El constructor de la clase solicita los parametros necesarios para calcular el tamño del Programa
	 * @param nombre
	 * @param begin
	 * @param end
	 */
	public Programa(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	/**
	 * @author ian
	 * Metodo que calcula el tamaño del programa segun los datos dados en su identificacion
	 * @param nombre
	 * @param tamanio
	 */
	public void contarTamanio(){
		int count = 0;
		for(Parte iterator : listaPartes){
			iterator.contarTamanio();
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Parte> getListaPartes() {
		return listaPartes;
	}

	public void setListaPartes(List<Parte> listaPartes) {
		this.listaPartes = listaPartes;
	}
	
	
}
