package com.xtechnologies.form01.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.xtechnologies.form01.domain.Composante;
import com.xtechnologies.form01.domain.Lot;

@Service
public class LotService {

	private List<Lot> lots = new ArrayList<Lot>();
	
	public LotService() {
		
		Lot lot = new Lot();
		lot.setCampagne("16-1");
		lot.setLibelle("Libelle");
		lot.setNumero("01");
		lot.setStatus("Finalise");
		
		Composante composante = new Composante();
		composante.setDiplome("DESS");
		composante.setLibelle("Libelle");
		composante.setNumeroSequence("01");
		
		lot.addComposante(composante);
		
		lots.add(lot);
	}
	
	public List<Lot> findAll(){
		return lots;
	}
	
	
}
