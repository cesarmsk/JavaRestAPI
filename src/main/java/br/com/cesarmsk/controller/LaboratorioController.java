package br.com.cesarmsk.controller;

import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cesarmsk.data.vo.v1.LaboratorioVO;
import br.com.cesarmsk.services.LaboratorioServices;

@Api(tags = "LaboratorioEndpoint")
@RestController
@RequestMapping("/laboratorio/v1")
public class LaboratorioController {
	
	@Autowired
	private LaboratorioServices service;
	
	@ApiOperation(value = "Find AllLaboratories")
	@GetMapping
	public List<LaboratorioVO> findAll() {
		return service.findAll();
	}	
	
	@ApiOperation(value = "Find Laboratory By id")
	@GetMapping("/{id}")
	public LaboratorioVO findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}	
	
	@ApiOperation(value = "Create Laboratory")
	@PostMapping
	public LaboratorioVO create(@RequestBody LaboratorioVO laboratorio) {
		return service.create(laboratorio);
	}
	
	@ApiOperation(value = "Update Laboratory")
	@PutMapping
	public LaboratorioVO update(@RequestBody LaboratorioVO laboratorio) {
		return service.update(laboratorio);
	}	
	
	@ApiOperation(value = "Delete Laboratory")
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return ResponseEntity.ok().build();
	}	
	
}
