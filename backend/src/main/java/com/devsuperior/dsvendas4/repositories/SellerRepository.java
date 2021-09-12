package com.devsuperior.dsvendas4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas4.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
	
}
