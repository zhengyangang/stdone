package org.std.spider.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_cat_continent database table.
 * 
 */
@Entity
@Table(name="t_cat_continent")
@NamedQuery(name="Continent.findAll", query="SELECT c FROM Continent c")
public class Continent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CONTINENT_ID")
	private int continentId;

	private int acreage;

	@Column(name="`DESC`")
	private String desc;

	private String ename;

	@Column(name="ENAME_ABBR")
	private String enameAbbr;

	private String name;

	private int population;

	public Continent() {
	}

	public int getContinentId() {
		return this.continentId;
	}

	public void setContinentId(int continentId) {
		this.continentId = continentId;
	}

	public int getAcreage() {
		return this.acreage;
	}

	public void setAcreage(int acreage) {
		this.acreage = acreage;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return this.population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}