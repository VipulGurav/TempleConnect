package com.templeconnect.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="place_master")
public class PlaceMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long placeId;
	String placeName;
	String address;
	String city;
	String district;
	String state;
	Integer pincode;
	String placeInfo;
	public PlaceMaster(Long placeId, String placeName, String address, String city, String district, String state,
			Integer pincode, String placeInfo) {
		super();
		this.placeId = placeId;
		this.placeName = placeName;
		this.address = address;
		this.city = city;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
		this.placeInfo = placeInfo;
	}
	public Long getPlaceId() {
		return placeId;
	}
	public void setPlaceId(Long placeId) {
		this.placeId = placeId;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getPlaceInfo() {
		return placeInfo;
	}
	public void setPlaceInfo(String placeInfo) {
		this.placeInfo = placeInfo;
	}
	
	

}
