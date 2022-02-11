package com.bouaziz.gestiondestock.repository;

import com.bouaziz.gestiondestock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
