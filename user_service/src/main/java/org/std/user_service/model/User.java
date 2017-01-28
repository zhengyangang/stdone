package org.std.user_service.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_uc_user")
public class User {
	@Id
	@GeneratedValue
    private Integer userId;

	@Column(nullable = false)
    private String userName;

	@Column(nullable = false)
    private String pwd;

	@Column(nullable = false)
    private String salt;

	@Column(nullable = false)
    private Integer status;

	@Column(nullable = false)
    private String channelMember;

	@Column(nullable = false)
    private Date registerTime;

	@Column(nullable = false)
    private Integer registerIp;

    private String countryCode;

    private String mobile;

    private String email;

    private String trueName;

    private Integer cardCat;

    private String cardNo;

    private String openOrg;

    private String openId;

    private Integer gender;

    private Integer calendar;

    private Integer year;

    private Integer month;

    private Integer day;

    private Integer height;

    private Integer weight;

    private String avatar;

    private String country;

    private String state;

    private String county;

    private Date activeTime;

    private Date cancelTime;

    private Date lastloginTime;

    private Integer lastloginIp;

    private Date lastupdateTime;

    private Integer lastupdateIp;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getChannelMember() {
        return channelMember;
    }

    public void setChannelMember(String channelMember) {
        this.channelMember = channelMember == null ? null : channelMember.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(Integer registerIp) {
        this.registerIp = registerIp;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }

    public Integer getCardCat() {
        return cardCat;
    }

    public void setCardCat(Integer cardCat) {
        this.cardCat = cardCat;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getOpenOrg() {
        return openOrg;
    }

    public void setOpenOrg(String openOrg) {
        this.openOrg = openOrg == null ? null : openOrg.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getCalendar() {
        return calendar;
    }

    public void setCalendar(Integer calendar) {
        this.calendar = calendar;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Date getLastloginTime() {
        return lastloginTime;
    }

    public void setLastloginTime(Date lastloginTime) {
        this.lastloginTime = lastloginTime;
    }

    public Integer getLastloginIp() {
        return lastloginIp;
    }

    public void setLastloginIp(Integer lastloginIp) {
        this.lastloginIp = lastloginIp;
    }

    public Date getLastupdateTime() {
        return lastupdateTime;
    }

    public void setLastupdateTime(Date lastupdateTime) {
        this.lastupdateTime = lastupdateTime;
    }

    public Integer getLastupdateIp() {
        return lastupdateIp;
    }

    public void setLastupdateIp(Integer lastupdateIp) {
        this.lastupdateIp = lastupdateIp;
    }
}