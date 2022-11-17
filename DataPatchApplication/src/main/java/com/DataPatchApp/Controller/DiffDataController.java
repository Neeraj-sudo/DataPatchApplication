package com.DataPatchApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.DataPatchApp.Entity.DiffData;
import com.DataPatchApp.Services.DiffDataService;
import com.DataPatchApp.files.DestinationData;
import com.DataPatchApp.files.SourceData;




@RestController
public class DiffDataController {

	@Autowired
	DiffDataService diffDataService;
	
	SourceData source = new SourceData(1, "Neeraj", 25);
	DestinationData dest = new DestinationData(2, "Neeraj", 25);
	
	
	
	@GetMapping("/data")
	public List<DiffData> GetAllData()
	{
		return diffDataService.GetAllDiffData();
	}
	
	@GetMapping("/diffdata")
	public DiffData CompareData()
	{
		return diffDataService.compareData(source, dest);
	}
}