package pl.blackslu.pp5.creditcard;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal limit;
    public void assignLimit(BigDecimal initialLimit){
        limit = initialLimit;

    }
    public BigDecimal limit(){
        return limit;
    }
}
