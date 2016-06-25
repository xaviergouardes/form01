package com.xtechnologies.form01.domain;

import java.util.ArrayList;
import java.util.List;

public class Lot {
	
	private String libelle;
	private String numero;
	private String status;
	private String campagne;
	
	public String getLibelle() {return libelle;}
	public void setLibelle(String libelle) {this.libelle = libelle;}
	public String getNumero() {return numero;}
	public void setNumero(String numero) {this.numero = numero;}
	public String getStatus() {return status;}
	public void setStatus(String status) {this.status = status;}
	public String getCampagne() {return campagne;}
	public void setCampagne(String campagne) {this.campagne = campagne;}
	
	List<Composante> composantes = new ArrayList<Composante>();

	public List<Composante> getComposantes() {return composantes;}
	public void addComposante(Composante composante) {composantes.add(composante);}
	public void removeComposante(Composante composante) {composantes.remove(composante);}
	
}
