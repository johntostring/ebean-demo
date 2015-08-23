package com.millinch.ebean.demo.domain;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * This guy is lazy, nothing left.
 *
 * @author 张劲航
 */
@Entity
@Table(name = "sys_user")
public class User extends Model implements Serializable {

    @JsonIgnore
    public static Find<Long, User> find = new Finder<>("test", User.class);

    @Id
    @GeneratedValue
    private Long id;
    private String mobilePhone;
    private String userName;
    private String nickname;
    private String password;
    private String salt;
    private String signature;
    private Boolean gender;
    private Long qq;
    private String email;
    private String avatar;
    private String province;
    private String city;
    private String regIp;
    private Integer score;
    private Integer status;
    private Long createBy;
    private Date createAt;
    private Long updateBy;
    private Date updateAt;

    @OneToMany(mappedBy = "createBy")
    private List<Role> createdRoles;

    @OneToMany(mappedBy = "updateBy")
    private List<Role> updatedRoles;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Long getQq() {
        return qq;
    }

    public void setQq(Long qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public List<Role> getCreatedRoles() {
        return createdRoles;
    }

    public void setCreatedRoles(List<Role> createdRoles) {
        this.createdRoles = createdRoles;
    }

    public List<Role> getUpdatedRoles() {
        return updatedRoles;
    }

    public void setUpdatedRoles(List<Role> updatedRoles) {
        this.updatedRoles = updatedRoles;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id=").append(id);
        sb.append(", mobilePhone='").append(mobilePhone).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", nickname='").append(nickname).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", salt='").append(salt).append('\'');
        sb.append(", signature='").append(signature).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", qq=").append(qq);
        sb.append(", email='").append(email).append('\'');
        sb.append(", avatar='").append(avatar).append('\'');
        sb.append(", province='").append(province).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", regIp='").append(regIp).append('\'');
        sb.append(", score=").append(score);
        sb.append(", status=").append(status);
        sb.append(", createBy=").append(createBy);
        sb.append(", createAt=").append(createAt);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateAt=").append(updateAt);
        sb.append('}');
        return sb.toString();
    }
}
