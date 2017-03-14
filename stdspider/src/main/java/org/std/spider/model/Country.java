package org.std.spider.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_cat_country database table.
 * 
 */
@Entity
@Table(name="t_cat_country")
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COUNTRY_ID")
	private int countryId;

	private int acreage;

	@Column(name="AIR_CODE")
	private String airCode;

	@Column(name="AREA_ID")
	private int areaId;

	@Column(name="COUNTRY_CODE")
	private String countryCode;

	@Column(name="COUNTRY_TYPE")
	private int countryType;

	@Column(name="DOMAIN_CODE")
	private String domainCode;

	private String ename;

	@Column(name="ENAME_ABBR")
	private String enameAbbr;

	@Column(name="ENAME_FULL")
	private String enameFull;

	@Column(name="FIFA_CODE")
	private String fifaCode;

	@Column(name="LANG_ABBR")
	private String langAbbr;

	private String language;

	private String name;

	@Column(name="NAME_FULL")
	private String nameFull;

	@Column(name="NATIONAL_FLAG")
	private String nationalFlag;

	@Column(name="OLYMPIC_CODE")
	private String olympicCode;

	private int population;

	@Column(name="TELEPHONE_CODE")
	private int telephoneCode;

	@Column(name="TIME_ZONE")
	private int timeZone;

	public Country() {
	}

	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public int getAcreage() {
		return this.acreage;
	}

	public void setAcreage(int acreage) {
		this.acreage = acreage;
	}

	public String getAirCode() {
		return this.airCode;
	}

	public void setAirCode(String airCode) {
		this.airCode = airCode;
	}

	public int getAreaId() {
		return this.areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public int getCountryType() {
		return this.countryType;
	}

	public void setCountryType(int countryType) {
		this.countryType = countryType;
	}

	public String getDomainCode() {
		return this.domainCode;
	}

	public void setDomainCode(String domainCode) {
		this.domainCode = domainCode;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEnameAbbr() {
		return this.enameAbbr;
	}

	public void setEnameAbbr(String enameAbbr) {
		this.enameAbbr = enameAbbr;
	}

	public String getEnameFull() {
		return this.enameFull;
	}

	public void setEnameFull(String enameFull) {
		this.enameFull = enameFull;
	}

	public String getFifaCode() {
		return this.fifaCode;
	}

	public void setFifaCode(String fifaCode) {
		this.fifaCode = fifaCode;
	}

	public String getLangAbbr() {
		return this.langAbbr;
	}

	public void setLangAbbr(String langAbbr) {
		this.langAbbr = langAbbr;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameFull() {
		return this.nameFull;
	}

	public void setNameFull(String nameFull) {
		this.nameFull = nameFull;
	}

	public String getNationalFlag() {
		return this.nationalFlag;
	}

	public void setNationalFlag(String nationalFlag) {
		this.nationalFlag = nationalFlag;
	}

	public String getOlympicCode() {
		return this.olympicCode;
	}

	public void setOlympicCode(String olympicCode) {
		this.olympicCode = olympicCode;
	}

	public int getPopulation() {
		return this.population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getTelephoneCode() {
		return this.telephoneCode;
	}

	public void setTelephoneCode(int telephoneCode) {
		this.telephoneCode = telephoneCode;
	}

	public int getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(int timeZone) {
		this.timeZone = timeZone;
	}

}