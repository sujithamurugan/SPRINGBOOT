package com.suji.RevatureApplication;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	
	
	@Id
private int id;
	
private String name;
private String username;
private String password;
private String mobileno;
private String emailid;
private boolean active;
private String role;
public User() {
	
}
public User(String password) {
	super();
	this.password = password;
}
public User(int id, String name, String username, String password, String mobileno, String emailid, boolean active,
		String role) {
	super();
	this.id = id;
	this.name = name;
	this.username = username;
	this.password = password;
	this.mobileno = mobileno;
	this.emailid = emailid;
	this.active = active;
	this.role = role;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", mobileno="
			+ mobileno + ", emailid=" + emailid + ", active=" + active + ", role=" + role + ", getId()=" + getId()
			+ ", getName()=" + getName() + ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword()
			+ ", getMobileno()=" + getMobileno() + ", getEmailid()=" + getEmailid() + ", isActive()=" + isActive()
			+ ", getRole()=" + getRole() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}


}
