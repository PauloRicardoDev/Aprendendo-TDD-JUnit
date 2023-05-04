package br.com.paulo.Service;

import br.com.paulo.Enums.Desempenho;
import br.com.paulo.Model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajustePorDesempenhoService {

    public BigDecimal reajuste(Desempenho desempenho, Funcionario funcionario) {
        BigDecimal valorFinal = BigDecimal.valueOf(0);

        if (desempenho.equals(Desempenho.REGULAR)){
            valorFinal = funcionario.getSalario().add(Desempenho.REGULAR.percentualReajuste());
        }

        else if (desempenho.equals(Desempenho.BOM)){
            if (funcionario.getSalario().compareTo(Desempenho.BOM.salarioMaximoParaReajuste()) == -1){
                valorFinal = funcionario.getSalario().add(funcionario.getSalario()
                        .multiply(Desempenho.BOM.percentualReajuste()));
            }
            else {
                valorFinal = funcionario.getSalario();
            }
        }

        else if(desempenho.equals(Desempenho.EXECELENTE)){
            if (funcionario.getSalario().compareTo(Desempenho.EXECELENTE.salarioMaximoParaReajuste()) == -1) {
                valorFinal = funcionario.getSalario().add(funcionario.getSalario().
                        multiply(Desempenho.EXECELENTE.percentualReajuste()));
            }
            else {
                valorFinal = funcionario.getSalario();
            }
        }
        return valorFinal.setScale(2, RoundingMode.HALF_UP);
    }
}
