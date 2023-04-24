package com.crud.clientes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.clientes.model.Cliente;
import com.crud.clientes.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
	@Autowired
	ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> obterTodosClientes(){
		return clienteService.obterTodosClientes();
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> obterClientePorId(@PathVariable Integer id) {
		return clienteService.obterClientePorId(id);
	}
	
	@PostMapping
	public Cliente adicionarCliente(@RequestBody Cliente cliente) {
		return clienteService.adicionarCliente(cliente);
	}
	
	@DeleteMapping("/{id}")
	public void deletarCliente(@PathVariable Integer id) {
		clienteService.deletarCliente(id);
	}
	
	@PutMapping("/{id}")
	public Cliente atualizarCliente(@PathVariable Integer id, @RequestBody Cliente cliente) {
		return clienteService.atualizarCliente(id, cliente);
	}
	
}
