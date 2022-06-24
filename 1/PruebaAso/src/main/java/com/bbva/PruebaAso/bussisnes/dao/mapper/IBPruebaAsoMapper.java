package com.bbva.PruebaAso.bussisnes.dao.mapper;

import java.util.List;

import com.bbva.PruebaAso.bussisnes.dao.dto.BPruebaAsoDto;
import com.bbva.PruebaAso.bussisnes.dao.model.PruebaAsoEntity;

public interface IBPruebaAsoMapper {
	
	List<BPruebaAsoDto> mapperModelOut(List<PruebaAsoEntity> modelList);
	
	PruebaAsoEntity mapperModelIn(BPruebaAsoDto dto);

}
