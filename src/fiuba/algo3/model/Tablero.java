/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;

/**
 *
 * @author Martin
 */
public class Tablero {
   
    private HashMap<Coordenada,Casillero> casilleros;
    
    public Tablero(int largo, int alto){
    	this.casilleros= new HashMap<Coordenada,Casillero>();
        for (int i=1; i<largo; i++) {
        	for (int j=1; j< alto ; j++){
        		casilleros.put(new Coordenada(i,j), new Casillero());
        	}
        }
    	/*for x in ancho{for y in largo{new Coordenada(x,y)}}? 
        o hago un método static de Coordenada que devuelva un List<Coordenada>
        List<Coordenada> coordenadas =/* O LO SACO DE ACA O LO SIGUIENTE VA EN UN FOR ANIDADO
        for (Coordenada coordenada : coordenadas){
            
        }*/
    }

    public void ubicarElemento(Algoformer algof1, Coordenada coord1) {
        this.casilleros.get(coord1).ubicarElemento(algof1);
    }
    
    public Object devolverElemeno(Coordenada coord){
    	return this.casilleros.get(coord).devolverElemento();
    }

	public void cambiar(Object ocupante, Coordenada origen, Coordenada destino) {
		Casillero casillero = this.casilleros.get(origen);
		//casillero.removerElemento();
		Casillero casillero2 = new Casillero();
		this.casilleros.put(origen, casillero2);
		casillero = this.casilleros.get(destino);
		casillero.ubicarElemento(ocupante);
		this.casilleros.put(destino, casillero);
		
		
	}
}
