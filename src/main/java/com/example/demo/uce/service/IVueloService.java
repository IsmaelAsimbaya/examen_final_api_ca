package com.example.demo.uce.service;

import java.util.List;

import com.example.demo.uce.repository.model.Vuelo;
import com.example.demo.uce.service.to.VueloTo;

public interface IVueloService {

	public List<VueloTo> buscaVuelosDisponiblesODF(String origen, String destino, String fechaVuelo); 
	
	public VueloTo buscaVueloDisponileNV(Integer numeroVuelo);
	
	public void actualizarAsientosDisponibles(Integer asientosDisponibles, Integer idVuelo);
	
	public void actualizarEstado(String estado, Integer idVuelo);

}
