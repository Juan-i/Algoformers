package model;

public class BoneCrusher extends Algoformer {
	
	String nombre= "BoneCrusher";
	int vidaBoneCrusher= 200;
	int ataqueHumanoide= 30;
	int distanciaAtaqueHumanoide= 3;
	int velocidadHumanoide= 1;
	int ataqueAlterno= 30;
	int distanciaAtaqueAlterno= 3;
	int velocidadAlterno= 8;
	
	public BoneCrusher(){
		
		inicializarAlgoformer (nombre, vidaBoneCrusher, ataqueHumanoide, distanciaAtaqueHumanoide, velocidadHumanoide, ataqueAlterno, distanciaAtaqueAlterno, velocidadAlterno);
	}
}