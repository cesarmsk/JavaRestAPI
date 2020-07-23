package br.com.cesarmsk.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesarmsk.converter.DozerConverter;
import br.com.cesarmsk.data.model.ExameLaboratorioView;
import br.com.cesarmsk.data.vo.v1.ExameLaboratorioViewVO;
import br.com.cesarmsk.exception.ResourceNotFoundException;
import br.com.cesarmsk.repository.ExameLaboratorioViewRepository;

@Service

public class ExameLaboratorioViewServices {
	
	@Autowired
	ExameLaboratorioViewRepository repository;
		
	public ExameLaboratorioViewVO create(ExameLaboratorioViewVO ExameLaboratorioView) {
		var entity = DozerConverter.parseObject(ExameLaboratorioView, ExameLaboratorioView.class);
		var vo = DozerConverter.parseObject(repository.save(entity), ExameLaboratorioViewVO.class);
		return vo;
	}
	
	public List<ExameLaboratorioViewVO> findAll() {
		return DozerConverter.parseListObjects(repository.findAll(), ExameLaboratorioViewVO.class);
	}	
	
	public ExameLaboratorioViewVO findById(Long id) {

		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		return DozerConverter.parseObject(entity, ExameLaboratorioViewVO.class);
	}
		
	

}
