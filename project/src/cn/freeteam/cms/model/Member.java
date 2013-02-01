package cn.freeteam.cms.model;

import java.util.Date;

public class Member {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.id
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.grouptype
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private Integer grouptype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.groupid
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private String groupid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.loginname
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private String loginname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.name
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.pwd
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private String pwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.sex
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.birthday
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private Date birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.tel
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.mobilephone
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private String mobilephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.email
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.isOk
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private String isok;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.lastLoginTime
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private Date lastlogintime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.addtime
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private Date addtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.intro
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private String intro;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.credit
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private Integer credit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.experience
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private Integer experience;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_member.img
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    private String img;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.id
     *
     * @return the value of freecms_member.id
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.id
     *
     * @param id the value for freecms_member.id
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.grouptype
     *
     * @return the value of freecms_member.grouptype
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public Integer getGrouptype() {
        return grouptype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.grouptype
     *
     * @param grouptype the value for freecms_member.grouptype
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setGrouptype(Integer grouptype) {
        this.grouptype = grouptype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.groupid
     *
     * @return the value of freecms_member.groupid
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public String getGroupid() {
        return groupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.groupid
     *
     * @param groupid the value for freecms_member.groupid
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.loginname
     *
     * @return the value of freecms_member.loginname
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.loginname
     *
     * @param loginname the value for freecms_member.loginname
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.name
     *
     * @return the value of freecms_member.name
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.name
     *
     * @param name the value for freecms_member.name
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.pwd
     *
     * @return the value of freecms_member.pwd
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.pwd
     *
     * @param pwd the value for freecms_member.pwd
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.sex
     *
     * @return the value of freecms_member.sex
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.sex
     *
     * @param sex the value for freecms_member.sex
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.birthday
     *
     * @return the value of freecms_member.birthday
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.birthday
     *
     * @param birthday the value for freecms_member.birthday
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.tel
     *
     * @return the value of freecms_member.tel
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.tel
     *
     * @param tel the value for freecms_member.tel
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.mobilephone
     *
     * @return the value of freecms_member.mobilephone
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public String getMobilephone() {
        return mobilephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.mobilephone
     *
     * @param mobilephone the value for freecms_member.mobilephone
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.email
     *
     * @return the value of freecms_member.email
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.email
     *
     * @param email the value for freecms_member.email
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.isOk
     *
     * @return the value of freecms_member.isOk
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public String getIsok() {
        return isok;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.isOk
     *
     * @param isok the value for freecms_member.isOk
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setIsok(String isok) {
        this.isok = isok == null ? null : isok.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.lastLoginTime
     *
     * @return the value of freecms_member.lastLoginTime
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.lastLoginTime
     *
     * @param lastlogintime the value for freecms_member.lastLoginTime
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.addtime
     *
     * @return the value of freecms_member.addtime
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.addtime
     *
     * @param addtime the value for freecms_member.addtime
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.intro
     *
     * @return the value of freecms_member.intro
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public String getIntro() {
        return intro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.intro
     *
     * @param intro the value for freecms_member.intro
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.credit
     *
     * @return the value of freecms_member.credit
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public Integer getCredit() {
        return credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.credit
     *
     * @param credit the value for freecms_member.credit
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.experience
     *
     * @return the value of freecms_member.experience
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public Integer getExperience() {
        return experience;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.experience
     *
     * @param experience the value for freecms_member.experience
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_member.img
     *
     * @return the value of freecms_member.img
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_member.img
     *
     * @param img the value for freecms_member.img
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}