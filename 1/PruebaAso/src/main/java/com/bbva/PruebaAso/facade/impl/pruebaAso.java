package com.bbva.PruebaAso.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bbva.PruebaAso.bussisnes.IBPruebaAso;
import com.bbva.PruebaAso.bussisnes.dao.dto.BPruebaAsoDto;
import com.bbva.PruebaAso.facade.IpruebaAso;

@RestController
@RequestMapping(value = "/prueba")
public class pruebaAso implements IpruebaAso {
	
	@Autowired
	IBPruebaAso aso;

	
	
	@Override
	@PostMapping(value = "/post")
    @ResponseBody
	public void postPruebaAso(@RequestBody BPruebaAsoDto  dto) {
		aso.CreatePrueba(dto);
		
	}

	@Override
	@GetMapping
	public List<BPruebaAsoDto> getPruebaAso() {
		return aso.GetPrueba();
	}

	@Override
	@DeleteMapping(value ="/id")
	public void deletePruebaAso(@PathVariable("id")String id) {
		aso.deletePruebaAso(id);
	}

}
