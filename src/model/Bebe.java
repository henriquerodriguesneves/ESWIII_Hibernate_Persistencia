package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebe")
public class Bebe {
	
	@Id
	@Column(name = "cpf", length = 11)
	@NotNull
	private char cpf;
	
	@Column(name = "nome", length = 60)
	@NotNull
	private String nome;
	
	@Column(name = "data_nasc")
	@NotNull
	private LocalDate dataNasc;
	
	@Column(name = "altura")
	@NotNull
	private float altura;
	
	@ManyToOne
	@JoinColumn(name = "cpf_mae")
	@NotNull
	private Mae mae;
	
	public char getCpf() {
		return cpf;
	}
	public void setCpf(char cpf) {
		this.cpf = cpf;
	}
	public Mae getMae() {
		return mae;
	}
	public void setMae(Mae mae) {
		this.mae = mae;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Bebe [cpf=" + cpf + ", nome=" + nome + ", dataNasc=" + dataNasc + ", altura=" + altura + ", mae=" + mae
				+ "]";
	}
	
	
	
	

}
