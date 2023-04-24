package com.crud.clientes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.clientes.model.Cliente;
import com.crud.clientes.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	ClienteRepository clienteRepository;
	
	/**
	 * Esse método retorna todos os Clientes cadastrados
	 * @return retorna a lista de clientes
	 * */
	public List<Cliente> obterTodosClientes(){
		return clienteRepository.obterTodosClientes();
	}
	
	/**
	 * Esse método retorna um cliente , caso seja encontrado
	 * @param id do cliente
	 * @return um Cliente 
	 * */
	public Optional<Cliente> obterClientePorId(Integer id) {
		return clienteRepository.obterClientePorId(id);
	}
	

	/**
	 * Esse método delata um cliente pelo Id
	 * @param id do cliente
	 * */
	public void deletarCliente(Integer id) {
		 clienteRepository.deletarCliente(id);
	}
	
	/**
	 * Esse m´todo adiciona um cliente na lista
	 * @param cliente
	 * @return um cliente
	 * */
	public Cliente adicionarCliente(Cliente cliente) {
		return clienteRepository.adicionarCliente(cliente);
	}
	
	/**
	 * Esse método atualiza um cliente
	 * @param cliente
	 * @return um cliente
	 * */
	public Cliente atualizarCliente(Integer id, Cliente cliente) {
		cliente.setId(id);
		return clienteRepository.atualizarCliente(cliente);
	}
	
	
	
}
