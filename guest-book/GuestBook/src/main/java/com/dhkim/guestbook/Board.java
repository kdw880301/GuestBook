package com.dhkim.guestbook;

public class Board {
	String email = "";
	String pwd = "";
	String content = "";
	String register_Day = "";
	String modify_Day = "";
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegister_Day() {
		return register_Day;
	}
	public void setRegister_Day(String register_Day) {
		this.register_Day = register_Day;
	}
	public String getModify_Day() {
		return modify_Day;
	}
	public void setModify_Day(String modify_Day) {
		this.modify_Day = modify_Day;
	}
}
