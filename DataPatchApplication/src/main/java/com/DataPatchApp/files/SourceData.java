package com.DataPatchApp.files;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SourceData {

	public int id;
	public String name;
	public int Age;
	public SourceData(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		Age = age;
	}
	
	
}