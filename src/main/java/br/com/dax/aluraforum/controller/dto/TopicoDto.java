package br.com.dax.aluraforum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.dax.aluraforum.model.Topico;

public class TopicoDto {
	
	public TopicoDto (Topico topico) {
		this.id = topico.getId();
		this.dataCriacao = topico.getDataCriacao();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
	}
	
	private Long id;
	
	private String titulo;
	
	private String mensagem;
	
	private LocalDateTime dataCriacao;
	
	public Long getId() {
		return id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public static List<TopicoDto> converter(List<Topico> topicos) {
		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
	}
}
