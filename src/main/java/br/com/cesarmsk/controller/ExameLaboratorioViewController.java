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

import br.com.cesarmsk.data.vo.v1.ExameLaboratorioViewVO;
import br.com.cesarmsk.services.ExameLaboratorioViewServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "ExameLaboratorioViewEndpoint")
@RestController
@RequestMapping("/examelaboratorioview/v1")
public class ExameLaboratorioViewController {
	
	@Autowired
	private ExameLaboratorioViewServices service;
	
	@ApiOperation(value = "Find All Exam & Laboratory Names")
	@GetMapping
	public List<ExameLaboratorioViewVO> findAll() {
		return service.findAll();
	}	
	
	@ApiOperation(value = "Find Exam & Laboratory Names By id")
	@GetMapping("/{id}")
	public ExameLaboratorioViewVO findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}	
	
	
	
}
