package com.crud.clientes.model.error;

public class ErrorMessage {
	private String titulo;
	private Integer status;
	private String mensagem;
	
	public ErrorMessage(String titulo, Integer status, String mensagem) {
		this.titulo = titulo;
		this.status = status;
		this.mensagem = mensagem;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}
}
