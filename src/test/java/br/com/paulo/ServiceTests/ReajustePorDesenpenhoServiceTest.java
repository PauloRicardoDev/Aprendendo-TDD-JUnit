package br.com.paulo.ServiceTests;

import br.com.paulo.Enums.Desempenho;
import br.com.paulo.Model.Funcionario;
import br.com.paulo.Service.ReajustePorDesempenhoService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class ReajustePorDesenpenhoServiceTest {

    private ReajustePorDesempenhoService reajustePorDesempenhoService;
    private Funcionario funcionario;

    @Before
    public void inicializar(){
        this.reajustePorDesempenhoService = new ReajustePorDesempenhoService();
        this.funcionario = new Funcionario
                ("Teste", "rgc123456" , "Desenvolvedor Senior Java",
                        new BigDecimal("7000.00"));
    }

    @Test
    public void naoDevereajustarFuncionarioComDesempenhoREGULAR(){
        BigDecimal valorReajustado = reajustePorDesempenhoService.reajuste(Desempenho.REGULAR, funcionario);
        Assert.assertEquals(new BigDecimal("7000.00"), valorReajustado);
    }
    @Test
    public void reajustandoFuncionarioComDesempenhoBOM(){
        BigDecimal valorReajustado = reajustePorDesempenhoService.reajuste(Desempenho.BOM, funcionario);
        Assert.assertEquals(new BigDecimal("6600.00"), valorReajustado);
    }
    @Test
    public void reajustandoFuncionarioComDesempenhoEXELENTE(){
        BigDecimal valorReajustado = reajustePorDesempenhoService.reajuste(Desempenho.EXECELENTE, funcionario);
        Assert.assertEquals(new BigDecimal("9600.00"), valorReajustado);
    }
}
