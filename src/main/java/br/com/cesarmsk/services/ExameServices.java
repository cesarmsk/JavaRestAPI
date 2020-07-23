package br.com.cesarmsk.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesarmsk.converter.DozerConverter;
import br.com.cesarmsk.data.model.Exame;
import br.com.cesarmsk.data.vo.v1.ExameVO;
import br.com.cesarmsk.exception.ResourceNotFoundException;
import br.com.cesarmsk.repository.ExameRepository;

@Service
public class ExameServices {
	
	@Autowired
	ExameRepository repository;
		
	public ExameVO create(ExameVO Exame) {
		var entity = DozerConverter.parseObject(Exame, Exame.class);
		var vo = DozerConverter.parseObject(repository.save(entity), ExameVO.class);
		return vo;
	}
	
	public List<ExameVO> findAll() {
		return DozerConverter.parseListObjects(repository.findAll(), ExameVO.class);
	}	
	
	public ExameVO findById(Long id) {

		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		return DozerConverter.parseObject(entity, ExameVO.class);
	}
		
	public ExameVO update(ExameVO Exame) {
		var entity = repository.findById(Exame.getId())
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		
		entity.setNome(Exame.getNome());
		entity.setTipo(Exame.getTipo());
		entity.setStatus(Exame.getStatus());
		
		var vo = DozerConverter.parseObject(repository.save(entity), ExameVO.class);
		return vo;
	}	
	
	public void delete(Long id) {
		Exame entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		repository.delete(entity);
	}

}
