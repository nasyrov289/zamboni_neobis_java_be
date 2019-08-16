package com.kidsguru.shop.repositories;

import com.kidsguru.shop.entities.ShippingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepository extends JpaRepository<ShippingEntity, Integer> {
}
