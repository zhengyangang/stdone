package org.std.user_service.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the t_uc_user database table.
 * 
 */
@Entity
@Table(name="t_uc_user")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="active_time")
	private Date activeTime;

	private String avatar;

	private int calendar;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cancel_time")
	private Date cancelTime;

	@Column(name="card_cat")
	private int cardCat;

	@Column(name="card_no")
	private String cardNo;

	@Column(name="channel_member")
	private String channelMember;

	private String country;

	@Column(name="country_code")
	private String countryCode;

	private String county;

	private int day;

	private String email;

	private int gender;

	private int height;

	@Column(name="lastlogin_ip")
	private int lastloginIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="lastlogin_time")
	private Date lastloginTime;

	@Column(name="lastupdate_ip")
	private int lastupdateIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="lastupdate_time")
	private Date lastupdateTime;

	private String mobile;

	private int month;

	@Column(name="open_id")
	private String openId;

	@Column(name="open_org")
	private String openOrg;

	private String pwd;

	@Column(name="register_ip")
	private int registerIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="register_time")
	private Date registerTime;

	private String salt;

	private String state;

	private int status;

	@Column(name="true_name")
	private String trueName;

	@Column(name="user_name")
	private String userName;

	private int weight;

	private int year;

	public User() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getActiveTime() {
		return this.activeTime;
	}

	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getCalendar() {
		return this.calendar;
	}

	public void setCalendar(int calendar) {
		this.calendar = calendar;
	}

	public Date getCancelTime() {
		return this.cancelTime;
	}

	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	public int getCardCat() {
		return this.cardCat;
	}

	public void setCardCat(int cardCat) {
		this.cardCat = cardCat;
	}

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getChannelMember() {
		return this.channelMember;
	}

	public void setChannelMember(String channelMember) {
		this.channelMember = channelMember;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGender() {
		return this.gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLastloginIp() {
		return this.lastloginIp;
	}

	public void setLastloginIp(int lastloginIp) {
		this.lastloginIp = lastloginIp;
	}

	public Date getLastloginTime() {
		return this.lastloginTime;
	}

	public void setLastloginTime(Date lastloginTime) {
		this.lastloginTime = lastloginTime;
	}

	public int getLastupdateIp() {
		return this.lastupdateIp;
	}

	public void setLastupdateIp(int lastupdateIp) {
		this.lastupdateIp = lastupdateIp;
	}

	public Date getLastupdateTime() {
		return this.lastupdateTime;
	}

	public void setLastupdateTime(Date lastupdateTime) {
		this.lastupdateTime = lastupdateTime;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getOpenId() {
		return this.openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOpenOrg() {
		return this.openOrg;
	}

	public void setOpenOrg(String openOrg) {
		this.openOrg = openOrg;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getRegisterIp() {
		return this.registerIp;
	}

	public void setRegisterIp(int registerIp) {
		this.registerIp = registerIp;
	}

	public Date getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTrueName() {
		return this.trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}