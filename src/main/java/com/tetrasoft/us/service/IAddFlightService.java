package com.tetrasoft.us.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tetrasoft.us.model.CAddFlightEntity;

@Repository
public interface IAddFlightService extends JpaRepository<CAddFlightEntity, Integer>{
	
	List<CAddFlightEntity> findBySourceAndDestination(String source,String destination);

}
