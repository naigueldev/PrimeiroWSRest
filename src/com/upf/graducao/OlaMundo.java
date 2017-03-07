/**
 * 
 */
/**
 * @author 148894
 *
 */
package com.upf.graducao;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/OlaMundo")
public class OlaMundo {
	// GET
	@GET
	@Produces("text/plain")//MIME-TYPE image/jpeg text/json
	public String respondeGet(){
		return "Nosso primeiro...";
	}
	
	//POST
	@POST
	@Produces("text/plain")
	public String testeDeNomeEscroto(){
		return "Só uma prova...[POST]";
	}
	
	
}