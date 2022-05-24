package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "medico")
@Inheritance(strategy = InheritanceType.JOINED)
public class Medico {
	
	@Id
	@Column(name = "crm", length = 7)
	@NotNull
	private char crm;
	
	@Column(name = "nome", length = 60)
	@NotNull
	private String nome;
	
	@Column(name = "telefone_celular", length = 11)
	@NotNull
	private char telefoneCelular;
	
	@Column(name = "especialidade", length = 30)
	@NotNull
	private String especialidade;
	
	public char getCrm() {
		return crm;
	}
	public void setCrm(char crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(char telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	

}
