package com.DataPatchApp.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DataPatchApp.Entity.DiffData;
import com.DataPatchApp.Repository.DiffDataRepository;
import com.DataPatchApp.files.DestinationData;
import com.DataPatchApp.files.SourceData;



@Service
public class DiffDataService {

	@Autowired
	DiffDataRepository diffDataRepository;
	
	
	public List <DiffData> GetAllDiffData(){
		List <DiffData> diffDatas = new ArrayList<DiffData>();
	diffDataRepository.findAll().forEach(c->diffDatas.add(c));
		return diffDatas;
	}
	
	
	
public DiffData compareData(SourceData source, DestinationData dest) {
		
	//convert source object to destination object
		DestinationData data = new DestinationData();
		data.setId(source.getId());
		data.setPAge(source.getAge());
	 	data.setPName(source.getName());
		
		DiffData diff = new DiffData();
		diff.setId(UUID.randomUUID().toString());
		diff.setData(data);
		
		System.out.println(diff);
		
		diffDataRepository.save(diff);
		return diff;
		
		
	}
	
}
