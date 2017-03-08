package com.upf.graducao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Carro {
	
//	Atributos privados
	private int id;
	private String marca;
	private String model;
	private short anoFabricacao;
	private long kilometragem;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public short getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(short anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public long getKilometragem() {
		return kilometragem;
	}
	public void setKilometragem(long kilometragem) {
		this.kilometragem = kilometragem;
	}
	
//	getter and setter
	
	

}
