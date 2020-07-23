package br.com.cesarmsk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cesarmsk.data.model.Exame;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Long>{

}
