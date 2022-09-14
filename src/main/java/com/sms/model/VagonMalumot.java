package com.sms.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="vagon_malumot")
public class VagonMalumot {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private Integer nomer;
	
	private String depoNomi;

	private Date oxirgiTamirKuni;

	private String remontTuri;
	
	private Integer ishlabChiqarilganYili;
	
	private Integer ramaOng1;
	
	private Integer ramaOng2;
	
	private Integer ramaChap1;
	
	private Integer ramaChap2;
	
	private Integer balka1;
	
	private Integer balka2;

	private Integer gildirak1;
	
	private Integer gildirak2;
	
	private Integer gildirak3;
	
	private Integer gildirak4;

	private String saqlanganVaqti;
	
	private String izoh;	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getNomer() {
		return nomer;
	}

	public void setNomer(Integer nomer) {
		this.nomer = nomer;
	}
	
	public String getDepoNomi() {
		return depoNomi;
	}

	public void setDepoNomi(String depoNomi) {
		this.depoNomi = depoNomi;
	}

	public Date getOxirgiTamirKuni() {
		return oxirgiTamirKuni;
	}

	public void setOxirgiTamirKuni(Date oxirgiTamirKuni) {
		this.oxirgiTamirKuni = oxirgiTamirKuni;
	}

	public String getRemontTuri() {
		return remontTuri;
	}

	public void setRemontTuri(String remontTuri) {
		this.remontTuri = remontTuri;
	}

	public Integer getIshlabChiqarilganYili() {
		return ishlabChiqarilganYili;
	}

	public void setIshlabChiqarilganYili(Integer ishlabChiqarilganYili) {
		this.ishlabChiqarilganYili = ishlabChiqarilganYili;
	}

	public void setSaqlanganVaqti(String saqlanganVaqti) {
		this.saqlanganVaqti = saqlanganVaqti;
	}

	public String getSaqlanganVaqti() {
		return saqlanganVaqti;
	}

	public Integer getRamaOng1() {
		return ramaOng1;
	}

	public void setRamaOng1(Integer ramaOng1) {
		this.ramaOng1 = ramaOng1;
	}

	public Integer getRamaOng2() {
		return ramaOng2;
	}

	public void setRamaOng2(Integer ramaOng2) {
		this.ramaOng2 = ramaOng2;
	}

	public Integer getRamaChap1() {
		return ramaChap1;
	}

	public void setRamaChap1(Integer ramaChap1) {
		this.ramaChap1 = ramaChap1;
	}

	public Integer getRamaChap2() {
		return ramaChap2;
	}

	public void setRamaChap2(Integer ramaChap2) {
		this.ramaChap2 = ramaChap2;
	}

	public Integer getBalka1() {
		return balka1;
	}

	public void setBalka1(Integer balka1) {
		this.balka1 = balka1;
	}

	public Integer getBalka2() {
		return balka2;
	}

	public void setBalka2(Integer balka2) {
		this.balka2 = balka2;
	}

	public Integer getGildirak1() {
		return gildirak1;
	}

	public void setGildirak1(Integer gildirak1) {
		this.gildirak1 = gildirak1;
	}

	public Integer getGildirak2() {
		return gildirak2;
	}

	public void setGildirak2(Integer gildirak2) {
		this.gildirak2 = gildirak2;
	}

	public Integer getGildirak3() {
		return gildirak3;
	}

	public void setGildirak3(Integer gildirak3) {
		this.gildirak3 = gildirak3;
	}

	public Integer getGildirak4() {
		return gildirak4;
	}

	public void setGildirak4(Integer gildirak4) {
		this.gildirak4 = gildirak4;
	}

	public String getIzoh() {
		return izoh;
	}

	public void setIzoh(String izoh) {
		this.izoh = izoh;
	}

}
