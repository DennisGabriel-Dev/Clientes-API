package com.crud.clientes.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.crud.clientes.model.Cliente;

@Repository
public class ClienteRepository {
	List<Cliente> clientes = new ArrayList<>();
	private Integer idCliente = 0;
	
	/**
	 * Esse método retorna todos os Clientes cadastrados
	 * @return retorna a lista de clientes
	 * */	
	public List<Cliente> obterTodosClientes(){
		return clientes;
	}
	
	
	/**
	 * Esse método retorna um cliente , caso seja encontrado
	 * @param id do cliente
	 * @return um Cliente 
	 * */
	public Optional<Cliente> obterClientePorId(Integer id) {
		return clientes.stream().filter(cliente -> cliente.getId() == id).findFirst();
	}
	
	
	/**
	 * Esse método delata um cliente pelo Id
	 * @param id do cliente
	 * */
	public void deletarCliente(Integer id) {
		clientes.removeIf(cliente -> cliente.getId() == id);
	}
	
	
	/**
	 * Esse m´todo adiciona um cliente na lista
	 * @param cliente
	 * @return um cliente
	 * */
	public Cliente adicionarCliente(Cliente cliente) {
		idCliente++;
		cliente.setId(idCliente);
		clientes.add(cliente);
		return cliente;
	}
	
	
	/**
	 * Esse método atualiza um cliente
	 * @param cliente
	 * @return um cliente
	 * */
	public Cliente atualizarCliente(Cliente cliente) {
		Optional<Cliente> clienteCapturado = obterClientePorId(cliente.getId());
		// Verifica se o cliente existe , caso não exista a exceção é lançada e o programa para
		if(clienteCapturado.isEmpty()) {
			throw new InputMismatchException("O Cliente não foi cadastrado no sistema.");
		}
		// antes de atualizar o cliente , ele é apagado da lista
		deletarCliente(cliente.getId());
		
		// Dpois de ser apagado da lista , ele é adicionado novamente
		clientes.add(cliente);
		
		return cliente;
	}
}
