package com.example.demo.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.model.Vuelo;

@Repository
@Transactional
public class VueloRepositoryImpl implements IVueloRepository{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Vuelo> buscaVuelosDisponiblesODF(String origen, String destino, String fechaVuelo) {
		TypedQuery<Vuelo> myQuery = this.em.createQuery("SELECT v FROM Vuelo v WHERE v.origen = :origen AND v.destino = :destino AND v.fechaVuelo = :fechaVuelo", Vuelo.class);
		myQuery.setParameter("origen", origen);
		myQuery.setParameter("destino", destino);
		myQuery.setParameter("fechaVuelo", fechaVuelo);
		return myQuery.getResultList();
	}

	@Override
	public Vuelo buscaVueloDisponileNV(Integer numeroVuelo) {
		TypedQuery<Vuelo> myQuery = this.em.createQuery("SELECT v FROM Vuelo v WHERE v.numero = :numeroVuelo AND v.estado = D",Vuelo.class);
		myQuery.setParameter("numeroVuelo", numeroVuelo);
		return myQuery.getSingleResult();
	}

	@Override
	public void actualizarAsientosDisponibles(Integer asientosDisponibles, Integer idVuelo) {
		Vuelo aux = this.em.find(Vuelo.class, idVuelo);
		if(aux!=null) {
			aux.setAsientosDisponibles(asientosDisponibles);
			this.em.merge(aux);
		}
	}

	@Override
	public void actualizarEstado(String estado, Integer idVuelo) {
		Vuelo aux = this.em.find(Vuelo.class, idVuelo);
		if(aux!=null) {
			aux.setEstado(estado);
			this.em.merge(aux);
		}
	}

}
