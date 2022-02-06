package com.dilermando.ordemservicos.domain;

import java.io.Serializable;

import javax.persistence.Entity;



@Entity(name = "TB_TECNICO")
public class Tecnico extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;

	
	
	public Tecnico() {
		super();
	}

	public Tecnico(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);
	}

	

	
}