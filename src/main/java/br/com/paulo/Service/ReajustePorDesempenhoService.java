package br.com.paulo.Service;

import br.com.paulo.Enums.Desempenho;
import br.com.paulo.Model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajustePorDesempenhoService {
    public BigDecimal reajuste(Desempenho desempenho, Funcionario funcionario) {
        BigDecimal valorFinal = BigDecimal.valueOf(0);
        if (desempenho.equals(Desempenho.REGULAR)){
            valorFinal = funcionario.getSalario().add(new BigDecimal("0"));
        }
        else if (desempenho.equals(Desempenho.BOM)){
            valorFinal = funcionario.getSalario().add(funcionario.getSalario().multiply(new BigDecimal("0.10")));
        }
        else if(desempenho.equals(Desempenho.EXCELENTE)){
            valorFinal = funcionario.getSalario().add(funcionario.getSalario().multiply(new BigDecimal("0.20")));
        }
        return valorFinal.setScale(2, RoundingMode.HALF_UP);

    }
}
