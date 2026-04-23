package com.programmingtechie.inventory_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.programmingtechie.inventory_service.model.Inventory;
import com.programmingtechie.inventory_service.repo.InventoryRepo;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    // @Bean
    // public CommandLineRunner loadData(InventoryRepo inventoryRepository) {
    //     return args -> {

    //         Inventory inventory = new Inventory();
    //         inventory.setSkuCode("Honor");
    //         inventory.setQuantity(10000);

    //         Inventory inventory1 = new Inventory();
    //         inventory1.setSkuCode("I pad");
    //         inventory1.setQuantity(600);
    //         inventoryRepository.save(inventory);
    //         inventoryRepository.save(inventory1);

    //         System.out.println("Data loaded into Database successfully!");
    //     };
    // }

}
