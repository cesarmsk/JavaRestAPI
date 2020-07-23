package br.com.cesarmsk.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Query;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;


@Entity
//@Immutable
@Table(name="exame_laboratorio_nomes")
@org.hibernate.annotations.Immutable
//@Subselect("SELECT * FROM exame_laboratorio_nomes")
public class ExameLaboratorioView implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@Column(name = "id", nullable = false, length = 100)
	//private Long id;

	@Column(name = "id_exame", nullable = false, length = 100)
	private Long id_exame;
	
	@Column(name = "nome_exame", nullable = false, length = 100)
	private String nome_exame;
	
	@Column(name= "tipo", nullable = false, length = 100)
	private String tipo;
	
	@Column(name = "status_exame",nullable = false, length = 100)
	private String status_exame;
	
	@Column(name = "id_laboratorio", nullable = false, length = 100)
	private Long id_laboratorio;
	
	@Column(name = "nome_laboratorio", nullable = false, length = 100)
	private String nome_laboratorio;
	
	@Column(name= "endereco", nullable = false, length = 100)
	private String endereco;
	
	@Column(name = "status_laboratorio",nullable = false, length = 100)
	private String status_laboratorio;
	
	
	public ExameLaboratorioView() {
	}

	public Long getId() {
		return id;
	}

	public Long getIdExame() {
		return id_exame;
	}
	
	

	public String getNomeExame() {
		return nome_exame;
	}
	


	public String getTipo() {
		return tipo;
	}
	
	public String getStatusExame() {
		return status_exame;
	}
	
	public Long getIdLaboratorio() {
		return id_laboratorio;
	}
	
	public String getNomeLaboratorio() {
		return nome_laboratorio;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getStatusLaboratorio() {
		return status_laboratorio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((id_exame == null) ? 0 : id_exame.hashCode());
		result = prime * result + ((nome_exame == null) ? 0 : nome_exame.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((status_exame == null) ? 0 : status_exame.hashCode());
		result = prime * result + ((id_laboratorio == null) ? 0 : id_laboratorio.hashCode());
		result = prime * result + ((nome_laboratorio == null) ? 0 : nome_laboratorio.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((status_laboratorio == null) ? 0 : status_laboratorio.hashCode());
		
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExameLaboratorioView other = (ExameLaboratorioView) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (id_exame == null) {
			if (other.id_exame != null)
				return false;
		} else if (!id_exame.equals(other.id_exame))
			return false;
		if (nome_exame == null) {
			if (other.nome_exame != null)
				return false;
		} else if (!nome_exame.equals(other.nome_exame))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (status_exame == null) {
			if (other.status_exame != null)
				return false;
		} else if (!status_exame.equals(other.status_exame))
			return false;
		if (id_laboratorio == null) {
			if (other.id_laboratorio != null)
				return false;
		} else if (!id_laboratorio.equals(other.id_laboratorio))
			return false;
		if (nome_laboratorio == null) {
			if (other.nome_laboratorio != null)
				return false;
		} else if (!nome_laboratorio.equals(other.nome_laboratorio))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (status_laboratorio == null) {
			if (other.status_laboratorio != null)
				return false;
		} else if (!status_laboratorio.equals(other.status_laboratorio))
			return false;
		
		
		
		return true;
	}
}
