package com.dilermando.ordemservicos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dilermando.ordemservicos.domain.OS;

@Repository
public interface OSRepository extends JpaRepository<OS, Integer> {

}