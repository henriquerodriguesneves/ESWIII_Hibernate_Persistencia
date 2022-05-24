package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "residente")
public class Residente extends Medico{
	
	@Column(name = "instituicao_ensino", length = 50)
	@NotNull
	private String instituicaoEnsino;
	
	@Column(name = "anoIngresso")
	@NotNull
	private int anoIngresso;
	
	public String getInstituicaoEnsino() {
		return instituicaoEnsino;
	}
	public void setInstituicaoEnsino(String instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}
	public int getAnoIngresso() {
		return anoIngresso;
	}
	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	@Override
	public String toString() {
		return "Residente [instituicaoEnsino=" + instituicaoEnsino + ", anoIngresso=" + anoIngresso + "]";
	}
	
	
}
