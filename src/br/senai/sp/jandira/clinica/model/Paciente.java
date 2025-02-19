package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {

	public String nome;
	public LocalDate dataNascimento;
	public int peso;
	public double altura;
	public String telefone;
	
	public void calcularIdade() {
		
	}
	
	public void calcularImc() {
		
	}
	
	public void classificarImc() {
		
	}
	
	public void mostrarFichaDoPaciente() {
		System.out.println("==========================");
		System.out.println("DADOS DO PACIENTE");
		System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("Telefone: " + telefone);
		System.out.println("==========================");
		System.out.println();
	}
	
}
