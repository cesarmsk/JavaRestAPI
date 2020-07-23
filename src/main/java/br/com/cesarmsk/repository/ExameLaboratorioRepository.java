package br.com.cesarmsk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cesarmsk.data.model.ExameLaboratorio;

@Repository
public interface ExameLaboratorioRepository extends JpaRepository<ExameLaboratorio, Long>{

}
