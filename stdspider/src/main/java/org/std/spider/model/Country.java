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

	@Column(name="CONTINENT_ID")
	private int continentId;

	@Column(name="COUNTRY_CODE")
	private String countryCode;

	@Column(name="DOMAIN_CODE")
	private String domainCode;

	private String ename;

	@Column(name="ENAME_ABBR")
	private String enameAbbr;

	@Column(name="FIFA_CODE")
	private String fifaCode;

	@Column(name="LANG_ABBR")
	private String langAbbr;

	private String language;

	private String name;

	@Column(name="NAME_ABBR")
	private String nameAbbr;

	@Column(name="NATIONAL_FLAG")
	private String nationalFlag;

	@Column(name="OLYMPIC_CODE")
	private String olympicCode;

	private int population;

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

	public int getContinentId() {
		return this.continentId;
	}

	public void setContinentId(int continentId) {
		this.continentId = continentId;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
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

	public String getNameAbbr() {
		return this.nameAbbr;
	}

	public void setNameAbbr(String nameAbbr) {
		this.nameAbbr = nameAbbr;
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

	public int getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(int timeZone) {
		this.timeZone = timeZone;
	}

}