package br.com.paulo.ServiceTests;

import br.com.paulo.Enums.Desempenho;
import br.com.paulo.Model.Funcionario;
import br.com.paulo.Service.ReajustePorDesempenhoService;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ReajustePorDesenpenhoServiceTest {
    @Test
    public void naoDevereajustarFuncionarioComDesempenhoREGULAR(){
        ReajustePorDesempenhoService rpd = new ReajustePorDesempenhoService();
        BigDecimal valorReajustado = rpd.reajuste(Desempenho.REGULAR, new Funcionario
                ("Teste", "rgc123456" , "Desenvolvedor Senior Java",
                        new BigDecimal("7000.00")));
        Assert.assertEquals(new BigDecimal("7000.00"), valorReajustado);
    }
    @Test
    public void reajustandoFuncionarioComDesempenhoBOM(){
        ReajustePorDesempenhoService rpd = new ReajustePorDesempenhoService();
        BigDecimal valorReajustado = rpd.reajuste(Desempenho.BOM, new Funcionario
                ("Teste", "rgc123456" , "Desenvolvedor Senior Java",
                        new BigDecimal("6000.00")));
        Assert.assertEquals(new BigDecimal("6600.00"), valorReajustado);
    }
    @Test
    public void reajustandoFuncionarioComDesempenhoEXELENTE(){
        ReajustePorDesempenhoService rpd = new ReajustePorDesempenhoService();
        BigDecimal valorReajustado = rpd.reajuste(Desempenho.EXECELENTE, new Funcionario
                ("Teste", "rgc123456" , "Desenvolvedor Senior Java",
                        new BigDecimal("8000.00")));
        Assert.assertEquals(new BigDecimal("9600.00"), valorReajustado);
    }
}
