package br.com.cesarmsk.converter.mocks;

import java.util.ArrayList;
import java.util.List;

import br.com.cesarmsk.data.model.Exame;
import br.com.cesarmsk.data.vo.v1.ExameVO;

public class MockExame {


    public Exame mockEntity() {
    	return mockEntity(0);
    }
    
    public ExameVO mockVO() {
    	return mockVO(0);
    }
    
    public List<Exame> mockEntityList() {
        List<Exame> exames = new ArrayList<Exame>();
        for (int i = 0; i < 14; i++) {
            exames.add(mockEntity(i));
        }
        return exames;
    }

    public List<ExameVO> mockVOList() {
        List<ExameVO> exames = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            exames.add(mockVO(i));
        }
        return exames;
    }
    
    private Exame mockEntity(Integer number) {
    	Exame exame = new Exame();
    	exame.setStatus(((number % 2)==0) ? "ativo" : "inativo");
    	exame.setTipo(((number % 2)==0) ? "analise clinica" : "imagem");
    	exame.setId(number.longValue());
        exame.setNome("Exame" + number);
        return exame;
    }

    private ExameVO mockVO(Integer number) {
    	ExameVO exame = new ExameVO();
    	exame.setStatus(((number % 2)==0) ? "ativo" : "inativo");
    	exame.setTipo(((number % 2)==0) ? "analise clinica" : "imagem");
        exame.setId(number.longValue());
        exame.setNome("Exame" + number);
        return exame;
    }

}
