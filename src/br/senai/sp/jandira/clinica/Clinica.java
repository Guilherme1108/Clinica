package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {
		

		// Criando um objeto paciente
		Paciente p1 = new Paciente();
		p1.setNome("Jó Soares");
		p1.setAltura(1.65);
		p1.peso = 51;
		p1.telefone = "(11)99999-8888";
		p1.dataNascimento = LocalDate.of(2003, 7, 15);
		
		Paciente p2 = new Paciente();
		p2.setNome("Guilherme Moreira");
		p2.setAltura(1.77);
		p2.peso = 53;
		p2.telefone = "(11)55555-4444";
		p2.dataNascimento = LocalDate.of(2008, 8, 11);
		
		// Exibindo a refência dos objetos
		System.out.println(p1);
		System.out.println(p2);
		
		Paciente p3 = p1;
		
		System.out.println(p3);
		
		// Exibindo os dados dos objetos
		p1.mostrarFichaDoPaciente();
		p2.mostrarFichaDoPaciente();
	}

}
