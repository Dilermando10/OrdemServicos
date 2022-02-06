package com.dilermando.ordemservicos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilermando.ordemservicos.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}