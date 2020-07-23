package br.com.cesarmsk.controller;

import java.util.List;

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

import br.com.cesarmsk.data.vo.v1.ExameLaboratorioVO;
import br.com.cesarmsk.services.ExameLaboratorioServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "ExameLaboratorioEndpoint")
@RestController
@RequestMapping("/examelaboratorio/v1")
public class ExameLaboratorioController {
	
	@Autowired
	private ExameLaboratorioServices service;
	
	@ApiOperation(value = "Find All Exames & Laboratories")
	@GetMapping
	public List<ExameLaboratorioVO> findAll() {
		return service.findAll();
	}	
	
	@ApiOperation(value = "Find Exam & Laboratory By id")
	@GetMapping("/{id}")
	public ExameLaboratorioVO findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}	
	
	@ApiOperation(value = "Associate Exam to Laboratory")
	@PostMapping
	public ExameLaboratorioVO create(@RequestBody ExameLaboratorioVO exameLaboratorio) {
		return service.create(exameLaboratorio);
	}
	
	@ApiOperation(value = "Create Update Exam & Laboratory")
	@PutMapping
	public ExameLaboratorioVO update(@RequestBody ExameLaboratorioVO exameLaboratorio) {
		return service.update(exameLaboratorio);
	}	
	
	@ApiOperation(value = "Find Exam & Laboratory By id")
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return ResponseEntity.ok().build();
	}	
	
}
