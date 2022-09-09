package com.example.demo.uce.service.to;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.hateoas.RepresentationModel;

public class VueloTo extends RepresentationModel<VueloTo> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6866151516128195114L;

	private Integer numero;
	
	private String origen;
	
	private String destino;
	
	private String categoria;
	
	private Integer avion;
	
	private BigDecimal valorAsiento;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getAvion() {
		return avion;
	}

	public void setAvion(Integer avion) {
		this.avion = avion;
	}

	public BigDecimal getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(BigDecimal valorAsiento) {
		this.valorAsiento = valorAsiento;
	}
	
	
}
