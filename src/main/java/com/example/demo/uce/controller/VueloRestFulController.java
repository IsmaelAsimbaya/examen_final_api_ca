package com.example.demo.uce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.uce.service.IVueloService;
import com.example.demo.uce.service.to.VueloTo;

@RestController
@RequestMapping("/clientes")
@CrossOrigin("http://localhost:8080/")
public class VueloRestFulController {
	
	@Autowired
	private IVueloService vueloService;
	
	@GetMapping(path= "/vuelosDisponiblesODF",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<VueloTo> buscaVuelosDisponiblesODF(@RequestParam(value = "origen") String origen, @RequestParam(value = "destino") String destino, @RequestParam(value = "fechaVuelo") String fechaVuelo){
		return this.vueloService.buscaVuelosDisponiblesODF(origen, destino, fechaVuelo);
	}
	
	@GetMapping(path = "/reservaPasajeAereo", produces = MediaType.APPLICATION_JSON_VALUE)
	public VueloTo reservarPasaje(@RequestParam(value = "numeroVuelo") Integer numeroVuelo) {
		return this.vueloService.buscaVueloDisponileNV(numeroVuelo);
	}
	
	
}
