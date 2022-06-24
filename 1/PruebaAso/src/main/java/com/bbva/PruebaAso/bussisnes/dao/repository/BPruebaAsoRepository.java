package com.bbva.PruebaAso.bussisnes.dao.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bbva.PruebaAso.bussisnes.dao.model.PruebaAsoEntity;

@Repository
public interface BPruebaAsoRepository extends JpaRepository<PruebaAsoEntity, String> {

}
