package com.upf.graducao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/carros")
public class CarroRecurso {
	//BANCO FAKE
	static private HashMap<Integer, Carro> carrosMap;
	
	static{
		//execute esse bloco no momento da primeira
		// inicialização desta classe
		Carro fusca = new Carro();
		fusca.setAnoFabricacao((short)1972);
		fusca.setId(1);
		fusca.setKilometragem(12323);
		fusca.setMarca("Volkswagen");
		fusca.setModel("Fusca");
		
		Carro gol = new Carro();
		gol.setAnoFabricacao((short)2002);
		gol.setId(2);
		gol.setKilometragem(12000);
		gol.setMarca("Volkswagen");
		gol.setModel("Gol");
		
		carrosMap = new HashMap<Integer, Carro>();
		carrosMap.put(fusca.getId(), fusca);
		carrosMap.put(gol.getId(), gol);
	}
	
	//RESTfull
	
	//GET - lista os carros
	@GET
	@Produces("text/xml")
	public List<Carro> listaCarros(){
//		pego a collections do hasmap -> arraylist -> list
		return new ArrayList<Carro>(carrosMap.values());
	}
	
	//POST - inserir um novo carro
	//PUT - altera um carro
	//DELETE - deletar um carro
	//HEAD - meta dados da concessioária
	

}
