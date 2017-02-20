package co.com.ism.controller;

import co.com.ism.services.MainView;

/**
 * @author ian
 * Clase principal que se encarga de orquestar el comportamiento del servicio que realiza los calculos de la aplicacion 
 */
public class ControllerDemo {

	/**
	 * @author ian
	 * Declaracion del serivicio que sera el encargado de realizar todos los calculos 
	 */
	private static MainView mainView;

	/**
	 * @author ian
	 * El controlador recibe la informacion del usuario y llama los diferentes metodos del 
	 * serivicio para poder calcular el tamaño de todos los programas requeridos 
	 */
	public static void main(String[] args)  {
		mainView = new MainView();
		
		mainView.leerProgramas(args);
		
		mainView.contarProgramas();
		
		mainView.imprimirResultado();
	}
}