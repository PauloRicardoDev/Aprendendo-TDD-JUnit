package br.com.paulo.Enums;

import java.math.BigDecimal;

public enum Desempenho {

    REGULAR {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.0");
        }
    },
    BOM {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.10");
        }
    },
    EXCELENTE{
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.20");
        }
    };
    public abstract BigDecimal percentualReajuste();

}
