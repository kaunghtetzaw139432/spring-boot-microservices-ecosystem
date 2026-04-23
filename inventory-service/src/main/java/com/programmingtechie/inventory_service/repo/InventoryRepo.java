package com.programmingtechie.inventory_service.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.programmingtechie.inventory_service.model.Inventory;
@Repository
public interface InventoryRepo extends JpaRepository<Inventory,Long>{

   List<Inventory> findBySkuCodeIn(List<String> skuCode);

}
