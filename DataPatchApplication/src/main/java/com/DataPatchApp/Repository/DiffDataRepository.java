package com.DataPatchApp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DataPatchApp.Entity.DiffData;


@Repository
public interface DiffDataRepository extends CrudRepository<DiffData, Integer>{

	
}