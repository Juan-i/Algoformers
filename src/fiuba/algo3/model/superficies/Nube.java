/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.superficies;

import model.algoformers.*;

/**
 *
 * @author Martin
 */
public class Nube extends EspacioAereo {

	public String nombre = "file:src/fotos/Terrenos/Nube.png";

	public Nube() {
		agregarRutaDeImagen(nombre);
	}

	@Override
	public int getPasos_alterno() {
		return EspacioAereo.CantidadMovimientosEstandarAereo;
	}

	@Override
	public void aplicarEfectosSuperficieAlgoformer(Algoformer a) {
		// No hace nada
	}

}
