package com.devsuperior.dsvendas4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas4.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
