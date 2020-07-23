package br.com.cesarmsk.data.vo.v1;

import java.io.Serializable;

public class ExameLaboratorioVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long id_exame;
	private Long id_laboratorio;

	
	public ExameLaboratorioVO() {
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
		ExameLaboratorioVO other = (ExameLaboratorioVO) obj;
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
