/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;

import model.superficies.*;

/**
 *
 * @author Martin
 */
public class Tablero {

	public static final int LIMITEALTO = 10;
	public static final int LIMITELARGO = 15;
	private HashMap<Coordenada, Casillero> casilleros;
	private Juego JuegoActual;
	private static Tablero instancia = new Tablero();

	private Tablero() {

		this.casilleros = new HashMap<Coordenada, Casillero>();
		for (int i = 1; i <= Tablero.LIMITEALTO; i++) {
			for (int j = 1; j <= Tablero.LIMITELARGO; j++) {
				Casillero cas = new Casillero(new TerrenoRocoso());
				cas.setUbicacion(new Coordenada(j, i));
				casilleros.put(cas.getUbicacion(), cas);
			}
		}
	}

	public void ubicarElemento(Interactuable algof1, Coordenada coord1) {
		this.casilleros.get(coord1).ubicarElemento(algof1);
	}

	public Interactuable devolverElemento(Coordenada coord) {
		return this.casilleros.get(coord).devolverElemento();
	}

	public void cambiar(Interactuable ocupante, Casillero origen, Casillero destino) {

		origen.removerElemento();
		this.casilleros.put(origen.getUbicacion(), origen);
		destino.ubicarElemento(ocupante);
		this.casilleros.put(destino.getUbicacion(), destino);
	}

	public int devolverLargo() {
		return Tablero.LIMITELARGO; // A REFACTORIZAR
	}

	public int devolverAlto() {
		return Tablero.LIMITEALTO; // A REFACTORIZAR
	}

	public static Tablero getInstancia() {
		return instancia;
	}

	public Casillero devolverCasillero(Coordenada coordenada) {
		return casilleros.get(coordenada);
	}
	
	//este metodo lo hice para implementar el tearDown en las pruebas, me parece espantoso
	public void reiniciarTablero(){
		instancia= new Tablero();
	}

	public void agregarNotificable(Notificable n) {
		this.JuegoActual.agregarNotificable(n);
	}
	
	public void definirJuego(Juego juego){
		this.JuegoActual = juego;
	}
}
