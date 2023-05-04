package br.com.paulo.ServiceTests;

import br.com.paulo.Enums.TipoDeOperacao;
import br.com.paulo.Service.CalculadoraService;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraServiceTest {
    @Test
    public void deveCalcularOResultadoDaSomaDeDoisNumeros(){
        CalculadoraService calculadoraService = new CalculadoraService();
        BigDecimal soma = calculadoraService.calcular(TipoDeOperacao.SOMA,
                new BigDecimal("100.00"), new BigDecimal("10.00"));
        Assert.assertEquals(new BigDecimal("110.00"), soma);
    }
    @Test
    public void deveCalcularOResultadoDaSustracaoDeDoisNumeros(){
        CalculadoraService calculadoraService = new CalculadoraService();
        BigDecimal subtracao = calculadoraService.calcular(TipoDeOperacao.SUBTRACAO,
                new BigDecimal("20.00"), new BigDecimal("10.00"));
        Assert.assertEquals(new BigDecimal("10.00"), subtracao);
    }
    @Test
    public void deveCalcularOResultadoDaMultiplicacaoDeDoisNumeros(){
        CalculadoraService calculadoraService = new CalculadoraService();
        BigDecimal multiplicacao = calculadoraService.calcular(TipoDeOperacao.MULTIPLICACAO,
                new BigDecimal("10.00"), new BigDecimal("10.00"));
        Assert.assertEquals(new BigDecimal("100.00"), multiplicacao.setScale(2, RoundingMode.HALF_UP));
        //Precisa Melhorar aqui!
    }
    @Test
    public void deveCalcularOResultadoDaDivisaoDeDoisNumeros(){
        CalculadoraService calculadoraService = new CalculadoraService();
        BigDecimal divisao = calculadoraService.calcular(TipoDeOperacao.DIVISAO,
                new BigDecimal("10.00"), new BigDecimal("10.00"));
        Assert.assertEquals(new BigDecimal("1"), divisao);
    }
}
