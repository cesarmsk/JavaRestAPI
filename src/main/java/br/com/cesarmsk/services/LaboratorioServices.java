package br.com.cesarmsk.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesarmsk.converter.DozerConverter;
import br.com.cesarmsk.data.model.Laboratorio;
import br.com.cesarmsk.data.vo.v1.LaboratorioVO;
import br.com.cesarmsk.exception.ResourceNotFoundException;
import br.com.cesarmsk.repository.LaboratorioRepository;

@Service
public class LaboratorioServices {
	
	@Autowired
	LaboratorioRepository repository;
		
	public LaboratorioVO create(LaboratorioVO Laboratorio) {
		var entity = DozerConverter.parseObject(Laboratorio, Laboratorio.class);
		var vo = DozerConverter.parseObject(repository.save(entity), LaboratorioVO.class);
		return vo;
	}
	
	public List<LaboratorioVO> findAll() {
		return DozerConverter.parseListObjects(repository.findAll(), LaboratorioVO.class);
	}	
	
	public LaboratorioVO findById(Long id) {

		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		return DozerConverter.parseObject(entity, LaboratorioVO.class);
	}
		
	public LaboratorioVO update(LaboratorioVO Laboratorio) {
		var entity = repository.findById(Laboratorio.getId())
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		
		entity.setNome(Laboratorio.getNome());
		entity.setEndereco(Laboratorio.getEndereco());
		entity.setStatus(Laboratorio.getStatus());
		
		var vo = DozerConverter.parseObject(repository.save(entity), LaboratorioVO.class);
		return vo;
	}	
	
	public void delete(Long id) {
		Laboratorio entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		repository.delete(entity);
	}

}
