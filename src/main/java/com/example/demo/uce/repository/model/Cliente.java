package com.example.demo.uce.repository.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 61664181514562748L;

	@Id
	@Column(name = "clie_id")
	private Integer id;
	
	@Column(name = "clie_nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "cliente")
	private List<CompraPasaje> compraPasajes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<CompraPasaje> getCompraPasajes() {
		return compraPasajes;
	}

	public void setCompraPasajes(List<CompraPasaje> compraPasajes) {
		this.compraPasajes = compraPasajes;
	}
	
	
	
}
