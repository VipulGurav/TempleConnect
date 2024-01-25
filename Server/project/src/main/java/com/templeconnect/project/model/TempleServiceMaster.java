package com.templeconnect.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="temple_service_master")
public class TempleServiceMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	Long placeId;
	String accomodation;
	Long donation;
	String ePrasad;
	String eDarshan;
	public TempleServiceMaster(Long id, Long placeId, String accomodation, Long donation, String ePrasad,
			String eDarshan) {
		super();
		this.id = id;
		this.placeId = placeId;
		this.accomodation = accomodation;
		this.donation = donation;
		this.ePrasad = ePrasad;
		this.eDarshan = eDarshan;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPlaceId() {
		return placeId;
	}
	public void setPlaceId(Long placeId) {
		this.placeId = placeId;
	}
	public String getAccomodation() {
		return accomodation;
	}
	public void setAccomodation(String accomodation) {
		this.accomodation = accomodation;
	}
	public Long getDonation() {
		return donation;
	}
	public void setDonation(Long donation) {
		this.donation = donation;
	}
	public String getePrasad() {
		return ePrasad;
	}
	public void setePrasad(String ePrasad) {
		this.ePrasad = ePrasad;
	}
	public String geteDarshan() {
		return eDarshan;
	}
	public void seteDarshan(String eDarshan) {
		this.eDarshan = eDarshan;
	}
	
	
	
	
	
}
