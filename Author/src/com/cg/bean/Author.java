package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="authors")


public class Author 
{
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="authorId", length=10)
	private int authorId;
	
	@Column(name="fname", length=25)
	private String autfirstName;
	
	@Column(name="mname", length=25)
	private String autmiddleName;
	
	@Column(name="lname", length=25)
	private String autlastName;
	
	@Column(name="phonenum", length=15)
	private String autphoneNo;
	
	
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAutFirstName() {
		return autfirstName;
	}
	public void setAutFirstName(String autfirstName) {
		this.autfirstName = autfirstName;
	}
	public String getAutMiddleName() {
		return autmiddleName;
	}
	public void setAutMiddleName(String autmiddleName) {
		this.autmiddleName = autmiddleName;
	}
	public String getAutLastName() {
		return autlastName;
	}
	public void setAutLastName(String autlastName) {
		this.autlastName = autlastName;
	}
	public String getAutPhoneNo() {
		return autphoneNo;
	}
	public void setAutPhoneNo(String autphoneNo) {
		this.autphoneNo = autphoneNo;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", firstName=" + autfirstName
				+ ", middleName=" + autmiddleName + ", lastName=" + autlastName
				+ ", phoneNo=" + autphoneNo + "]";
	}
	public Author(int authorId, String autfirstName, String autmiddleName,
			String autlastName, String autphoneNo) {
		super();
		this.authorId = authorId;
		this.autfirstName = autfirstName;
		this.autmiddleName = autmiddleName;
		this.autlastName = autlastName;
		this.autphoneNo = autphoneNo;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}


}
