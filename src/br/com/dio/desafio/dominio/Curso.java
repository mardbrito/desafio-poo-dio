package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Curso extends Conteudo{
	
	private int cargaHoraria;
	
	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}
	
}
