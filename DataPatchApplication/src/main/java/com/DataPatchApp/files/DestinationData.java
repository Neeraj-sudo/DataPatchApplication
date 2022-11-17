package com.DataPatchApp.files;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class DestinationData {

	@Id  
	@Column 
	public int id;
	
	@Column 
	public String pName;
	
	@Column 
	public int pAge;
	
	
	public DestinationData(int id, String pName, int pAge) {
		super();
		this.id = id;
		this.pName = pName;
		this.pAge = pAge;
	}
	public DestinationData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}