package com.example.demo.uce.repository;

import java.util.List;

import com.example.demo.uce.repository.model.Vuelo;

public interface IVueloRepository {
	
	public List<Vuelo> buscaVuelosDisponiblesODF(String origen, String destino, String fechaVuelo); 
	
	public Vuelo buscaVueloDisponileNV(Integer numeroVuelo);
	
	public void actualizarAsientosDisponibles(Integer asientosDisponibles, Integer idVuelo);
	
	public void actualizarEstado(String estado, Integer idVuelo);

}
