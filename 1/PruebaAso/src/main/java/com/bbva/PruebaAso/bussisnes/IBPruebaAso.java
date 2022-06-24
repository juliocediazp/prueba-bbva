package com.bbva.PruebaAso.bussisnes;

import java.util.List;

import com.bbva.PruebaAso.bussisnes.dao.dto.BPruebaAsoDto;

public interface IBPruebaAso {
	
	void CreatePrueba(BPruebaAsoDto dto);
	
	List<BPruebaAsoDto> GetPrueba();
	
	void deletePruebaAso(String id);

}
