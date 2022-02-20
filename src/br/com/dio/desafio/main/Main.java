package br.com.dio.desafio.main;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
	
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Descricao do curso de Java");
		curso1.setCargaHoraria(8);
		
		curso2.setTitulo("Curso de JS");
		curso2.setDescricao("Descricao do curso de JS");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descricao da mentoria de Java");
		mentoria.setData(LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		Dev devMarcelo = new Dev();
		devMarcelo.setNome("Marcelo");
		devMarcelo.inscreverBootcamp(bootcamp);
//		devMarcelo.progredir();
//		devMarcelo.progredir();
		System.out.println("Conteúdos inscritos de Marcelo: " + devMarcelo.getConteudosInscritos());
		System.out.println("----");
		System.out.println("Conteúdos inscritos de Marcelo: " + devMarcelo.getConteudosInscritos());
		System.out.println("Conteúdos concluídos de Marcelo: " + devMarcelo.getConteudosConcluidos());
		System.out.println("XP de Marcelo: " + devMarcelo.calcularTotalXp());
		
		System.out.println("---------------------------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		devJoao.progredir();
		System.out.println("Conteúdos inscritos de João: " + devJoao.getConteudosInscritos());
		System.out.println("----");
		System.out.println("Conteúdos inscritos de Joao: " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos concluídos de João: " + devJoao.getConteudosConcluidos());
		System.out.println("XP de João: " + devJoao.calcularTotalXp());
		

	}

}
