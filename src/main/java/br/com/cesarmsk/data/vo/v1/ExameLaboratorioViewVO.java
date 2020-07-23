package br.com.cesarmsk.data.vo.v1;

import java.io.Serializable;

public class ExameLaboratorioViewVO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private Long id_exame;
	private String nome_exame;
	private String tipo;
	private String status_exame;
	
	private Long id_laboratorio;
	private String nome_laboratorio;
	private String endereco;
	private String status_laboratorio;
	
	public ExameLaboratorioViewVO() {
	}

	public Long getId() {
		return id_exame;
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

	public String getNomeExame() {
		return nome_exame;
	}

	public void setNomeExame(String nome_exame) {
		this.nome_exame = nome_exame;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getStatusExame() {
		return status_exame;
	}
	
	public void setStatusExame(String status_exame) {
		this.status_exame = status_exame;
	}

	
	public Long getIdLaboratorio() {
		return id_laboratorio;
	}

	public void setIdLaboratorio(Long id_laboratorio) {
		this.id_laboratorio = id_laboratorio;
	}

	public String getNomeLaboratorio() {
		return nome_laboratorio;
		
	}

	public void setNomeLaboratorio(String nome_laboratorio) {
		this.nome_laboratorio = nome_laboratorio;
	}
	
	public String getEndereco() {
		return tipo;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getStatusLaboratorio() {
		return status_laboratorio;
	}

	public void setStatusLaboratorio(String status_laboratorio) {
		this.status_laboratorio = status_laboratorio;
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
		ExameLaboratorioViewVO other = (ExameLaboratorioViewVO) obj;
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
