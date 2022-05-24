package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "mae")
public class Mae {
	
	@Id
	@Column(name = "cpf", length = 11)
	@NotNull
	private char cpfMae;
	
	public char getCpfMae() {
		return cpfMae;
	}
	public void setCpfMae(char cpfMae) {
		this.cpfMae = cpfMae;
	}
	@Column(name = "nome_mae", length = 60)
	@NotNull
	private String nomeMae;
	
	@Column(name = "logradouro_endereco", length = 100)
	@NotNull	
	private String logradouroEndereco;
	
	@Column(name = "numero_endereco")
	@NotNull
	private int numeroEnedereco;
	
	@Column(name = "cep_endereco", length = 8)
	@NotNull
	private char cepEndereco;
	
	@Column(name = "complemento_endereco", length = 200)
	private String complementoEndereco;
	
	@Column(name = "telefone", length = 11)
	@NotNull
	private char telefone;
	
	@Column(name = "nascimento")
	@NotNull
	private LocalDate nascimento;
	
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getLogradouroEndereco() {
		return logradouroEndereco;
	}
	public void setLogradouroEndereco(String logradouroEndereco) {
		this.logradouroEndereco = logradouroEndereco;
	}
	public int getNumeroEnedereco() {
		return numeroEnedereco;
	}
	public void setNumeroEnedereco(int numeroEnedereco) {
		this.numeroEnedereco = numeroEnedereco;
	}
	public char getCepEndereco() {
		return cepEndereco;
	}
	public void setCepEndereco(char cepEndereco) {
		this.cepEndereco = cepEndereco;
	}
	public String getComplementoEndereco() {
		return complementoEndereco;
	}
	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}
	public char getTelefone() {
		return telefone;
	}
	public void setTelefone(char telefone) {
		this.telefone = telefone;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	@Override
	public String toString() {
		return "Mae [cpfMae=" + cpfMae + ", nomeMae=" + nomeMae + ", logradouroEndereco=" + logradouroEndereco
				+ ", numeroEnedereco=" + numeroEnedereco + ", cepEndereco=" + cepEndereco + ", complementoEndereco="
				+ complementoEndereco + ", telefone=" + telefone + ", nascimento=" + nascimento + "]";
	}
	

}
