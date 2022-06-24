package com.bbva.PruebaAso.bussisnes.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbva.PruebaAso.bussisnes.IBPruebaAso;
import com.bbva.PruebaAso.bussisnes.dao.Controller.BPruebaAsoController;
import com.bbva.PruebaAso.bussisnes.dao.dto.BPruebaAsoDto;

@Service
public class BPruebaAso implements IBPruebaAso {
	
	@Autowired
	BPruebaAsoController controller;

	@Override
	public void CreatePrueba(BPruebaAsoDto dto) {
		
		controller.CreatePrueba(dto);
	}

	@Override
	public List<BPruebaAsoDto> GetPrueba() {
		
		return controller.GetPrueba();
	}

	@Override
	public void deletePruebaAso(String id) {
		controller.deletePruebaAso(id);
		
	}

}
