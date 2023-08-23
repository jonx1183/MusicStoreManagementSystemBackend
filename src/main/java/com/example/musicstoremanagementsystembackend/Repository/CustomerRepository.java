package com.example.musicstoremanagementsystembackend.Repository;

import com.example.musicstoremanagementsystembackend.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
