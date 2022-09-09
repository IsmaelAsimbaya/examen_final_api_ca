package com.example.demo.uce.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.IVueloRepository;
import com.example.demo.uce.repository.model.Vuelo;
import com.example.demo.uce.service.to.VueloTo;

@Service
public class VueloServiceImpl implements IVueloService{

	@Autowired
	private IVueloRepository vueloRepository;

	@Override
	public List<VueloTo> buscaVuelosDisponiblesODF(String origen, String destino, String fechaVuelo) {
		List<Vuelo> lista = this.vueloRepository.buscaVuelosDisponiblesODF(origen, destino, fechaVuelo);
		return lista.stream().map(vuelo -> this.convertirVueloTo(vuelo))
				.collect(Collectors.toList());
	}

	@Override
	public VueloTo buscaVueloDisponileNV(Integer numeroVuelo) {
		return convertirVueloTo(this.vueloRepository.buscaVueloDisponileNV(numeroVuelo));
	}

	@Override
	public void actualizarAsientosDisponibles(Integer asientosDisponibles, Integer idVuelo) {
		this.vueloRepository.actualizarAsientosDisponibles(asientosDisponibles, idVuelo);
	}

	@Override
	public void actualizarEstado(String estado, Integer idVuelo) {
		this.vueloRepository.actualizarEstado(estado, idVuelo);
	}
	
	private VueloTo convertirVueloTo(Vuelo vuelo) {
		VueloTo aux = new VueloTo();
		aux.setNumero(vuelo.getNumero());
		aux.setOrigen(vuelo.getOrigen());
		aux.setDestino(vuelo.getDestino());
		aux.setCategoria(vuelo.getCategoria());
		aux.setAvion(vuelo.getAvion().getId());
		aux.setValorAsiento(vuelo.getValorAsiento());
		return aux;
	}
}
