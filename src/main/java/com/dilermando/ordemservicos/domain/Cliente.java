package com.dilermando.ordemservicos.domain;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity(name = "TB_CLIENTE")
public class Cliente extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	
	public Cliente() {
		super();
	}

	public Cliente(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);
	}

	
	
}