/**
 * 
 */
/**
 * @author 148894
 *
 */
package com.upf.graducao;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
	//EXERCÍCIO 1
	// Faça com que esse recurso responda a uma requisição
	// put, retornando a data atual (Dica, classe date)
	@PUT
	@Produces("text/plain")
	public String dataAtual(){     
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
        return dtf.format(now).toString();
		
	}

	
}