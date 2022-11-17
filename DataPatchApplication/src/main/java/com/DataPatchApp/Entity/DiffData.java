package com.DataPatchApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.DataPatchApp.files.DestinationData;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class DiffData {

	@Id  
	@Column  
	private String id;
	
	@Column  
	private String source_id;
	
	@Column  
	private String destination_id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn
	@NotFound(action = NotFoundAction.IGNORE)
	private DestinationData data;
	  
	public DiffData() {
		super();
		// TODO Auto-generated constructor stub
	}

	
//	@Override
//	public String toString() {
//		return "DiffData [id=" + id + ", data=" + data.pName + "]";
//	}

	
	  
}
