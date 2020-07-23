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

import br.com.cesarmsk.data.vo.v1.ExameVO;
import br.com.cesarmsk.services.ExameServices;


@Api(tags = "ExameEndpoint")
@RestController
@RequestMapping("/exame/v1")
public class ExameController {
	
	@Autowired
	private ExameServices service;
	
	@ApiOperation(value = "Find All Exames")
	@GetMapping
	public List<ExameVO> findAll() {
		return service.findAll();
	}	
	
	@ApiOperation(value = "Find Exam By id")
	@GetMapping("/{id}")
	public ExameVO findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}	
	
	@ApiOperation(value = "Create Exam")
	@PostMapping
	public ExameVO create(@RequestBody ExameVO exame) {
		return service.create(exame);
	}

	@ApiOperation(value = "Update Exam")	
	@PutMapping
	public ExameVO update(@RequestBody ExameVO exame) {
		return service.update(exame);
	}	
	
	@ApiOperation(value = "Delete Exam By id")
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return ResponseEntity.ok().build();
	}	
	
}
