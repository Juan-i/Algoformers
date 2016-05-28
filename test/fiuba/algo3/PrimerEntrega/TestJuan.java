package PrimerEntrega;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import model.*;

public class TestJuan {
	@Test
	public void testSePuedeColocarUnTransformerEnUnCasillero(){
		String NOMBRE_ALGOF1 = "Autobot1";
        int ANCHO = 100, LARGO = 100, VIDA1 = 10, ATAQUE1 = 1, DISTANCIA_ATK1 = 2,VELOCIDAD_DESP1 = 10;
        int HORIZ1 = 10,VERT1 = 10;
        Coordenada coord1 = new Coordenada(HORIZ1,VERT1);
        Tablero tablero =  new Tablero(ANCHO,LARGO);
        EstadoAlgoFormer estadoHumanoide1 = new EstadoHumanoide(ATAQUE1,DISTANCIA_ATK1,VELOCIDAD_DESP1);
        ArrayList<EstadoAlgoFormer> estadosPosibles = new ArrayList<>();
        estadosPosibles.add(estadoHumanoide1);
        Algoformer algof1 = new AlgoformerGenerico(NOMBRE_ALGOF1,VIDA1,estadosPosibles);
        tablero.ubicarElemento(algof1,coord1);
        Assert.assertTrue(tablero.devolverElemeno(coord1)==algof1);
        
	}
	@Test
	public void AlgoformerSePuedeMoverUnCasillero(){
		String NOMBRE_ALGOF1 = "Autobot1";
        int ANCHO = 100, LARGO = 100, VIDA1 = 10, ATAQUE1 = 1, DISTANCIA_ATK1 = 2,VELOCIDAD_DESP1 = 10;
        int HORIZ1 = 10,VERT1 = 10;
        Coordenada coord1 = new Coordenada(HORIZ1,VERT1);
        Tablero tablero =  new Tablero(ANCHO,LARGO);
        EstadoAlgoFormer estadoHumanoide1 = new EstadoHumanoide(ATAQUE1,DISTANCIA_ATK1,VELOCIDAD_DESP1);
        ArrayList<EstadoAlgoFormer> estadosPosibles = new ArrayList<>();
        estadosPosibles.add(estadoHumanoide1);
        Algoformer algof1 = new AlgoformerGenerico(NOMBRE_ALGOF1,VIDA1,estadosPosibles);
        tablero.ubicarElemento(algof1,coord1);
        Assert.assertTrue(tablero.devolverElemeno(coord1)==algof1);
        algof1.mover(tablero, new Coordenada(10,10));
        Assert.assertTrue(algof1==tablero.devolverElemeno(new Coordenada(10,10)));
        
	}
}
