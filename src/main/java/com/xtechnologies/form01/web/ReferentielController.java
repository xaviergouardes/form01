package com.xtechnologies.form01.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReferentielController {

	@RequestMapping(value="/referentiels/domaines-professionel", method=RequestMethod.GET)
    public String domaineProfessionnel(Model model) {
        
		List<ItemReferentiel> domaines = new ArrayList<ItemReferentiel>();

		domaines.add(new ItemReferentiel("AGRI","AGRI - AGRICULTURE"));
		domaines.add(new ItemReferentiel("AGRO","AGRO - AGROALIMENTAIRE"));
		domaines.add(new ItemReferentiel("BATI","BATI - BATIMENT TRAVAUX PUBLICS"));
		domaines.add(new ItemReferentiel("COMM","COMM - COMMERCE"));
		domaines.add(new ItemReferentiel("CULT","CULT - CULTURE COMMUNICATION"));
		domaines.add(new ItemReferentiel("FORM","FORM - FORMATIONS GENERALES"));
		domaines.add(new ItemReferentiel("HOTE","HOTE - HOTELLERIE TOURISME LOISIRS"));
		domaines.add(new ItemReferentiel("INDU","INDU - INDUSTRIE"));
		domaines.add(new ItemReferentiel("SANT","SANT - SANTE SOCIAL SOINS PERSONNELS"));
		domaines.add(new ItemReferentiel("SECU","SECU - SECURITE PROPRETE"));
		domaines.add(new ItemReferentiel("GEST","GEST - GESTION DE L'INFORMATION"));
		domaines.add(new ItemReferentiel("TRAN","TRAN - TRANSPORT LOGISTIQUE"));
		
		
		model.addAttribute("domainesProfesionnels", domaines);
        
		return "fragments/components/listDomaineProfessionnel";
    }
	
	@RequestMapping(value="/referentiels/status", method=RequestMethod.GET)
    public String status(Model model) {
        
		Map<String, String> status = new HashMap<String, String>();

		
		status.put("CONS","En cours de construction");
		status.put("RETM","Retenu mais à modifier");
		status.put("FINI","Finalisé");
		status.put("ABAN","Abandon");
		status.put("TMAR","Transformé en marché");
		
		
		
		
		model.addAttribute("status", status);
        
		return "referentiels :: status";
    }
	
	
	@RequestMapping(value="/referentiels/campagnes", method=RequestMethod.GET)
    public String campagnes(Model model) {
        
		Map<String, String> campagnes = new HashMap<String, String>();

		
		campagnes.put("CONS","16-1 MARCHES DE FORMATION 2016");
		campagnes.put("RETM","16-2 MARCHES DE FORMATION 2016");
		campagnes.put("FINI","16-3 MARCHES DE FORMATION 2016");

		
		model.addAttribute("campagnes", campagnes);
        
		return "referentiels :: campagnes";
    }
	
	
	public class ItemReferentiel {
		public ItemReferentiel(String code, String libelle) {
			this.code = code;
			this.Libelle = libelle;
		}
		private String code;
		private String Libelle;
		public String getCode() {return code;}
		public void setCode(String code) {this.code = code;}
		public String getLibelle() {return Libelle;}
		public void setLibelle(String libelle) {Libelle = libelle;}
		
	}
}
