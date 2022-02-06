package com.dilermando.ordemservicos.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dilermando.ordemservicos.domain.Cliente;
import com.dilermando.ordemservicos.domain.OS;
import com.dilermando.ordemservicos.domain.Tecnico;
import com.dilermando.ordemservicos.domain.enuns.Prioridade;
import com.dilermando.ordemservicos.domain.enuns.Status;
import com.dilermando.ordemservicos.repositories.ClienteRepository;
import com.dilermando.ordemservicos.repositories.OSRepository;
import com.dilermando.ordemservicos.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OSRepository osRepository;

	public void instanciaDB() {

		Tecnico t1 = new Tecnico(null, "Dilermando", "623.813.710-01", "(13) 99999-8888");

		Cliente c1 = new Cliente(null, "Mateus", "019.065.820-76", "(13) 99999-7777");

		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OS1", Status.ANDAMENTO, t1, c1);

		t1.getList().add(os1);
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1 ));
	}
}