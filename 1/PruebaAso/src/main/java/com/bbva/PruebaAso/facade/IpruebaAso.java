package com.bbva.PruebaAso.facade;

import java.util.List;

import com.bbva.PruebaAso.bussisnes.dao.dto.BPruebaAsoDto;

public interface IpruebaAso {
	
	void postPruebaAso(BPruebaAsoDto  dto);
	
	List<BPruebaAsoDto> getPruebaAso();
	
	void deletePruebaAso(String id);

}
