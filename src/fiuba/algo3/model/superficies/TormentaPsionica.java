/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.superficies;

import model.algoformers.*;
import model.bonus.ModificadorPorcentualPermanente;
import model.bonus.StatModifier;

/**
 *
 * @author Martin
 */
public class TormentaPsionica extends EspacioAereo {

    private static int PORCENTAJE_DANIO = -40;

	@Override
	public int getPasos_alterno() {
		return EspacioAereo.CantidadMovimientosEstandarAereo;
	}
	
	public void aplicarEfectosSuperficieAlgoformer(Algoformer a){	
            StatModifier modificadorTormentaPsionica = new ModificadorPorcentualPermanente(PORCENTAJE_DANIO);
            a.getEstadoActual().agregarModificadorAtaque(modificadorTormentaPsionica);
	}

}
