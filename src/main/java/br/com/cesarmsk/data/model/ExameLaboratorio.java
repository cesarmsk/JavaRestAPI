package br.com.cesarmsk.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="exame_laboratorio")
public class ExameLaboratorio implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "id_exame", nullable = false, length = 100)
	private Long id_exame;
	
	@Column(name = "id_laboratorio", nullable = false, length = 100)
	private Long id_laboratorio;
	
	public ExameLaboratorio() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdExame() {
		return id_exame;
	}

	public void setIdExame(Long id_exame) {
		this.id_exame = id_exame;
	}

	public Long getIdLaboratorio() {
		return id_laboratorio;
	}

	public void setIdLaboratorio(Long id_laboratorio) {
		this.id_laboratorio = id_laboratorio;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((id_exame == null) ? 0 : id_exame.hashCode());
		result = prime * result + ((id_laboratorio == null) ? 0 : id_laboratorio.hashCode());
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
		ExameLaboratorio other = (ExameLaboratorio) obj;
		
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
		if (id_laboratorio == null) {
			if (other.id_laboratorio != null)
				return false;
		} else if (!id_laboratorio.equals(other.id_laboratorio))
			return false;	
		
		return true;
	}
}
