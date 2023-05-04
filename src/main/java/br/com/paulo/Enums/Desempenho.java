package br.com.paulo.Enums;

import java.math.BigDecimal;

public enum Desempenho {

    REGULAR {
        @Override
        public BigDecimal salarioMaximoParaReajuste() {
            return new BigDecimal("0.0");
        }

        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.0");
        }
    },
    BOM {
        @Override
        public BigDecimal salarioMaximoParaReajuste() {
            return new BigDecimal("7000.00");
        }
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.10");
        }
    },
    EXECELENTE{
        @Override
        public BigDecimal salarioMaximoParaReajuste() {
            return new BigDecimal("10000.00");
        }
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.20");
        }
    };
    public abstract BigDecimal percentualReajuste();
    public abstract BigDecimal salarioMaximoParaReajuste();

}
