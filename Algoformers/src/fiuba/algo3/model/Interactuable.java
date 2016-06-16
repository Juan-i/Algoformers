package model;

import model.superficies.*;

public interface Interactuable {

	public Casillero getUbicacion();

	public String getNombre();

	public boolean estaVivo();

	public void ubicarEn(Casillero casillero);
	
	public boolean fueUbicadoEn(Casillero casillero);

	public void aplicarseEfectosSuperficie(Superficie superficie);
}
