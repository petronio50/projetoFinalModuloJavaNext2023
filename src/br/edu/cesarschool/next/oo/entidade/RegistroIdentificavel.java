package br.edu.cesarschool.next.oo.entidade;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;

public abstract class RegistroIdentificavel implements Serializable {

	private LocalDateTime dataHoraCriacao;
	
	private static final long serialVersionUID = 1L;
	
	public long obterTempoDeCriacao() {
		LocalDateTime dataAtual = LocalDateTime.now();
		Duration duracao = Duration.between(dataHoraCriacao, dataAtual);
		return duracao.toDays();
		//substitui as linhas 15 e 16 - return Duration.between(dataHoraCriacao, dataAtual).toDays();
		
	}
	
		
public LocalDateTime getDataHoraCriacao() {
		return dataHoraCriacao;
	}

	public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
		this.dataHoraCriacao = dataHoraCriacao;
	}


public abstract String obterChave();

}



