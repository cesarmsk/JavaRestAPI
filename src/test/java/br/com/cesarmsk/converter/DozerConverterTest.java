package br.com.cesarmsk.converter;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cesarmsk.converter.mocks.MockExame;
import br.com.cesarmsk.data.model.Exame;
import br.com.cesarmsk.data.vo.v1.ExameVO;

public class DozerConverterTest {
	
    MockExame inputObject;

    @Before
    public void setUp() {
        inputObject = new MockExame();
    }

    @Test
    public void parseEntityToVOTest() {
        ExameVO output = DozerConverter.parseObject(inputObject.mockEntity(), ExameVO.class);
        Assert.assertEquals(Long.valueOf(0L), output.getId());
        Assert.assertEquals("Exame0", output.getNome());
        Assert.assertEquals("analise clinica", output.getTipo());
        Assert.assertEquals("ativo", output.getStatus());
    }

    @Test
    public void parseEntityListToVOListTest() {
        List<ExameVO> outputList = DozerConverter.parseListObjects(inputObject.mockEntityList(), ExameVO.class);
        ExameVO outputZero = outputList.get(0);
        
        Assert.assertEquals(Long.valueOf(0L), outputZero.getId());
        Assert.assertEquals("Exame0", outputZero.getNome());
        Assert.assertEquals("analise clinica", outputZero.getTipo());
        Assert.assertEquals("ativo", outputZero.getStatus());
        
        ExameVO outputSeven = outputList.get(7);
        
        Assert.assertEquals(Long.valueOf(7L), outputSeven.getId());
        Assert.assertEquals("Exame7", outputSeven.getNome());
        Assert.assertEquals("imagem", outputSeven.getTipo());
        Assert.assertEquals("inativo", outputSeven.getStatus());
  
        
        ExameVO outputTwelve = outputList.get(12);
        
        Assert.assertEquals(Long.valueOf(12L), outputTwelve.getId());
        Assert.assertEquals("Exame12", outputTwelve.getNome());
        Assert.assertEquals("analise clinica", outputTwelve.getTipo());
        Assert.assertEquals("ativo", outputTwelve.getStatus());
  
    }

    @Test
    public void parseVOToEntityTest() {
        Exame output = DozerConverter.parseObject(inputObject.mockVO(), Exame.class);
        Assert.assertEquals(Long.valueOf(0L), output.getId());
        Assert.assertEquals("Exame0", output.getNome());
        Assert.assertEquals("analise clinica", output.getTipo());
        Assert.assertEquals("ativo", output.getStatus());
    }

    @Test
    public void parserVOListToEntityListTest() {
        List<Exame> outputList = DozerConverter.parseListObjects(inputObject.mockVOList(), Exame.class);
        Exame outputZero = outputList.get(0);
        
        Assert.assertEquals(Long.valueOf(0L), outputZero.getId());
        Assert.assertEquals("Exame0", outputZero.getNome());
        Assert.assertEquals("analise clinica", outputZero.getTipo());
        Assert.assertEquals("ativo", outputZero.getStatus());
                
        Exame outputSeven = outputList.get(7);
        
        Assert.assertEquals(Long.valueOf(7L), outputSeven.getId());
        Assert.assertEquals("Exame7", outputSeven.getNome());
        Assert.assertEquals("imagem", outputSeven.getTipo());
        Assert.assertEquals("inativo", outputSeven.getStatus());
  
        
        Exame outputTwelve = outputList.get(12);
        
        Assert.assertEquals(Long.valueOf(12L), outputTwelve.getId());
        Assert.assertEquals(Long.valueOf(12L), outputTwelve.getId());
        Assert.assertEquals("Exame12", outputTwelve.getNome());
        Assert.assertEquals("analise clinica", outputTwelve.getTipo());
        Assert.assertEquals("ativo", outputTwelve.getStatus());
  
    }
}
