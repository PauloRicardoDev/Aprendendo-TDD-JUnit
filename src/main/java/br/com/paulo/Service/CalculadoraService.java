package br.com.paulo.Service;
import br.com.paulo.Enums.TipoDeOperacao;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraService {

    public BigDecimal calcular(TipoDeOperacao tipoDeOperacao, BigDecimal a, BigDecimal b){
        BigDecimal resultado = BigDecimal.valueOf(0);
        if (tipoDeOperacao.equals(TipoDeOperacao.SOMA)){
            return resultado = a.add(b);
        }
        else if (tipoDeOperacao.equals(TipoDeOperacao.SUBTRACAO)){
            return resultado = a.subtract(b);
        }
        else if (tipoDeOperacao.equals(TipoDeOperacao.MULTIPLICACAO)){
            return resultado = a.multiply(b);
        }
        else if (tipoDeOperacao.equals(TipoDeOperacao.DIVISAO)){
            return resultado = a.divide(b);
        }
        return resultado.setScale(2, RoundingMode.HALF_UP);
    }

}
