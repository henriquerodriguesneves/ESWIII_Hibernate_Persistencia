package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebe_medico")
public class BebeMedico {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "cpf")
	@NotNull
	private Bebe bebe;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "crm")
	@NotNull
	private Medico medico;
	
	public Bebe getBebe() {
		return bebe;
	}
	public void setBebe(Bebe bebe) {
		this.bebe = bebe;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	@Override
	public String toString() {
		return "BebeMedico [bebe=" + bebe + ", medico=" + medico + "]";
	}
	
	

}
