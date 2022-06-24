package com.bbva.PruebaAso.bussisnes.dao.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbva.PruebaAso.bussisnes.dao.dto.BPruebaAsoDto;
import com.bbva.PruebaAso.bussisnes.dao.mapper.IBPruebaAsoMapper;
import com.bbva.PruebaAso.bussisnes.dao.model.PruebaAsoEntity;
import com.bbva.PruebaAso.bussisnes.dao.repository.BPruebaAsoRepository;

@Service
public class BPruebaAsoController {
	
	@Autowired
	BPruebaAsoRepository repository;
	
	@Autowired
	IBPruebaAsoMapper mapper;
	
	public void CreatePrueba(BPruebaAsoDto dto) {
		
		
		PruebaAsoEntity entidad = mapper.mapperModelIn(dto);
		
	      repository.save(entidad);
	}
	
        public List<BPruebaAsoDto> GetPrueba() {
		

	      List<PruebaAsoEntity> getEntidad = repository.findAll();
	      
	      List<BPruebaAsoDto> dtoList = mapper.mapperModelOut(getEntidad);
	      
	      return dtoList;
	}
        
        public void deletePruebaAso(String id) {
        	
        	repository.deleteById(id);
        	
        }
        

}
