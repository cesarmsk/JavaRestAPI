package br.com.cesarmsk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cesarmsk.data.model.ExameLaboratorioView;



//import org.springframework.data.repository.CrudRepository;

@Repository
//public interface ExameLaboratorioViewRepository extends CrudRepository<ExameLaboratorioView, Long> {
//}

//import org.springframework.data.rest.core.annotation.RestResource;
//@Repository
//@RestResource

public interface ExameLaboratorioViewRepository extends JpaRepository<ExameLaboratorioView, Long>{

}
