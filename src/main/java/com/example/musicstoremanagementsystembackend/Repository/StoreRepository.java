package com.example.musicstoremanagementsystembackend.Repository;

import com.example.musicstoremanagementsystembackend.Model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, String> {
}
