package org.std.spider.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_cat_area database table.
 * 
 */
@Entity
@Table(name="t_cat_area")
@NamedQuery(name="Area.findAll", query="SELECT a FROM Area a")
public class Area implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AREA_ID")
	private int areaId;

	@Column(name="CONTINENT_ID")
	private int continentId;

	@Column(name="`DESC`")
	private String desc;

	private String ename;

	@Column(name="ENAME_ABBR")
	private String enameAbbr;

	private String name;

	public Area() {
	}

	public int getAreaId() {
		return this.areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public int getContinentId() {
		return this.continentId;
	}

	public void setContinentId(int continentId) {
		this.continentId = continentId;
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

}