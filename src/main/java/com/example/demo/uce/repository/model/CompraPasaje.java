package com.example.demo.uce.repository.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compra_pasaje")
public class CompraPasaje implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1131684118002580541L;

	@Id
	@Column(name = "copa_id")
	private Integer id;
	
	@Column(name = "copa_numero")
	private Integer numero;
	
	@Column(name = "copa_fecha_compra")
	private LocalDateTime fechaCompra;
	
	@Column(name = "copa_tarjeta")
	private Integer numeroTarjeta;
	
	@Column(name = "copa_cantidad_asientos_comprados")
	private Integer cantidadAsientosComprados;
	
	@Column(name = "copa_estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "vuel_id")
	private Vuelo vuelo;
	
	@ManyToOne
	@JoinColumn(name = "clie_id")
	private Cliente cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Integer getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(Integer numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public Integer getCantidadAsientosComprados() {
		return cantidadAsientosComprados;
	}

	public void setCantidadAsientosComprados(Integer cantidadAsientosComprados) {
		this.cantidadAsientosComprados = cantidadAsientosComprados;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}
