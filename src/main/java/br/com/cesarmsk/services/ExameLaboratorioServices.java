package br.com.cesarmsk.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesarmsk.converter.DozerConverter;
import br.com.cesarmsk.data.model.ExameLaboratorio;
import br.com.cesarmsk.data.vo.v1.ExameLaboratorioVO;
import br.com.cesarmsk.exception.ResourceNotFoundException;
import br.com.cesarmsk.repository.ExameLaboratorioRepository;

@Service
public class ExameLaboratorioServices {
	
	@Autowired
	ExameLaboratorioRepository repository;
		
	public ExameLaboratorioVO create(ExameLaboratorioVO ExameLaboratorio) {
		var entity = DozerConverter.parseObject(ExameLaboratorio, ExameLaboratorio.class);
		var vo = DozerConverter.parseObject(repository.save(entity), ExameLaboratorioVO.class);
		return vo;
	}
	
	public List<ExameLaboratorioVO> findAll() {
		return DozerConverter.parseListObjects(repository.findAll(), ExameLaboratorioVO.class);
	}	
	
	public ExameLaboratorioVO findById(Long id) {

		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		return DozerConverter.parseObject(entity, ExameLaboratorioVO.class);
	}
		
	public ExameLaboratorioVO update(ExameLaboratorioVO ExameLaboratorio) {
		var entity = repository.findById(ExameLaboratorio.getId())
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		entity.setId(ExameLaboratorio.getId());
		entity.setIdExame(ExameLaboratorio.getIdExame());
		entity.setIdLaboratorio(ExameLaboratorio.getIdLaboratorio());
		
		
		var vo = DozerConverter.parseObject(repository.save(entity), ExameLaboratorioVO.class);
		return vo;
	}	
	
	public void delete(Long id) {
		ExameLaboratorio entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		repository.delete(entity);
	}

}
