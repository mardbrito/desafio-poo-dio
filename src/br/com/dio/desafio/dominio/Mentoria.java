package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	
	private LocalDate data;
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "\nMentorias: Título=" + getTitulo() + ", Descricao=" + getDescricao() + ", Data=" + data + "\n";
	}
	
	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}
	
	
	
	
}
