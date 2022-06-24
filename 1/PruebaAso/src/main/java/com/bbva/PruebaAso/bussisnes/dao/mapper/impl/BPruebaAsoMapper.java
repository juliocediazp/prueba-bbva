package com.bbva.PruebaAso.bussisnes.dao.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bbva.PruebaAso.bussisnes.dao.dto.BPruebaAsoDto;
import com.bbva.PruebaAso.bussisnes.dao.mapper.IBPruebaAsoMapper;
import com.bbva.PruebaAso.bussisnes.dao.model.PruebaAsoEntity;

@Service
public class BPruebaAsoMapper implements IBPruebaAsoMapper {


	@Override
	public List<BPruebaAsoDto> mapperModelOut(List<PruebaAsoEntity> modelList) {
		
		ArrayList<BPruebaAsoDto> dtoList = new ArrayList<BPruebaAsoDto>();
		
		for (PruebaAsoEntity pruebaAsoEntity : modelList) {
			BPruebaAsoDto dto = new BPruebaAsoDto();
			
			dto.setId(pruebaAsoEntity.getId());
			dto.setNombre(pruebaAsoEntity.getNombre());
			dto.setApellido(pruebaAsoEntity.getApellido());
			dto.setEdad(pruebaAsoEntity.getEdad());
			
			dtoList.add(dto);
		}
		
		
		
		
		
		return dtoList;
	}

	@Override
	public PruebaAsoEntity mapperModelIn(BPruebaAsoDto dto) {
		
		PruebaAsoEntity entity = new PruebaAsoEntity();
		
		entity.setId(dto.getId());
		entity.setNombre(dto.getNombre());
		entity.setApellido(dto.getApellido());
		entity.setEdad(dto.getEdad());
		
		return entity;
	}

}
